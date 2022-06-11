class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length, best = 0;
        
        for(int i = 1; i < n; i++)
            nums[i] += nums[i-1];
        int target = nums[n-1] - x;
        if(target < 0) return -1;
        if(target == 0) return n;
        
        for(int i = -1, j = 0, l = 0; i < n - best && l <= x; l = nums[++i]){
            while (nums[j] - l < target) j++;
            if (nums[j] - l == target) best = Math.max(best, j - i);
        }
        return best > 0 ? n - best : -1;
    }
}