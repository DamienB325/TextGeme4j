package com.sustech.app;

public class App 
{
    public static void main( String[] args )
    {
        GameText gameText = new GameText();
        GameTextPrinter gameTextPrinter = new GameTextPrinter();
        gameText.initVals();
        gameTextPrinter.printTextAndOptions(GameText.t0ip1);
        String currval = gameTextPrinter.printTextAndOptions(ReflectUtils.getValueOf(gameText, currval));
        while(currval!="gameover"){
            currval = gameTextPrinter.printTextAndOptions(ReflectUtils.getValueOf(gameText, currval));
        }
        // System.out.println( "Hello World!" );
        // System.out.println(System.getProperty("java.version"));
    }
}
