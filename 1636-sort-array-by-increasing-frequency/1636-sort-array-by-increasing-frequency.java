class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1, o2) -> {
            if(o1.getValue() == o2.getValue())
                return o2.getKey().compareTo(o1.getKey());
            return o1.getValue().compareTo(o2.getValue());
        });
        
        for(Map.Entry<Integer, Integer> e: map.entrySet())
            pq.add(e);
        
        int ind = 0;
        
        while(!pq.isEmpty()){
            int freq = pq.peek().getValue();
            int key = pq.peek().getKey();
            pq.remove();
            for(int i = 0; i < freq; i++)
                nums[ind++] = key;
        }
        return nums;
    }
}