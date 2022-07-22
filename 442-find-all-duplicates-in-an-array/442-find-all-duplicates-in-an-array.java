class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i: nums){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1)
                ans.add(entry.getKey());
        }
        return ans;
    }
}