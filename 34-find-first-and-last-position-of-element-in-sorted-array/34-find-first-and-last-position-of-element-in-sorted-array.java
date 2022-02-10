class Solution {
    public static int binarySearch(int[] arr, int l,int h, int target){
        if(l > h) return -1;
        int mid = l + (h - l) / 2;
        if(arr[mid] == target)
            return mid;
        else if(arr[mid] > target)
            return binarySearch(arr, l, mid-1, target);
        else
            return binarySearch(arr, mid+1, h, target);
    }
    
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        
        int index = binarySearch(nums, 0, nums.length - 1, target);
        
        if(index == -1)
            return res;
        
        list.add(index);
        
        int tempIndex = index;
        
        while(tempIndex > 0){
            tempIndex = binarySearch(nums, 0, tempIndex-1, target);
            if(tempIndex != -1) list.add(tempIndex);
        }
        tempIndex = index;
        
        while(tempIndex != -1 && tempIndex < (nums.length - 1)){
             tempIndex = binarySearch(nums, tempIndex + 1, nums.length, target);
             if(tempIndex != -1) list.add(tempIndex);
        }
        
        res[0] = Collections.min(list);
        res[1] = Collections.max(list);
        
        return res;
    }
}