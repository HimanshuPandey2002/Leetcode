class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n = box.length;
        int m = box[0].length;
        
        char[][] arr = new char[m][n];
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                arr[j][i] = box[n-i-1][j];
        
        for (int i = m - 1; i >= 0; i--) {
             for (int j = 0; j < n; j++) {
                 if (arr[i][j] == '#') {
                     int curRow = i;
                     while (curRow + 1 < m && arr[curRow + 1][j] == '.') curRow++;
                     if (curRow != i) {
                         arr[curRow][j] = '#';
                         arr[i][j] = '.';
                     }
                 }
             }
         }
        
        return arr;
    }
}