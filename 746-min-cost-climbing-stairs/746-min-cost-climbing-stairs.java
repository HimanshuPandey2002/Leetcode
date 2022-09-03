class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        
        for(int i = 0; i < n; i++)
            dp[i] = (i < 2) ? cost[i] : cost[i] + Math.min(dp[i-1], dp[i-2]);

        return Math.min(dp[n-1], dp[n-2]);
    }
}