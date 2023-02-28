package com.sustech.app;

import java.util.HashMap;
import java.lang.reflect.*;
// import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) {
        GameText gameText = new GameText();
        GameTextPrinter gameTextPrinter = new GameTextPrinter();
        gameText.initVals();
        String currval = "t0ip1";
        
        currval = gameTextPrinter.printTextAndOptions(gameText.thehashmaps.get(currval));
        while(currval!="exit"){
            currval = gameTextPrinter.printTextAndOptions(gameText.thehashmaps.get(currval));
        }
        // System.out.println( "Hello World!" );
        // System.out.println(System.getProperty("java.version"));
    }
}
