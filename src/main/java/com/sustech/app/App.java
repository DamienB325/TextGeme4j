package com.sustech.app;

import java.util.HashMap;
import java.lang.reflect.*;
// import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) {
        GameText gameText = new GameText();
        GameTextPrinter gameTextPrinter = new GameTextPrinter();
        gameText.initVals();
        String currval = "g0ip1";
        HashMap<String, String> currhashmap = gameText.thehashmaps.get(currval);
        gameTextPrinter.clearScreen();
        currval = gameTextPrinter.printTextAndOptions(currhashmap);
        while(currval!="exit") {
            try {
                currhashmap = gameText.thehashmaps.get(currval);
                currval = gameTextPrinter.printTextAndOptions(currhashmap);
            } catch (Exception e) {
                System.out.println("Error: " + e);
                // System.out.println("Error: " + e.getMessage());
                currval = "exit";
            }
        }
        // System.out.println( "Hello World!" );
        // System.out.println(System.getProperty("java.version"));
    }
}
