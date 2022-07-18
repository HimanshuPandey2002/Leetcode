class Solution {
    public boolean isMatch(String S, String P) {
        int s = 0, p = 0, match = 0, starIdx = -1;            
        while (s < S.length()){
            if(p < P.length()  && (P.charAt(p) == '?' || S.charAt(s) == P.charAt(p))){
                s++;
                p++;
            }
            else if (p < P.length() && P.charAt(p) == '*'){
                starIdx = p;
                match = s;
                p++;
            }
            else if (starIdx != -1){
                p = starIdx + 1;
                match++;
                s = match;
            }
            else return false;
        }
        
        while (p < P.length() && P.charAt(p) == '*')
            p++;
        
        return p == P.length();
    }
}