class Solution {
    int[] dp;
    
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return Math.min(minCost(cost, n-1), minCost(cost, n-2));
    }
    
    public int minCost(int[] cost, int n){
        if(n <= 1) return cost[n];
        if(dp[n] != -1) return dp[n];
        
        return dp[n] = cost[n] + Math.min(minCost(cost, n-1), minCost(cost, n-2));
    }
}