package com.sustech.app;
import java.util.HashMap;

public class GameText {
    // String currVal = "t0ip1";
    public static HashMap<String, String> t0ip1 = new HashMap<>();
    public static HashMap<String, String> gameover = new HashMap<>();
    public void initVals() {
        t0ip1.put("text","susgus");
        t0ip1.put("nextval","t0ip2");
        t0ip1.put("choicesnum","2");
        t0ip1.put("choice1","Hamburger");
        t0ip1.put("choice2","Hambruger");
        t0ip1.put("nextval1","t0ip2");
        t0ip1.put("nextval1","gameover");
        gameover.put("text","Game Over");
        gameover.put("nextval","t0ip1");
        gameover.put("choicesnum","0");

    }
    
    // t0ip1.put("","");
}