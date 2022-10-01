class Solution {
    int dp[];
    
    public int numDecodings(String s) {
        dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return solve(0, s);
    }
    
    public int solve(int ind, String s){
        if(ind == s.length()) return 1;
        if(s.charAt(ind) == '0') return 0;
        
        if(dp[ind] != -1) return dp[ind];
        
        int one = solve(ind+1, s);
        int two = 0;
        
        if(ind < s.length()-1 && Integer.parseInt(s.substring(ind, ind+2)) <= 26)
            two = solve(ind + 2, s);
        
        return dp[ind] = one + two;
    }
}