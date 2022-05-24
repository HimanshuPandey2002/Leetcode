class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                count++;
            } else 
                set.add(c);
        }
        return (!set.isEmpty()) ? count*2+1 : count*2;
    }
}