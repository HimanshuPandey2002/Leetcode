class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, count = 0, p = 1;
        
        for(int i = 0, j = 0; j < n; j++){
            p *= nums[j];
            
            while(i <= j && p >= k){
                p /= nums[i++];
            }
            
            count += (j - i + 1);
        }
        return count;
    }
}

 