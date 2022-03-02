class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int top = 0, left = 0, right = matrix[0].length, bottom = matrix.length;
        
        // int j = left;
         while(top < bottom && left < right){
             int j = left;
             while(j < right)
                 list.add(matrix[top][j++]);
             top++;
             j = top;
             while(j < bottom)
                 list.add(matrix[j++][right-1]);
             right--;
             j = right-1;
             
             if(!(left < right && top < bottom)) break;
             while(j >= left)
                 list.add(matrix[bottom-1][j--]);
             bottom--;
             j = bottom-1;
             while(j >= top)
                 list.add(matrix[j--][left]);
             left++;
             // j = left;
         }
        
        return list;
    }
}