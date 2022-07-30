class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>(), rep = new HashSet<>();
        
        for(int i = 0; i < s.length() - 9; i++){
            String sub = s.substring(i, i+10);
            if(!set.add(sub)) rep.add(sub);
        }
        
        return new ArrayList(rep);
    }
}