class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i: nums)
            map.merge(i, 1, Integer::sum);
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
            if(entry.getValue() > nums.length/3)
                list.add(entry.getKey());
        
        return list;
    }
}