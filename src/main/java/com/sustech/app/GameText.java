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
    public HashMap<String, String> g1gp4 = new HashMap<>();
    public HashMap<String, String> g1gp5 = new HashMap<>();
    public HashMap<String, String> g1gp6 = new HashMap<>();
    public HashMap<String, String> g2gp1 = new HashMap<>();
    public HashMap<String, String> g3gp1 = new HashMap<>();
    public HashMap<String, String> g3gp2 = new HashMap<>();
    public HashMap<String, String> g3gp3 = new HashMap<>();
    public HashMap<String, String> g3gp4 = new HashMap<>();
    public HashMap<String, String> g4gp1 = new HashMap<>();
    public HashMap<String, String> g4gp2 = new HashMap<>();
    public HashMap<String, String> g4gp3 = new HashMap<>();
    public HashMap<String, String> g4gp4 = new HashMap<>();
    public HashMap<String, String> g4gp5 = new HashMap<>();
    public HashMap<String, String> g4gp6 = new HashMap<>();
    public static HashMap<String, String> gameover = new HashMap<>();
    public static HashMap<String, String> gameovergp1g1 = new HashMap<>();
    public static HashMap<String, String> gameovergp1g2 = new HashMap<>();
    public static HashMap<String, String> gameovergp1g3 = new HashMap<>();
    public static HashMap<String, String> gameovergp1g4 = new HashMap<>();
    public static HashMap<String, String> youwin = new HashMap<>();
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
        // g1gp4
        g1gp4.put("text","You defuse the bomb. You wi- You walk inside of a room. You find 10 clones of yourself. What do you do?");
        g1gp4.put("choicesnum","2");
        g1gp4.put("choice1","Kill all of the clones");
        g1gp4.put("choice2","Have an existential crisis");
        g1gp4.put("nextval1","gameovergp1g4");
        g1gp4.put("nextval2","g1gp5");
        // g1gp5
        g1gp5.put("text","You finish your existential crisis. You walk outside and find a portal. What do you do?");
        g1gp5.put("choicesnum","2");
        g1gp5.put("choice1","Go through the portal");
        g1gp5.put("choice2","Go back inside the house");
        g1gp5.put("nextval1","g3gp1");
        g1gp5.put("nextval2","g1gp6");
        // g1gp6
        g1gp6.put("text","You go back inside the house. You live in the house forever.\nYou wi- You discover that you are in a simulation. What do you do?");
        g1gp6.put("choicesnum","1");
        g1gp6.put("choice1","Die of old age");
        g1gp6.put("nextval1","gameover");
        // g2gp1
        g2gp1.put("text","You go through the Emergency Exit. You find a portal. What do you do?");
        g2gp1.put("choicesnum","2");
        g2gp1.put("choice1","Go through the portal");
        g2gp1.put("choice2","Go back inside the maze");
        g2gp1.put("nextval1","g3gp1");
        g2gp1.put("nextval2","g0ip3");
        // g3gp1
        g3gp1.put("text","You go through the portal. You find a alternate version of THE house. What do you do?");
        g3gp1.put("choicesnum","2");
        g3gp1.put("choice1","Go inside the house");
        g3gp1.put("choice2","Go back through the portal");
        g3gp1.put("nextval1","g3gp2");
        g3gp1.put("nextval2","g2gp1");
        // g3gp2
        g3gp2.put("text","You go inside the house. You find a stack of paper. What do you do?");
        g3gp2.put("choicesnum","5");
        g3gp2.put("choice1","Read the first sheet of paper in the stack");
        g3gp2.put("choice2","Throw the paper away");
        g3gp2.put("choice3","Eat the paper");
        g3gp2.put("choice4","Burn the paper");
        g3gp2.put("choice5","Read every sheet of paper in the stack");
        g3gp2.put("nextval1","g3gp3");
        g3gp2.put("nextval2","gameovergp3g1");
        g3gp2.put("nextval3","gameovergp3g1");
        g3gp2.put("nextval4","gameovergp3g1");
        g3gp2.put("nextval5","g4gp1");
        // g3gp3
        g3gp3.put("text","You read the paper. It says \"You are in a simulation. What do you do?\"");
        g3gp3.put("choicesnum","1");
        g3gp3.put("choice1","Press THE button");
        g3gp3.put("nextval1","g3gp4");
        // g3gp4
        g3gp4.put("text","You press THE button. You wake up outside of the simulation. What do you do?");
        g3gp4.put("choicesnum","1");
        g3gp4.put("choice1","Realize that you won");
        g3gp4.put("nextval1","youwin");
        // g4gp1
        g4gp1.put("text","You read every sheet of paper in the stack. You find out that reality is a simulation and that the physics of the simulation are broken. What do you do?");
        g4gp1.put("choicesnum","3");
        g4gp1.put("choice1","Press THE button");
        g4gp1.put("choice2","Abuse the physics of the simulation");
        g4gp1.put("choice3","Your head explodes because you have too much knowledge");
        g4gp1.put("nextval1","g3gp4");
        g4gp1.put("nextval2","g4gp2");
        g4gp1.put("nextval3","gameovergp4g1");
        // g4gp2
        g4gp2.put("text","You abuse the physics of the simulation. \nEventually the simulations physics completely break and gravity is inverted. What do you do?");
        g4gp2.put("choicesnum","1");
        g4gp2.put("choice1","Press THE button");
        g4gp2.put("nextval1","g4gp3");
        // g4gp3
        g4gp3.put("text","You press THE button. It doesn't do anything. What do you do?");
        g4gp3.put("choicesnum","1");
        g4gp3.put("choice1","Press THE button again");
        g4gp3.put("nextval1","g4gp4");
        // g4gp4
        g4gp4.put("text","You press THE button again. It doesn't do anything. What do you do?");
        g4gp4.put("choicesnum","1");
        g4gp4.put("choice1","Press THE button again");
        g4gp4.put("nextval1","g4gp5");
        // g4gp5
        g4gp5.put("text","You press THE button again. It doesn't do anything. What do you do?");
        g4gp5.put("choicesnum","2");
        g4gp5.put("choice1","Press THE button again");
        g4gp5.put("choice2","Get bored of pressing the button");
        g4gp5.put("nextval1","g4gp5");
        g4gp5.put("nextval2","g4gp6");
        // g4gp6
        g4gp6.put("text","You get bored of pressing the button. You go back inside the house. You live in the house forever.\nYou wi- You die of old age. Game Over");
        g4gp6.put("choicesnum","2");
        g4gp6.put("choice1","Start Over");
        g4gp6.put("choice2","Exit");
        g4gp6.put("nextval1","g0ip1");
        g4gp6.put("nextval2","exit");

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

        // gameovergp1g4
        gameovergp1g4.put("text","After killing them all, 10 more clones appear and kill you. Game Over");
        gameovergp1g4.put("choice1","Start Over");
        gameovergp1g4.put("choice2","Exit");
        gameovergp1g4.put("nextval1","g0ip1");
        gameovergp1g4.put("nextval2","exit");
        gameovergp1g4.put("choicesnum","2");
        // youwin
        youwin.put("text","You win!");
        youwin.put("choicesnum","2");
        youwin.put("choice1","Start Over");
        youwin.put("choice2","Exit");
        youwin.put("nextval1","g0ip1");
        youwin.put("nextval2","exit");
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
        thehashmaps.put("g1gp4",g1gp4);
        thehashmaps.put("g1gp5",g1gp5);
        // story branch 2
        thehashmaps.put("g2gp1",g2gp1);
        // story branch 3
        thehashmaps.put("g3gp1", g3gp1);
        thehashmaps.put("g3gp2", g3gp2);
        thehashmaps.put("g3gp3", g3gp3);
        thehashmaps.put("g3gp4", g3gp4);
        // story branch 4
        thehashmaps.put("g4gp1", g4gp1);
        thehashmaps.put("g4gp2", g4gp2);
        thehashmaps.put("g4gp3", g4gp3);
        thehashmaps.put("g4gp4", g4gp4);
        thehashmaps.put("g4gp5", g4gp5);
        thehashmaps.put("g4gp6", g4gp6);
        // gameover stuff
        thehashmaps.put("gameover",gameover);
        thehashmaps.put("gameovergp1g1",gameovergp1g1);
        thehashmaps.put("gameovergp1g2",gameovergp1g2);
        thehashmaps.put("gameovergp1g3",gameovergp1g3);
        thehashmaps.put("gameovergp1g3",gameovergp1g4);
        thehashmaps.put("youwin",youwin);
    }
    
    // g0ip1.put("","");
}