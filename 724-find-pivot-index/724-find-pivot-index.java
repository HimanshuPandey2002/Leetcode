class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] nextSum = new int[n];
        int[] prevSum = new int[n];
        
        int sum = 0;
        for(int i = 1; i < n; i++)
            prevSum[i] = prevSum[i-1] + nums[i-1];
        
        for(int i = n-2; i >= 0; i--)
            nextSum[i] = nextSum[i+1] + nums[i+1];
        
        for(int i = 0; i < n; i++)
            if((nextSum[i] - prevSum[i]) == 0)
                return i;
        return -1;       
    }
}

