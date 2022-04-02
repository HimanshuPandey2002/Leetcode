class Solution {
    public static boolean isPalindrome(String s, int i, int j){
        while(i < j)
            if(s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }
    
    public boolean validPalindrome(String s) {
        if(isPalindrome(s, 0, s.length() - 1)) return true;
        
        int i = 0, j = s.length() - 1;
        
        while(i < j){
            if(s.charAt(i) != s.charAt(j))
                return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
            i++;
            j--;
        }
        return true;
    }
}