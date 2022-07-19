class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        
        int count = 0, n = piles.length;
        
        for(int i = n/3; i < n; i+=2)
           count += piles[i];    
        
        return count;
    }
}