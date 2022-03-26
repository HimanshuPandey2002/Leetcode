class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String res = "";
        
        for(String word: words){
            char[] arr = word.toCharArray();
            int i = 0, j = word.length()-1;
            while(i < j){
                char temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
            res += String.valueOf(arr);
            res += " ";
        }
        return res.trim();
    }
}
