class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        int pro = 1;

        for(int i = 0; i < n; i++){
            if(i > 0)
                pro *= nums[i-1];
            res[i] = pro;
        }
        
        pro = 1;
        
        for(int i = n-1; i >= 0; i--){
            if(i < n-1)
                pro *= nums[i+1];
            res[i] *= pro;
        }
        
        return res;
    }
}