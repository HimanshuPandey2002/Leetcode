class Solution {
    public int minOperations(int[] nums, int x) {
        int k = 0, n = nums.length;

        for(int i : nums) k += i;
		k -= x;
		
		int max = -1, windowSum = 0, left = 0;

		for (int i = 0; i < n; ++i) {
			windowSum += nums[i];

			while (left <= i && windowSum > k)
				windowSum -= nums[left++];

            if(windowSum == k)
			    max = Math.max(max, i - left + 1);
		}

        return (max == -1) ? -1 : n - max;
    }
}