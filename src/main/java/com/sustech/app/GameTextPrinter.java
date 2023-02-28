package com.sustech.app;
import java.util.HashMap;
import java.util.Scanner;

public class GameTextPrinter {
    // public String curThingy = "t0ip1";
    private Scanner myObj = new Scanner(System.in); // Create a Scanner object
    public void printText(HashMap<String, String> theHashMap) {
        System.out.println(theHashMap.get("text"));
    }
    public void printOptions(HashMap<String, String> theHashMap) {
        int choicesNum = Integer.parseInt(theHashMap.get("choicesnum"));
        for (int i = 1; i <= choicesNum; i++) {
            System.out.println(("Choice " + i + ": ") + theHashMap.get("choice" + i));
        }
    }
    public String printTextAndOptions(HashMap<String, String> theHashMap) {
        printText(theHashMap);
        printOptions(theHashMap);
        System.out.print("Enter your choice: ");
        String choice = myObj.next();
        String nextVal = theHashMap.get("nextval" + choice);
        clearScreen();
        return nextVal;
    }
    public String handleChoice(HashMap<String, String> theHashMap, String choice) {
        String nextVal = theHashMap.get("nextval" + choice);
        System.out.println(nextVal);
        return nextVal;
    }
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}