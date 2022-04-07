class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        if(n == 1) return stones[0];
        
        for(int i = 0; i < n-1; i++){
            Arrays.sort(stones);
            int val = stones[n-1] - stones[n-2];
            stones[n-1] = 0;
            stones[n-2] = val;
        }
        for(int i: stones)
            System.out.print(i + " ");
        return stones[n-2];
    }
}