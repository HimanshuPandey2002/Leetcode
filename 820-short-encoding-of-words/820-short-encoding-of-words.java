class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> s = new HashSet<>(Arrays.asList(words));
        
        for(int i = 0; i < words.length; i++){
            String w = words[i];
            
            for(int j = 1; j < w.length(); j++)
                s.remove(w.substring(j));
        }
        
        int res = 0;
        for (String w : s) res += w.length() + 1;
        
        return res;
    }
}