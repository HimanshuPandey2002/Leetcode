class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        dp[0] = arr[0];
        
        for(int i = 1; i < n; i++){
            int take = arr[i];
            
            if(i > 1)
                take += dp[i-2];
                
            int not = dp[i-1];
            dp[i] = Math.max(take, not);
        }
        return dp[n-1];
    }
}