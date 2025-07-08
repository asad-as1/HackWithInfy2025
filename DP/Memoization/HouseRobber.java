class Solution {
    public static int rob(int[] nums) {
        int n = nums.length;
        Integer dp[] = new Integer[n];
        return Math.max(find(nums, 0, dp), find(nums, 1, dp));
    }

    public static  int find(int nums[], int i, Integer dp[]) {
        if(i >= nums.length) return 0;

        if(dp[i] != null) return dp[i];

        int a = find(nums, i+2, dp) + nums[i];
        int b = find(nums, i+1, dp);

        return dp[i] = Math.max(a, b);
    }

    public static void main(String[] args) {
        // Solution sol = new Solution();
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(rob(nums)); 
    }
}