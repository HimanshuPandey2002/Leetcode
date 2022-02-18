class Solution {
    public static boolean isAlNum(char c){
        return (Character.isDigit(c) || Character.isLetter(c));
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
    
        for(int i = 0, j = s.length() - 1; i < j ; ){
            if(!isAlNum(s.charAt(i))) i++;
            else if(!isAlNum(s.charAt(j))) j--;
            else if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        
        return true;
    }
}