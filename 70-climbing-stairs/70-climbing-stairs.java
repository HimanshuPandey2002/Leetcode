class Solution {
    public int climbStairs(int n) {
        if(n <= 1) return 1;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return climb( n, dp);
    }
    
    public int climb(int n, int[] dp){
        if(n <= 1) return 1;
        
        if(dp[n] != -1)
            return dp[n];
        
        return dp[n] = climb(n-1, dp) + climb(n-2, dp);
    }
}