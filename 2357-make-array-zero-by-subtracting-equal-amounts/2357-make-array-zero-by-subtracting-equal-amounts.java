class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        
        while(true){
            boolean fl = true;
            for(int i: nums) if(i != 0) fl = false;
            if(fl) break;
            
            int min = Integer.MAX_VALUE;
            
            for(int i: nums)
                if(i != 0 && i < min)
                    min = i;

            for(int i = 0; i < nums.length; i++)
                nums[i] = (nums[i]-min <= 0) ? 0 : nums[i] - min;
            
            count++;
        }
        
        return count;
    }
}