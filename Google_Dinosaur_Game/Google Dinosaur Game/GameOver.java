import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        hitDetection();
    }  
    
    public void hitDetection() {
        boolean stopped = false;
        if(isTouching(Cactii.class)) {
            Greenfoot.delay(1);
            setImage(new GreenfootImage("GameOver!!! Press Space to restart", 35, Color.BLACK, null));
            setLocation(getWorld().getWidth()/2, getWorld().getHeight()/2);
        }
       
    }
}
