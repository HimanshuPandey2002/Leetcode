class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n = box.length;
        int m = box[0].length;
        
        char[][] arr = new char[m][n];
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                arr[j][i] = box[n-i-1][j];
        
        for(int i = m-1; i >= 0; i--){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == '#'){
                    int currRow = i;
                    
                    while(currRow + 1 < m && arr[currRow+1][j] == '.') currRow++;
                    
                    if(currRow != i){
                        arr[currRow][j] = '#';
                        arr[i][j] = '.';
                    }
                }
            }
        }
        
        return arr;
    }
}