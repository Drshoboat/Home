import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScore extends Actor
{
    /**
     * Act - do whatever the HighScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int hscore = 0;
    
    public void HighScore() {
        updateScore();
    }
    
    public void act() 
    {
        getHScore();
    }  
    
     public void addedToWorld(World world)
    {
        setImage(new GreenfootImage("High-Score : " + hscore, 27, new Color(8, 204, 93), null));
        setLocation(560,20);
    }
       
    UserInfo me = UserInfo.getMyInfo();
    public void getHScore() {
        
        if(me.getScore() > hscore) {
            hscore = me.getScore();
            //System.out.println("hello");
        }
        updateScore();
        //System.out.println("hscore " + hscore);
    }

    public void updateScore() {
        setImage(new GreenfootImage("High-Score : " + hscore, 27, new Color(8, 204, 93), null));
        setLocation(560,20);
    }
}
