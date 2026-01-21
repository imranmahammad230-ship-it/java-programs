import java.util.List;
import java.util.ArrayList;

public class CricketScores {public static void main(String[] args) {
List<Integer> scores = new ArrayList<>();

scores.add(1);
scores.add(4);
scores.add(0);
scores.add(6);
        scores.add(4);
        scores.add(1);

        System.out.println("Ball-by-ball scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
