class Solution {
    int[] di = {-1, 1, 0, 0};
    int[] dj = {0, 0, -1, 1};
    boolean[][] vis;
    
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        vis = new boolean[n][m];
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                if(word.charAt(0) == board[i][j] && solve(i, j, board, 0, word, n, m))
                    return true;
        return false;
    }
    
    private boolean solve(int i, int j, char[][] board, int ind, String word, int n, int m){
        if(ind == word.length()) return true;
        if(i>=n || i<0 || j>=m || j<0 || board[i][j] != word.charAt(ind) || vis[i][j])
            return false;
        
        vis[i][j] = true;
        
        for(int k = 0; k < 4; k++){
            int nexti = i + di[k];
            int nextj = j + dj[k];

            if(solve(nexti, nextj, board, ind+1, word, n, m))
                return true; 
        }
        vis[i][j] = false;
        return false;
    }
}