class Solution {
    public int minOperations(int[] nums, int x) {
        int k = 0, n = nums.length;

        for(int i : nums)
            k += i;
        
		k -= x;
		
		int max = -1, sum = 0, left = 0;

		for (int i = 0; i < n; ++i) {
			sum += nums[i];
            
			while (left <= i && sum > k) 
                sum -= nums[left++];
            if(sum == k) 
                max = Math.max(max, i - left + 1);
		}

        return (max == -1) ? -1 : n - max;
    }
}