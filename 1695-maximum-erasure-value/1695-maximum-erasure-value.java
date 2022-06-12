class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length, l = 0, r = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, ans = 0;
        
        while(r < n) {
            int right = nums[r++];
            sum += right;
            map.put(right, map.getOrDefault(right, 0) + 1);
            
            while(map.get(right) > 1) {
                int left = nums[l++];
                map.put(left, map.getOrDefault(left, 0) - 1);
                sum -= left;
            }
            ans = Math.max(ans, sum);
        }
        return ans;    
    }
}