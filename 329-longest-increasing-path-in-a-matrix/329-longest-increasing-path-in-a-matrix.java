class Solution {
    int[] di = {0, 1, 0, -1};
    int[] dj = {1, 0, -1, 0};
    
    public int longestIncreasingPath(int[][] matrix) {
        int n1 = matrix.length, n2 = matrix[0].length;
        if(n1 == 0) return 0;
        int[][] curr = new int[n1][n2];
        int max = 1;
        
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                int len = solve(matrix, i, j, n1, n2, curr);
                max = Math.max(len, max);
            }
        }
        return max;
    }
    
    public int solve(int[][] matrix, int i, int j, int n1, int n2, int[][] curr){
       if(curr[i][j] != 0)
           return curr[i][j];
        int max = 1;
        
        for(int k = 0; k < 4; k++){
            int nexti = i + di[k];
            int nextj = j + dj[k];
            
            if(nexti < n1 && nextj < n2 && nexti >= 0 && nextj >= 0 && matrix[nexti][nextj] > matrix[i][j]){
                int len = 1 + solve(matrix, nexti, nextj, n1, n2, curr);
                max = Math.max(len, max);
            }
        }
        curr[i][j] = max;
        return max;
    }
}