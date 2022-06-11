class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        for(int i: nums) x -= i;
        if(x == 0) return n;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, res = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(map.containsKey(sum + x))
                res = Math.max(res, i - map.get(sum + x));
            map.put(sum, i);
        }
        
        return res == Integer.MIN_VALUE ? -1 : n - res;
    }
}