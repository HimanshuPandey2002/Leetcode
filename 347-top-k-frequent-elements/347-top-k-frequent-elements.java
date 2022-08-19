class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i: nums)
            map.put(i, map.getOrDefault(i,0) + 1);
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1, o2) -> {
            return o1.getValue().compareTo(o2.getValue());
        });
        
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            pq.add(e);
            if(pq.size() > k) pq.remove();
        }
        
        int[] res = new int[k];
        for(int i = 0; i < k; i++) res[i] = pq.remove().getKey();
        return res;
    }
}