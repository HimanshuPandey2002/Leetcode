class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        if(t.equals(s)) return t;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < t.length(); i++)
            map.merge(t.charAt(i), 1, Integer::sum);
        
        int count = map.size(), min = Integer.MAX_VALUE, st = -1, end = -1;
        
        for(int j = 0, i = 0; j < s.length(); j++){
            char c = s.charAt(j);
            if(map.containsKey(c)){
                map.put(c, map.getOrDefault(c, 0) - 1);
                if(map.get(c) == 0) count--;
            }
            
            if(count == 0){
                while(count == 0){
                    char ch = s.charAt(i);
                    if(j-i+1 < min){
                        min = j-i+1;
                        st = i;
                        end = j;
                    }
                    if(map.containsKey(ch)){
                        map.put(ch, map.getOrDefault(ch, 0) + 1);
                        if(map.get(ch) > 0) count++;
                    }
                    i++;
                }
            }
            
        }
        
        String res = "";
        
        if(st != -1 && end != -1)
            for(int i = st; i <= end; i++)
                res += s.charAt(i);
        
        return res;
    }
}