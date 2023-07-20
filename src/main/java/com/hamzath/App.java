package com.hamzath;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien alObj = new Alien();
        alObj.setAid(101);
        alObj.setAname("Hamzath");
        alObj.setColor("Red");


        save(alObj)
    }
}
