class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length, l = 0, h = n-1;
        char res = '#';
        
        while(l <= h){
            int mid = l + (h - l)/2;
            if(letters[mid] <= target) l = mid+1;
            else {
                res = letters[mid];
                h = mid-1;
            }
        }
        return res == '#' ? letters[0] : res;
    }
}