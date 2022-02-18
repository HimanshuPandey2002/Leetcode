class Solution {
    public static boolean check(String s){
        int i = 0, j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        String str = "";
        for(char c: s.toLowerCase().toCharArray())
            if(Character.isLetter(c) || Character.isDigit(c))
                str += c;
        return check(str);
    }
}