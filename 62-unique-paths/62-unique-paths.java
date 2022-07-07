class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                dp[i][j] = -1;
        
        return countPaths(0, 0, n, m, dp);
    }
    
    public int countPaths(int i, int j, int n, int m, int[][] dp){
        if((i >= n) || (j >= m)) return 0;
        if((i == n-1) && (j == m-1)) return 1;
        
        if(dp[i][j] != -1) return dp[i][j];
        else return dp[i][j] = countPaths(i+1, j, n, m, dp) + countPaths(i, j+1, n, m, dp);
    }
}