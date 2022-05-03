class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        
        for(int i: nums)
            arr.add(i);
        
        for(int i = 0; i <= n; i++)
            if(!arr.contains(i))
                return i;
        return -1;
        
    }
}