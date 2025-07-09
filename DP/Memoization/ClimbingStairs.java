package HackWithInfy2025.DP.Memoization;

public class ClimbingStairs {
    static Integer dp[];
    public static void main(String[] args) {
        int n = 4;
        dp = new Integer[n + 1];
        System.out.println(find(n));
    }

    public static int find(int n) {
        if(n < 0) return 0;
        if(n == 0 || n == 1) return 1;

        if(dp[n] != null) return dp[n];

        int a = find(n-1);
        int b = find(n-2);
        return dp[n] = a + b;
    }
}
