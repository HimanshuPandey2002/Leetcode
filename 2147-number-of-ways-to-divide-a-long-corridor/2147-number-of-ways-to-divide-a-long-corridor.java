class Solution {
    final int MOD = (int)1e9 + 7;
    int[][] dp;
    
    public int numberOfWays(String corridor) {
        dp = new int[corridor.length() + 1][3];
        
        for(int[] arr: dp)
            Arrays.fill(arr, -1);
        
        return solve(corridor, 0, 0);
    }
    
    public int solve(String s, int ind, int cnt){
        if(ind >= s.length()) return cnt == 2 ? 1 : 0;
        
        if(dp[ind][cnt] != -1) return dp[ind][cnt];
        
        if(cnt == 2) {  
            if(s.charAt(ind) == 'P')
                return dp[ind][cnt] = (solve(s, ind + 1, 0) % MOD + solve(s, ind + 1, cnt) % MOD) % MOD;
            else
                return dp[ind][cnt] = solve(s, ind + 1, 1) % MOD;
        }
        
        return dp[ind][cnt] = solve(s, ind + 1, cnt + (s.charAt(ind) == 'S' ? 1 : 0)) % MOD;
    }
}