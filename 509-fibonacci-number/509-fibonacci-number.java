class Solution {
    // int[] dp;
    
    public int fib(int n) {
        return (n <= 1) ? n : fib(n-1) + fib(n-2);
    }
    
    // private int findFib(int n){
    //     if(n <= 1)
    //         return n;
    //     return dp[n] = findFib(n-1) + findFib(n-2);
    // }
}