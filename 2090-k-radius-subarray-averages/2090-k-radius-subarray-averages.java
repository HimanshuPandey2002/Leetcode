class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(k == 0) return nums;
        int n = nums.length;
        long sum = 0;
        int[] rad = new int[n];
        
        for(int i = 0; i < n; i++){
            if(i < k) rad[i] = -1;
            sum += nums[i];
            
            if(i >= 2*k){
                rad[i-k] = (int)((double)sum/(double)(2*k+1));
                sum -= nums[i-2*k]; 
            }
            
            if(i >= n-k) rad[i] = -1;
        }
        return rad;
    }
}