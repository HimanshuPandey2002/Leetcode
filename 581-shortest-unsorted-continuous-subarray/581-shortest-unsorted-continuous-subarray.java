class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length, start = 0, end = n-1;
        int[] temp = nums.clone();
        Arrays.sort(temp);
        
        while(start < n && nums[start] == temp[start]) start++;
        
        while(end > start && nums[end] == temp[end]) end--;
        
        return end-start+1;
    }
}