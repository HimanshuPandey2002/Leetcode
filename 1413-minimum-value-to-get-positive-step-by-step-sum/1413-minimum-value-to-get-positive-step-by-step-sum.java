class Solution {
    public int minStartValue(int[] nums) {
        int min = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
            if(min > nums[i])
                min = nums[i];
        }
        
        return (min < 0) ? (-min + 1) : 1;
    }
}