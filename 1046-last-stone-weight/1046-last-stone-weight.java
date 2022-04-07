class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        if(n == 1) return stones[0];
        
        for(int i = 0; i < n-1; i++){
            Arrays.sort(stones);
            stones[n-2]  = stones[n-1] - stones[n-2];
            stones[n-1] = 0;
        }
        return stones[n-2];
    }
}