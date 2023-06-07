import java.util.*;

public class HighScores {
    private ArrayList<UserScore> highScores;

    public HighScores(){
        highScores = new ArrayList<UserScore>();
    }

    public void addScore(UserScore u){
        int i = 0;
        for (i = 0; i <highScores.size(); i++){
            if (u.getScore() > highScores.get(i).getScore()){
                break;
            }
        }
        highScores.add(i,u);

        if (highScores.size()> 10){
            highScores.remove(10);
        }

    }
    public String toString() {
        String toString = "";
        for (int i = 0; i <highScores.size(); i++){
            toString += ("Rank " + (i+1) + ": " + highScores.get(i).toString() + "\n");
        }
        return toString;
    }
}


