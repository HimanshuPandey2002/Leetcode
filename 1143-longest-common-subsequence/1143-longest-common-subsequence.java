class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        int[][] ls = new int[n1+1][n2+1];
        
        for(int i = 0; i <= n1; i++){
            for(int j = 0; j <= n2; j++){
                if(i == 0 || j == 0)
                    ls[i][j] = 0;
                else if(text1.charAt(i-1) == text2.charAt(j-1))
                    ls[i][j] = ls[i-1][j-1]+1;
                else
                    ls[i][j] = Math.max(ls[i-1][j], ls[i][j-1]);
            }
        }
        
        return ls[n1][n2];
    }
}