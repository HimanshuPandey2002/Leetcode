class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length, count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < n; i++){
            int diff = k-nums[i];
            
            if(map.containsKey(diff) && map.get(diff)>0){
                count++;
                map.put(diff, map.get(diff)-1);
            }else
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        return count;
    }
}