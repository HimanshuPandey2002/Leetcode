class Solution {
    public int findMin(int[] nums) {
        int n = nums.length, l = 0, h = n-1;
        
        while(l <= h){
            int mid = l + (h-l)/2;
            int next = (mid+1) % n;
            int prev = (mid-1+n) % n;
            
            if(nums[mid] <= nums[prev] && nums[mid] <= nums[next])
                return nums[mid];
            else if(nums[mid] <= nums[h])
                h = mid-1;
            else if(nums[mid] >= nums[l])
                l = mid+1;
        }
        return nums[0];
    }
}