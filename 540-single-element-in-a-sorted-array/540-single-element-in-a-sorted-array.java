class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length, l = 0, h = n-1;
        
        while(l < h){
            int mid = l+(h-l)/2;
            
            if(mid > 0 && mid < n-1){
                if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
                    return nums[mid];
                else if(nums[mid] == nums[mid-1]){
                    if(mid % 2 == 0) h = mid-1;
                    else l = mid+1;
                } else if (nums[mid] == nums[mid+1]){
                    if(mid % 2 == 0) l = mid+1;
                    else h = mid-1;
                }
            }
            if(nums[0] != nums[1]) return nums[0];
            if(nums[n-1] != nums[n-2]) return nums[n-1];
        }
        return nums[h];
    }
}