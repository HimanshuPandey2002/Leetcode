class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, count = 0;
        
        for(int i = 0; i < n; i++){
            int p = 1;
            for(int j = i; j < n; j++){
                p *= nums[j];
                if(p < k) count++;
                else break;
            }
        }
        return count;
    }
}