package com.mczyzewski;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mczyzewski.model.AwesomeCard;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        JSONObject jsonObject;
        try {
            FileReader fileReader = new FileReader(inputJSONFilePath);
            jsonObject = (JSONObject) jsonParser.parse(fileReader);
            fileReader.close();
        } catch (IOException | ParseException e) {
            jsonObject = null;
            e.printStackTrace();
            System.err.format("Error during json file parsing");
            System.exit(1);
        }
        if (jsonObject != null) {
            JSONArray cards = (JSONArray) jsonObject.get("cards");
//            JSONArray actions = (JSONArray) jsonObject.get("actions");
            ObjectMapper om = new ObjectMapper();
            ArrayList<AwesomeCard> cardsList = new ArrayList<>();
//            ArrayList<ActionObject> actionObjects = new ArrayList<>();
//            actions.forEach(action -> {
//                JSONObject obj = (JSONObject) action;
//                try {
//                    ActionObject temp = om.readValue(obj.toJSONString(), ActionObject.class);
//                    actionObjects.add(temp);
//                } catch (JsonProcessingException e) {
//                    e.printStackTrace();
//                }
//            });
            cards.forEach(card -> {
                JSONObject obj = (JSONObject) card;
                try {
                    cardsList.add(om.readValue(obj.toJSONString(), AwesomeCard.class));
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            });
            List<String> data = new ArrayList<>();
            data.add("id;name;desc;idList;idBoard;url;shortUrl;dateLastActivity;closed");
            data.addAll(cardsList.stream().map(AwesomeCard::toString).collect(Collectors.toList()));
            File csvOutputFile = new File("Cards.csv");
            try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
                data.forEach(pw::println);
                pw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
