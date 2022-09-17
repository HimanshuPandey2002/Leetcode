class Solution {
    public int countElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i: nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        
        int count = 0;
        
        for(int i: nums)
            if(i > min && i < max) count++;
        
        return count;
    }
}