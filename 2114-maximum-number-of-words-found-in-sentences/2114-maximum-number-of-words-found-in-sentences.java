class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for(String sent: sentences){
            String[] str = sent.split(" ");
            max = Math.max(max, str.length);
        }
        return max;
    }
}