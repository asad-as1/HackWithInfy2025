import java.util.*;

class MaximumEvents {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        int maxDay = 0;
        for (int[] event : events) {
            maxDay = Math.max(maxDay, event[1]);
        }

        TreeSet<Integer> availableDays = new TreeSet<>();
        for (int day = 1; day <= maxDay; day++) {
            availableDays.add(day);
        }

        int count = 0;
        for (int[] event : events) {
            Integer possibleDay = availableDays.ceiling(event[0]);
            if (possibleDay != null && possibleDay <= event[1]) {
                availableDays.remove(possibleDay);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MaximumEvents solution = new MaximumEvents();
        int[][] events = {{1, 2}, {2, 3}, {3, 4}, {1, 2}};
        System.out.println(solution.maxEvents(events)); // Output: 4
    }
}
