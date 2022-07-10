class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i: nums)
            set.add(i);
        
        int max = 0;
        
        for(int i : nums){
            if(!set.contains(i-1)){
                int num = i, count = 1;
                
                while(set.contains(num+1)){
                    num++;
                    count++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}