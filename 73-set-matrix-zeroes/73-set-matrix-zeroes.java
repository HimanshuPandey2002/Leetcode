class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    list.add(new int[] {i,j});
                }
            }
        }
        for(int i = 0; i < list.size(); i++){
            int row = list.get(i)[0];
            int col = list.get(i)[1];
            
            for(int j = 0; j < matrix.length; j++)
                matrix[j][col] = 0;
            for(int j = 0; j < matrix[0].length; j++)
                matrix[row][j] = 0;
        }
    }
}