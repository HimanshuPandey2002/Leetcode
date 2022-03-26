class Solution {
    public static boolean isVowel(char c){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(char ch: vowels){
            if(c == ch)
                return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        
        int i = 0, j = arr.length - 1;
        
        while(i < j){
            boolean c1 = isVowel(arr[i]);
            boolean c2 = isVowel(arr[j]);
            
            if(c1 && c2){
                char temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
            else if(c1 && !c2) j--;
            else if(!c1 && c2) i++;
            else {
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }
}