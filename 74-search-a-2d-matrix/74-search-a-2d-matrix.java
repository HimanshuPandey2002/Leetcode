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
        int[] arr = new int[matrix.length * matrix[0].length];
        int k = 0;
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                arr[k] = matrix[i][j];
                k++;
            }
        }
        
        return binarySearch(arr, 0, arr.length-1, target);
    }
}