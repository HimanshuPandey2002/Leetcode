class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max = 0;
        
        for(int i = 0; i < n; i++){
            if(i <= max)
                max = Math.max(i+nums[i], max);
            else
                return false;
        }
        return true;
    }
}