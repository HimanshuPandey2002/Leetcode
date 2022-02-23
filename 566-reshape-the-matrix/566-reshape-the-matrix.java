class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr = new int[r][c];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if((r*c) != (mat.length * mat[0].length))
            return mat;
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                list.add(mat[i][j]);
            }
        }
        int ele=0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = list.get(ele++);
            }
        }
        return arr;
        
    }
}