class Solution {
    public boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    public int maxVowels(String s, int k) {
        int max = 0, i = 0, count = 0;
        
        for(int j = 0; j < s.length(); j++){
            if(isVowel(s.charAt(j))) count++;
            
            if(j-i+1 == k){
                max = Math.max(max, count);
                if(isVowel(s.charAt(i++))) count--;
            }
        }
        return max;
    }
}