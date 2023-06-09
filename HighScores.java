import java.util.*;

public class HighScores implements java.io.Serializable{
    private ArrayList<UserScore> highScores;

    public HighScores(){
        // If arraylist already exists in file, get it
        // If not, create new
        highScores = new ArrayList<UserScore>();
    }

    public void addUser(UserScore u){
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

    public UserScore getUser(int index) {
        return highScores.get(index);
    }

    public String toString() {
        String toString = "";
        for (int i = 0; i <highScores.size(); i++){
            toString += ("Rank " + (i+1) + ": " + highScores.get(i).toString() + "\n");
        }
        return toString;
    }
}


