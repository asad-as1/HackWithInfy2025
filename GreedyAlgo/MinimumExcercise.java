import java.util.Arrays;

public class MinimumExcercise {

    public static int minimumExercises(int[] excer, int k) {
        int n = excer.length;
        int count = 0;
        // int i = n-1;

        Arrays.sort(excer);
        for(int i=n-1; i>=0; i--) {
            int j = 0;
            while(j < 2) {
                k -= excer[i];
                count++;
                j++;
                if(k <= 0) return count;
            }
            if(k <= 0) return count;
        }

        return k > 0 ? -1 : count;
    }
    public static void main(String[] args) {
        int[] excer = {1, 2};
        int k = 10;
        System.out.println(minimumExercises(excer, k)); // Output: -1
    }
}
