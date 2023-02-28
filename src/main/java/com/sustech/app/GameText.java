package com.sustech.app;
import java.util.HashMap;

public class GameText {
    // String currVal = "g0ip1";
    public HashMap<String, HashMap> thehashmaps = new HashMap<>();
    public HashMap<String, String> g0ip1 = new HashMap<>();
    public HashMap<String, String> g0ip2 = new HashMap<>();
    public HashMap<String, String> g0ip3 = new HashMap<>();
    public HashMap<String, String> g1gp1 = new HashMap<>();
    public HashMap<String, String> g1gp2 = new HashMap<>();
    public HashMap<String, String> g1gp3 = new HashMap<>();
    public HashMap<String, String> g2gp1 = new HashMap<>();
    public static HashMap<String, String> gameover = new HashMap<>();
    public static HashMap<String, String> gameovergp1g1 = new HashMap<>();
    public static HashMap<String, String> gameovergp1g2 = new HashMap<>();
    public static HashMap<String, String> gameovergp1g3 = new HashMap<>();
    public void initVals() {
        // g0ip1
        g0ip1.put("text","You wake up in a dark room. You can't remember anything. You see a door in front of you. What do you do?");
        g0ip1.put("choicesnum","2");
        g0ip1.put("choice1","Get up and open the door");
        g0ip1.put("choice2","Go Back to Sleep");
        g0ip1.put("nextval1","g0ip2");
        g0ip1.put("nextval2","gameover");
        // g0ip2
        g0ip2.put("text","You open the door. You realize you are in a maze. What do you do?");
        g0ip2.put("choicesnum","3");
        g0ip2.put("choice1","Walk Left");
        g0ip2.put("choice2","Walk Right");
        g0ip2.put("choice3","Go Back to Sleep");
        g0ip2.put("nextval1","g0ip3");
        g0ip2.put("nextval2","g1gp1");
        g0ip2.put("nextval3","gameover");
        // g0ip3
        g0ip3.put("text", "You walk left. You see an Emergency Exit. What do you do?");
        g0ip3.put("choicesnum","2");
        g0ip3.put("choice1","Go through the Emergency Exit");
        g0ip3.put("choice2","Turn around and go where right would have taken you");
        g0ip3.put("nextval1","g2gp1");
        g0ip3.put("nextval2","g1gp1");
        // g1gp1
        g1gp1.put("text","You walk right. You keep walking for 5 hours and finally find an exit.\nWhen you go through the exit you find a loaf of BetterBread. What do you do?");
        g1gp1.put("choicesnum","2");
        g1gp1.put("choice1","Eat the BetterBread");
        g1gp1.put("choice2","Throw the BetterBread away");
        g1gp1.put("nextval1","g1gp2");
        g1gp1.put("nextval2","gameovergp1g1");
        // g1gp2
        g1gp2.put("text","You eat the BetterBread. You feel energized and you keep walking. You find a house. What do you do?");
        g1gp2.put("choicesnum","2");
        g1gp2.put("choice1","Go inside the house");
        g1gp2.put("choice2","Keep walking");
        g1gp2.put("nextval1","g1gp3");
        g1gp2.put("nextval2","gameovergp1g2");
        // g1gp3
        g1gp3.put("text","You go inside the house. You find a bomb. What do you do?");
        g1gp3.put("choicesnum","3");
        g1gp3.put("choice1","Defuse the bomb");
        g1gp3.put("choice2","Run away");
        g1gp3.put("choice3","Eat the bomb");
        g1gp3.put("nextval1", "g1gp4");
        g1gp3.put("nextval2", "gameovergp1g3");
        g1gp3.put("nextval3", "gameovergp1g3");
        // gameover
        gameover.put("text","Game Over");
        gameover.put("choice1","Start Over");
        gameover.put("choice2","Exit");
        gameover.put("nextval1","g0ip1");
        gameover.put("nextval2","exit");
        gameover.put("choicesnum","2");
        // gameovergp1g1
        gameovergp1g1.put("text","You throw the bread away. You realize you are hungry and you die of starvation. Game Over");
        gameovergp1g1.put("choice1","Start Over");
        gameovergp1g1.put("choice2","Exit");
        gameovergp1g1.put("nextval1","g0ip1");
        gameovergp1g1.put("nextval2","exit");
        gameovergp1g1.put("choicesnum","2");

        // gameovergp1g2
        gameovergp1g2.put("text","You keep walking. You realize that there was nothing past the house. You die of thirst. Game Over");
        gameovergp1g2.put("choice1","Start Over");
        gameovergp1g2.put("choice2","Exit");
        gameovergp1g2.put("nextval1","g0ip1");
        gameovergp1g2.put("nextval2","exit");
        gameovergp1g2.put("choicesnum","2");
        // gameovergp1g3
        gameovergp1g3.put("text","The bomb explodes. Game Over");
        gameovergp1g3.put("choice1","Start Over");
        gameovergp1g3.put("choice2","Exit");
        gameovergp1g3.put("nextval1","g0ip1");
        gameovergp1g3.put("nextval2","exit");
        gameovergp1g3.put("choicesnum","2");

        // add to thehashmaps
        // intro stuff
        thehashmaps.put("g0ip1",g0ip1);
        thehashmaps.put("g0ip2",g0ip2);
        thehashmaps.put("g0ip3",g0ip3);
        // main game stuff
        // story branch 1
        thehashmaps.put("g1gp1",g1gp1);
        thehashmaps.put("g1gp2",g1gp2);
        thehashmaps.put("g1gp3",g1gp3);
        // story branch 2
        thehashmaps.put("g2gp1",g2gp1);
        // gameover stuff
        thehashmaps.put("gameover",gameover);
        thehashmaps.put("gameovergp1g1",gameovergp1g1);
        thehashmaps.put("gameovergp1g2",gameovergp1g2);
        thehashmaps.put("gameovergp1g3",gameovergp1g3);
    }
    
    // g0ip1.put("","");
}