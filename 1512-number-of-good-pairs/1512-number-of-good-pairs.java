class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] arr = new int[101];
        for(int i = 0; i < nums.length; i++)
            count += arr[nums[i]]++;
        
        return count;   
    }
}