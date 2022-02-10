class Solution {
    public static boolean binarySearch(int[] arr, int l, int h, int target){
        if(l > h) return false;
        
        int mid = l + (h - l) / 2;
        
        if(arr[mid] == target)
            return true;
        else if(arr[mid] > target)
            return binarySearch(arr, l, mid-1, target);
        else
            return binarySearch(arr, mid+1, h, target);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            int max_in_row = matrix[i][matrix[0].length - 1]; 
            if(target <= max_in_row)
                return binarySearch(matrix[i], 0, matrix[0].length-1, target);
        }
        return false;
    }
}