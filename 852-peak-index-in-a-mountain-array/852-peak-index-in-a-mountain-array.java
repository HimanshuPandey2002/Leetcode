class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 1, end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
                return mid;
            else if(arr[mid-1] < arr[mid] && arr[mid+1] > arr[mid])
                start = mid+1;
            else if(arr[mid-1] > arr[mid] && arr[mid+1] < arr[mid])
                end = mid-1;
        }
        return -1;
    }
}