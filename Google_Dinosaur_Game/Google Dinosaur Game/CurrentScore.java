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
    private UserInfo player;

    public void CurrentScore() {
        if (UserInfo.isStorageAvailable()) {
            if (UserInfo.getMyInfo() != null) {
                player = UserInfo.getMyInfo();
            }
        }
        updateScore();
    }

    public void act() 
    {
        whatsDaScore();//29
    }   

    public void addedToWorld(World world)
    {
        setImage(new GreenfootImage("Score : " + score, 27, new Color(8, 204, 93), null));
        setLocation(710,20);
    }

    public void whatsDaScore() {
        score = 0;
        long start = System.nanoTime() / 10000;
        long end = (System.nanoTime() / 10000)  - start;
        score += (int)end;
        player.setScore(score);//43
        player.store();
        updateScore();

    }

    public void updateScore() {
        setImage(new GreenfootImage("Score : " + score, 27, new Color(8, 204, 93), null));
        setLocation(710,20);
    }

}
