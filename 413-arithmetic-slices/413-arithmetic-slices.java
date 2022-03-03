class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n < 3) return 0;
        int count = 0;
        
        for(int i = 0; i < n-1; i++){
            int j = i+1;
            int diff = nums[j] - nums[i];
            while(j < n && nums[j] - nums[j-1] == diff){
                if(j - i + 1 >= 3) count++;
                j++;
            }
        }
        return count;
    }
}