class Solution {
    int[] dp;
    
    public int fib(int n) {
        if(n <= 1)
            return n;
        
        dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        return findFib(n);
    }
    
    private int findFib(int n){
        if(n <= 1)
            return n;
        return dp[n] = findFib(n-1) + findFib(n-2);
    }
}