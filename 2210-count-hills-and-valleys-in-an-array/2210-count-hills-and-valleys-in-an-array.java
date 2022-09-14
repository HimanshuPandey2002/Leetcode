class Solution {
    public int countHillValley(int[] nums) {
        int count = 0, el = nums[0];
        
        for(int i = 1; i < nums.length-1; i++){
            if(el > nums[i] && nums[i] < nums[i+1] || el < nums[i] && nums[i] > nums[i+1]){
                count++;
                el = nums[i];
            }
        }
        
        return count;
    }
}