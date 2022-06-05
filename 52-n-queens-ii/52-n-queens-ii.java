class Solution {
    public boolean isSafe(int col, int row, char[][] board, int n){
        int r = row;
        int c = col;
        
        while(row >= 0 && col >= 0)
            if(board[row--][col--] == 'Q') return false;
        
        col = c;
        row = r;
        
        while(col >= 0)
            if(board[row][col--] == 'Q') return false;
        
        col = c;
        row = r;
        
        while(row < n && col >= 0)
            if(board[row++][col--] == 'Q') return false;
        
        return true;
    }
    
    public void solve(int col, char[][] board, List<Integer> count, int n) {
        if(col == n){
            count.add(1);
            return;
        }
        
        for(int i = 0; i < n; i++){
            if(isSafe(col, i, board, n)){
                board[i][col] = 'Q';
                solve(col+1, board, count, n);
                board[i][col] = '.';
            }
        }
    }
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                board[i][j] = '.';
        
        List<Integer> count = new ArrayList<>();
        solve(0, board, count, n);
        return count.size();    
    }
}