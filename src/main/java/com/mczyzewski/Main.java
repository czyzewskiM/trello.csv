package com.mczyzewski;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String inputJSONFilePath = null;
        try {
            inputJSONFilePath = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.format("Input json file expected");
            System.exit(1);
        }
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader fileReader = new FileReader(inputJSONFilePath);
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
            fileReader.close();
            //JSONArray cards = (JSONArray) jsonObject.get("cards");
            JSONArray actions = (JSONArray) jsonObject.get("actions");
            ObjectMapper om = new ObjectMapper();
            ArrayList<ActionObject> actionObjects = new ArrayList<>();
            actions.forEach(action -> {
                JSONObject obj = (JSONObject) action;
                try {
                    actionObjects.add(om.readValue(obj.toJSONString(), ActionObject.class));
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
