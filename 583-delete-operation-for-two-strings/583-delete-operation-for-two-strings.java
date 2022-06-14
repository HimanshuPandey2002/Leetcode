class Solution {
    int lcs( char[] X, char[] Y, int m, int n ) {
        int L[][] = new int[m+1][n+1];

        for (int i=0; i<=m; i++) {
            for (int j=0; j<=n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i-1] == Y[j-1])
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }
        return L[m][n];
    }
    
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int len = lcs(word1.toCharArray(), word2.toCharArray() , n, m);
        return (n-len) + (m-len);
    }
}