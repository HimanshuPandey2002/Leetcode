class Solution {
    ArrayList<String> str = new ArrayList<String>();
    
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
 
        while (i < j) 
            if (str.charAt(i++) != str.charAt(j--))
                return false;
 
        return true;
    }
    
    public void ss(String s, int n){
         for (int i = 0; i < n; i++)
           for (int j = i+1; j <= n; j++)
                str.add(s.substring(i, j));
    }
    
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        ss(s, n);
        
        for(String ss : str){
            if(isPalindrome(ss))
                count++;
        }
           
        return count;
    }
}