class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, n = prices.length-1, buy = 0, sell = 0, profit = 0;
        
        while(i < n){
            while(i < n && prices[i+1] <= prices[i]) i++;
            buy = prices[i];
            
            while(i < n && prices[i+1] > prices[i]) i++;
            sell = prices[i];
            
            profit += sell - buy;
        }
        return profit;
    }
}