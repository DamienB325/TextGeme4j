package com.sustech.app;
import java.util.HashMap;

public class GameText {
    // String currVal = "t0ip1";
    public HashMap<String, HashMap> thehashmaps = new HashMap<>();
    public static HashMap<String, String> t0ip1 = new HashMap<>();
    public static HashMap<String, String> gameover = new HashMap<>();
    public void initVals() {
        t0ip1.put("text","You wake up in a dark room. You can't remember anything. You see a door in front of you. What do you do?");
        t0ip1.put("nextval","t0ip2");
        t0ip1.put("choicesnum","2");
        t0ip1.put("choice1","Get up and open the door");
        t0ip1.put("choice2","Go Back to Sleep");
        t0ip1.put("nextval1","t0ip2");
        t0ip1.put("nextval2","gameover");
        gameover.put("text","Game Over");
        gameover.put("choice1","Start Over");
        gameover.put("choice2","Exit");
        gameover.put("nextval1","t0ip1");
        gameover.put("nextval2","exit");
        gameover.put("choicesnum","2");
        thehashmaps.put("t0ip1",t0ip1);
        thehashmaps.put("gameover",gameover);
    }
    
    // t0ip1.put("","");
}