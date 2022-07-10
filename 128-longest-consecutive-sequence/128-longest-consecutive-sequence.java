class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i: nums)
            set.add(i);
        
        int max = 0;
        
        for(int i : set){
            if(!set.contains(i-1)){
                int num = i+1;
                
                while(set.contains(num)) num++;
                
                max = Math.max(num - i, max);
            }
        }
        return max;
    }
}