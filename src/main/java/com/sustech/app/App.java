package com.sustech.app;

public class App 
{
    public static void main( String[] args )
    {
        GameText gameText = new GameText();
        gameText.initVals();
        
        System.out.println( "Hello World!" );
        System.out.println(System.getProperty("java.version"));
    }
}
