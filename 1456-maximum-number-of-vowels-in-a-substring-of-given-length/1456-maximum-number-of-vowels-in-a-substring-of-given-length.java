class Solution {
    public boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    public int maxVowels(String s, int k) {
        int max = 0, j = 0, i = 0, count = 0;
        
        while(j < s.length()){
            if(isVowel(s.charAt(j))) count++;
            
            if(j-i+1 < k) j++;
            else if(j-i+1 == k){
                max = Math.max(max, count);
                if(isVowel(s.charAt(i))) count--;
                i++;
                j++;
            }
        }
        return max;
    }
}