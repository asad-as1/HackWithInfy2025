package HackWithInfy2025.DP.Tabulation;
import java.util.*;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;  
        
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    // i - coin bcoz it tell us, coin is present in nums. By - it gives 0 index and min coin is 1 if coin is present in nums 
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        CoinChange obj = new CoinChange();
        int[] coins = {1, 5, 6, 9};
        int amount = 11;
        System.out.println(obj.coinChange(coins, amount));  
    }
}
