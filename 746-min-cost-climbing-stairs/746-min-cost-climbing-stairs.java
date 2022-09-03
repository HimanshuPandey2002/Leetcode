class Solution {
//     int[] dp;
    
//     public int minCostClimbingStairs(int[] cost) {
//         int n = cost.length;
//         dp = new int[n+1];
//         Arrays.fill(dp, -1);
//         return Math.min(minCost(cost, n-1), minCost(cost, n-2));
//     }
    
//     public int minCost(int[] cost, int n){
//         if(n <= 1) return cost[n];
//         if(dp[n] != -1) return dp[n];
//         return dp[n] = cost[n] + Math.min(minCost(cost, n-1), minCost(cost, n-2));
//     }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        
        for(int i = 0; i < n; i++){
            if(i < 2) dp[i] = cost[i];
            else dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        return Math.min(dp[n-1], dp[n-2]);
    }
}