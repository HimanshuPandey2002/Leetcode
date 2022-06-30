class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        
        long sum = 0, min = Long.MAX_VALUE, m = beans.length;
        
        for(int i: beans)
            sum += i;
        
        for(int i = 0; i < beans.length; i++, m--)
           min = Math.min(min, sum - m * beans[i]);
       
        return min;
    }
}