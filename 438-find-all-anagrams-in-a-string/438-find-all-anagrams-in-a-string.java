class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int start = 0, end = 0, n = s.length(), k = p.length(), diff = k;
        List<Integer> list = new ArrayList<>();
        
        if(n == 0 || k == 0 || k > n) return list;
        
        int[] chars = new int[26];
        
        for (char c : p.toCharArray())
           chars[c-'a']++;
        
        char temp;
        
        for (end = 0; end < k; end++){
           temp = s.charAt(end);
           chars[temp-'a']--;
            
           if (chars[temp-'a'] >= 0)
               diff--;
        }
        
        if (diff == 0)
            list.add(0);
       
        while (end < s.length()){           
           temp = s.charAt(start);
           
           if (chars[temp-'a'] >= 0)
               diff++;
           
           chars[temp-'a']++;
           start++;
           temp = s.charAt(end);
           chars[temp-'a']--;
           
           if (chars[temp-'a'] >= 0)
               diff--;           
           
           if (diff == 0)
               list.add(start);
           
           end++;   
       }
        
        
        return list;
        
    }
}