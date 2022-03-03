class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        
        if(n < 3) return 0;
        
        int i=0,j=0,cn=n,count=0;
        while(i<n-1){
            j=i+1;
            int d = nums[j]-nums[i];
            while(j<n && nums[j]-nums[j-1] == d){
                if(j-i+1>=3) count++;
                j++;
            }
            i++;
        }
        return count;
    }
}