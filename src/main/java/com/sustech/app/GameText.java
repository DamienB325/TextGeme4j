package com.sustech.app;
import java.util.HashMap;

public class GameText {
    // String currVal = "t0ip1";
    public HashMap<String, HashMap> thehashmaps = new HashMap<>();
    public static HashMap<String, String> t0ip1 = new HashMap<>();
    public static HashMap<String, String> t0ip2 = new HashMap<>();
    public static HashMap<String, String> gameover = new HashMap<>();
    public void initVals() {
        // t0ip1
        t0ip1.put("text","You wake up in a dark room. You can't remember anything. You see a door in front of you. What do you do?");
        t0ip1.put("choicesnum","2");
        t0ip1.put("choice1","Get up and open the door");
        t0ip1.put("choice2","Go Back to Sleep");
        t0ip1.put("nextval1","t0ip2");
        t0ip1.put("nextval2","gameover");
        // t0ip2
        t0ip2.put("text","You open the door. You see a hallway with two ways to walk. What do you do?");
        t0ip2.put("choicesnum","3");
        t0ip2.put("choice1","Walk Left.");
        t0ip2.put("choice2","Walk Right.");
        t0ip2.put("choice3","Go Back to Sleep");
        t0ip2.put("nextval1","t0ip3");
        t0ip2.put("nextval2","t1gp1");
        t0ip2.put("nextval3","gameover");
        gameover.put("text","Game Over");
        gameover.put("choice1","Start Over");
        gameover.put("choice2","Exit");
        gameover.put("nextval1","t0ip1");
        gameover.put("nextval2","exit");
        gameover.put("choicesnum","2");
        thehashmaps.put("t0ip1",t0ip1);
        thehashmaps.put("t0ip2",t0ip2);
        thehashmaps.put("gameover",gameover);
    }
    
    // t0ip1.put("","");
}