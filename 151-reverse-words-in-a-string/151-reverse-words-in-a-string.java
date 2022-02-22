class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split("\\s+");
        
        int i = 0, j = strs.length - 1;
        
        while(i < j){
            String temp = strs[i];
            strs[i++] = strs[j];
            strs[j--] = temp;
        }
        
        return String.join(" ", strs).trim();
    }
}