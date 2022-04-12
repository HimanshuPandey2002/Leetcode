class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length; 
        int m = board[0].length;
        int[][] index = {{-1, 0}, {1, 0}, {0, 1}, {0,-1}, {-1, 1}, {1, 1} ,{-1,-1}, {1,-1}};
        // int[][] matrix = board;
        int[][] matrix = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                matrix[i][j] = board[i][j];
        }
        
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int count = 0;
                for(int k = 0; k < index.length; k++){
                    if(i+index[k][0] >= 0 && i+index[k][0] < n && j+index[k][1] >= 0 && j+index[k][1] < m)
                        if(matrix[i+index[k][0]][j+index[k][1]] == 1)
                            count++; 
                }
                if(matrix[i][j] == 1 && (count < 2 || count > 3))
                    board[i][j] = 0;
                else if(matrix[i][j] == 0 && count == 3)
                    board[i][j] = 1;
            }
        }
    }
}