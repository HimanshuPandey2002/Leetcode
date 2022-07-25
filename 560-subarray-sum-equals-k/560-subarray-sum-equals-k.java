class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(sum, 1);
        
        for(int j = 0; j < nums.length; j++){
            sum += nums[j];
    
            if(map.containsKey(sum-k))
                count += map.get(sum-k);

            map.merge(sum, 1, Integer::sum);
        }
        return count;
    }
}