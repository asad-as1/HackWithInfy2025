import java.util.*;

public class ActivitySelectionProblem {
  public static void main(String[] args) {

    int activities[][] = {
        { 1, 3 },
        { 2, 4 },
        { 3, 5 },
        { 0, 6 },
        { 5, 7 },
        { 8, 9 }
    };
    
    Arrays.sort(activities, (a, b) -> a[1] - b[1]);
    int count = 1;
    int lastEnd = activities[0][0];
    for (int i = 1; i < activities.length; i++) {
      if (activities[i][0] >= lastEnd) {
        count++;
        lastEnd = activities[i][1];
      }
    }
    System.out.println(count);
  }
}