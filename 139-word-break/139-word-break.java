class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String,Boolean> map= new HashMap<>();
        return solve(s, wordDict, map);
    }
    
    public boolean solve(String s, List<String> words, HashMap<String,Boolean> map) {
        if(map.containsKey(s)) return map.get(s);
        if(s.length() == 0) return true;
			
        for(String word: words) 
            if(s.startsWith(word)) 
                if(solve(s.substring(word.length()),words, map)) {
                    map.put(s, true);
                    return true;
                }
		
        map.put(s,false);
        return false;
    }

}