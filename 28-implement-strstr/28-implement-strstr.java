class Solution {
    public int strStr(String h, String n) {
        if(h.length() == 0) return -1;
        if(n.length() == 0) return 0;
        
        for (int i = 0; i < h.length(); i++) {
            if (i + n.length() > h.length()) break;
            
            for (int j = 0; j < n.length(); j++) {
                if (h.charAt(i+j) != n.charAt(j)) break;
                if (j == n.length()-1) return i;
            }
        }
        
        return -1;
    }
}