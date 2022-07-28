class Solution {
    // static void swap(int[] arr, int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
    
    public int[] pivotArray(int[] nums, int pivot) {      
        int l = 0, mid = 0, h;
        
        for(int i : nums){
            if(i < pivot) l++;
            else if(i == pivot) mid++;
        }
        
        h = l + mid;
        mid = l;
        l = 0;
        
        int[] ans = new int[nums.length];
        
        for(int i: nums){
            if(i < pivot) ans[l++] = i;
            else if(i == pivot) ans[mid++ ] = i;
            else ans[h++] = i;
        }
        
        return ans;
    }
}