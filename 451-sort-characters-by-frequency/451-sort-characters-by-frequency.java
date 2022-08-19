class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((o1, o2) -> {
            if(o1.getValue() == o2.getValue())
                return o2.getKey().compareTo(o1.getKey());
            return o2.getValue().compareTo(o1.getValue());
        });
        
        for(Map.Entry<Character, Integer> e: map.entrySet())
            pq.add(e);
        
        String res = "";
        
        while(!pq.isEmpty()){
            int freq = pq.peek().getValue();
            char key = pq.peek().getKey();
            pq.remove();
            for(int i = 0; i < freq; i++)
                res += key;
        }
        return res;
    }
}