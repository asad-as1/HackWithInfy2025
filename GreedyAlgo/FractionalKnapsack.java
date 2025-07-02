import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        // Each item: {value, weight}
        int[][] items = {
            {60, 10},
            {100, 20},
            {120, 30}
        };
        int capacity = 50;

        // Sort by value/weight ratio in descending order
        Arrays.sort(items, (a, b) -> 
            Double.compare((double) b[0] / b[1], (double) a[0] / a[1])
        );

        double totalValue = 0.0;

        for (int[] item : items) {
            int value = item[0];
            int weight = item[1];

            if (capacity >= weight) {
                capacity -= weight;
                totalValue += value;
            } else {
                totalValue += value * ((double) capacity / weight);
                break;
            }
        }

        System.out.printf("Maximum value: %.2f\n", totalValue);
    }
}
