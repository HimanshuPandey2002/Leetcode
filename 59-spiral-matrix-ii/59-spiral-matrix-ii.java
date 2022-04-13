class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n]; 
        // int i = 0, j = 0;
        int c = 1;
        int top = 0, left = 0, right = n, bottom = n;
        
        
        while(top < bottom && left < right){
            int j = left;
            while(j < right)
                matrix[top][j++] = c++;
            top++;
            j = top;
            while(j < bottom)
                matrix[j++][right-1] = c++;
            right--;
            j = right-1;
            
            if(!(left < right && top < bottom)) break;
            
            while(j >= left)
                matrix[bottom-1][j--] = c++;
            bottom--;
            j = bottom-1;
            while(j >= top)
                matrix[j--][left] = c++;
            left++;
        }
        return matrix;
    }
}