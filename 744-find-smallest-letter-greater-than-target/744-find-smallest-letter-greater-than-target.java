class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length, l = 0, h = n;
        
        while(l < h){
            int mid = l + (h - l)/2;
            if(letters[mid] > target) h = mid;
            else l = mid+1;
        }
        return letters[l%n];
    }
}