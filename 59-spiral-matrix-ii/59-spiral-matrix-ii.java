class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n-1, right = 0, left = n-1;
        int count = 1;
        
        while(count <= n*n){
            int i = right;
            while(i <= left)
                matrix[top][i++] = count++;
            top++;
            i = top;
            while(i <= bottom)
                matrix[i++][left] = count++;
            left--;
            i = left;
            while(i >= right)
                matrix[bottom][i--] = count++;
            bottom--;
            i = bottom;
            while(i >= top)
                matrix[i--][right] = count++;
            right++;
        }
        
        return matrix;
    }
}