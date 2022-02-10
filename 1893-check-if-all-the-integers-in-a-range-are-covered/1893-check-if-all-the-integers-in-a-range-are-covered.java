class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] range = new int[right+1];
        
        for(int k = left; k <= right; k++){
            for(int i = 0; i < ranges.length; i++){
                int start = ranges[i][0];
                int end = ranges[i][1];
                
                if(k >= start && k <= end)
                    range[k] = 1;
            }            
        }
        for(int i = left; i <= right; i++)
            if(range[i] == 0)
                return false;
        return true;

    }
}