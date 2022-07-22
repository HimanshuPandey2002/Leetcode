class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i: nums)
            map.merge(i, 1, Integer::sum);
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1)
                ans.add(entry.getKey());
        }
        return ans;
    }
}