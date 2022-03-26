class Solution {
    public void reverseString(char[] s) {
        int i = 0, n = s.length, j = n - 1;
        
        while(i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
            i++;
        }        
    }
}