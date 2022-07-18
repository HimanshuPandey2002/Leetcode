class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0, ind = -1, match = 0;
        while(i < s.length()){
            if(j < p.length() && (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j))){
                i++;
                j++;
            } else if( j < p.length() && p.charAt(j) == '*'){
                ind = j;
                match = i;
                j++;
            } else if(ind != -1){
                j = ind + 1;
                match++;
                i = match;
            } else return false;
        }
        
        while(j < p.length() && p.charAt(j) == '*') j++;
        return j == p.length();
    }
}