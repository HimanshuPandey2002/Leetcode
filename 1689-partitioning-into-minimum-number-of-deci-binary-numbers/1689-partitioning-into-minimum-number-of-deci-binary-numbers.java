class Solution {
    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        
        for(char c: n.toCharArray()){
            max = Math.max(Integer.valueOf(String.valueOf(c)), max);    
        }
        return max;
    }
}