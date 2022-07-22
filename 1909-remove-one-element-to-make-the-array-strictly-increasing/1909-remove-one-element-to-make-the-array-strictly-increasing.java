class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] >= nums[i]){
                if(count == 1)
                    return false;
                count++;
                if(i>1 && nums[i] <= nums[i-2])
                   nums[i]=nums[i-1];
            }
        }
        
        return true;
    }
}