class Solution {
     public int robfun(int[] arr){
        int n = arr.length;
        int prev = arr[0];
        int prev2 = 0;
        
        for(int i = 1; i < n; i++){
            int take = arr[i] + (i > 1 ? prev2 : 0);
            int not = prev;
            int curr = Math.max(not, take);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    
    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n == 1) return nums[0];
        
        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];
        int k = 0, j = 0;
        
        for(int i = 0; i < n; i++){
            if(i != 0) arr1[k++] = nums[i];
            if(i != n-1) arr2[j++] = nums[i];
        }
        
        return Math.max(robfun(arr1), robfun(arr2));
    }
}