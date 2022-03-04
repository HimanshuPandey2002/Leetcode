class Solution {
    public int firstUniqChar(String s) {
        int[] alp = new int[26];
        
        for(int i = 0; i < s.length(); i++)
            alp[s.charAt(i) - 'a']++;
        
        for(int i = 0; i < s.length(); i++)
            if(alp[s.charAt(i) - 'a'] == 1)
                return i;
        
        return -1;
    }
}