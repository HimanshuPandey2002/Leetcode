class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String word : strs){
            String key = hash(word);
            System.out.println(key);
            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
    
    public String hash(String s){
        int[] a = new int[26];
        for(char c : s.toCharArray()) a[c-'a']++;
        return Arrays.toString(a);
    }
}