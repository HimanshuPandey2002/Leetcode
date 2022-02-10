class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] range = new int[right+1];
        
        for(int k = left; k <= right; k++)
            for(int i = 0; i < ranges.length; i++)
                if(k >= ranges[i][0] && k <= ranges[i][1])
                    range[k] = 1;
                    
        for(int i = left; i <= right; i++)
            if(range[i] == 0)
                return false;
        
        return true;

    }
}