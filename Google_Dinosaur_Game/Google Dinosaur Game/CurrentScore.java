import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;
/**
 * Write a description of class CurrentScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CurrentScore extends Actor
{
    /**
     * Act - do whatever the CurrentScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int score = 0;
    
    public void CurrentScore() {
        updateScore();
    }
    
    public void act() 
    {
        addScore();
    }   
    
    public void addedToWorld(World world)
    {
        setImage(new GreenfootImage("Score : " + score, 27, new Color(255,100,60), null));
        setLocation(710,20);
    }
    
    public void addScore() {
        long start = System.nanoTime() / 10000;
        long end = (System.nanoTime() / 10000)  - start;
        score += (int)end;
        updateScore();
    }
    
    public void updateScore() {
        setImage(new GreenfootImage("Score : " + score, 27, new Color(255,100,60), null));
        setLocation(710,20);
    }
   
}
