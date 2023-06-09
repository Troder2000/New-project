import java.util.*;

public class UserScore implements java.io.Serializable {
    private String name;
    private int score;

    public UserScore(String name, int score) 
    {
        this.name = name;
        this.score = score;
    }
    public int getScore() 
    {
        return score;
    }
    public String getName() 
    {
        return name;
    }
    public String toString() 
    {
        return "\"" + name + "\" with " + score + " points.";
    }
}