class Solution {
    public static boolean BinarySearch(int[] arr, int l, int h, int k){
        if(l > h) return false;
        int mid = l + (h-l)/2;
        if(arr[mid] == k)
            return true;
        return (arr[mid] <= k)
            ? BinarySearch(arr, mid+1, h, k)
            : BinarySearch(arr, l, mid-1, k);
    }
    public boolean search(int[] nums, int target) {
        int pivot = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                pivot = i+1;
                break;
            }
        }
        if(nums[pivot] == target)
            return true;
        
        boolean index = BinarySearch(nums, 0, pivot, target);
        if(index)
            return index;
        return BinarySearch(nums, pivot, nums.length-1, target);
    }
}