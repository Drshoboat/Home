import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.lang.Math;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     *
     */

    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1, false);

        prepare();

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MemeDinoBoi memeDinoBoi = new MemeDinoBoi();
        //Cactii cactii = new Cactii();
        addObject(memeDinoBoi, 99, getHeight()/2);
        addObject(new Cactii(), 850, getHeight()/2);
        addObject(new Cactii(), 900, getHeight()/2);
    }

    public void act(){
        if(getObjects(Cactii.class).get(0).getX() < -100) {
            removeObjects(getObjects(Cactii.class));
            for(int i = 0; i < (int)(Math.random() * 2) + 2; i++){
                addObject(new Cactii(), (int)(Math.random()* 300) + 850, getHeight()/2);
            }
        }
    }


}
