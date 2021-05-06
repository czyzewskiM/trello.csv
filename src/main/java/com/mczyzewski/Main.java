package com.mczyzewski;

import org.json.simple.parser.JSONParser;

public class Main {

    public static void main(String[] args) {
        String inputJSONFileName = null;
        try {
            inputJSONFileName = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.format("Input json file expected");
            System.exit(1);
        }
        System.out.format(inputJSONFileName);
        JSONParser jsonParser = new JSONParser();
    }
}
