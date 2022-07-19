class Solution {
    public boolean isAnagrams(String s1, String s2, int s, int e){
        int[] count = new int[26];
        int ind = 0;

        for(int i = s; i <= e; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(ind++) - 'a']--;
        }

        for(int i = 0; i < 26; i++)
            if (count[i] != 0)
                return false;
        
        return true;
    }
    
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), k = p.length();
        List<Integer> list = new ArrayList<>();
        
        if(k > n) return list;
        
        if(isAnagrams(s, p, 0, k-1))
            list.add(0);
        
        for(int i = k; i < n; i++){
            if(isAnagrams(s, p, i-k+1, i))
                list.add(i-k+1);
        }
        
        return list;
        
    }
}