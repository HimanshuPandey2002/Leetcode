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
    
    public void solve(int col, char[][] board, List<List<String>> ans, int n) {
        if(col == n){
            ans.add(construct(board));
            return;
        }
        
        for(int i = 0; i < n; i++){
            if(isSafe(col, i, board, n)){
                board[i][col] = 'Q';
                solve(col+1, board, ans, n);
                board[i][col] = '.';
            }
        }
    }
    
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                board[i][j] = '.';
        
        List<List<String>> res = new ArrayList<List<String>>();
        solve(0, board, res, n);
        return res;
    }
    
    public static List<String> construct(char[][] board){
        List<String> res = new ArrayList<String>();
        for(int i = 0; i < board.length; i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}