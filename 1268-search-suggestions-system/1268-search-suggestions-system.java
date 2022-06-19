class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        PriorityQueue<String> q = new PriorityQueue<>(3, (s1, s2) -> s1.compareTo(s2));
        List<List<String>> result = new ArrayList<>();
    
        for(int i = 1; i <= searchWord.length(); i++){
            String str = searchWord.substring(0, i);
            
            for(String s: products)
                if(s.startsWith(str))
                    q.offer(s);
            
            List<String> list = new ArrayList<>();
            
            for(int j = 0; j < 3; j++)
                if(q.peek() != null)
                    list.add(q.poll());
            
            q.clear();
            result.add(list);
        }
        
        return result;
    }
}