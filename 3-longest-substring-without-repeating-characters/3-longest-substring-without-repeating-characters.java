class Solution {
    public int lengthOfLongestSubstring(String str) {
        HashMap<Character, Integer> set = new HashMap<Character, Integer>();
        int l = 0, r = 0;
        int length = 0;
        int n = str.length();

        while(r < n){
            if(set.containsKey(str.charAt(r))){
                l = Math.max(set.get(str.charAt(r))+1, l);
            }
            set.put(str.charAt(r), r);
            length = Math.max(length, r - l + 1);
            r++;
        }
        return length;
    }
}