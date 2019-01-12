import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
<<<<<<< HEAD
    public void act() 
    {
        
    }  
    

=======
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        act();
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("space")) {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new MyWorld());
        }
    }
>>>>>>> dbdf678efb896de9b938f44cf850a0a0edfdcd9e
}
