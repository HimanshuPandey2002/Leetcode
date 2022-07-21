class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int k) {
        int max = 0, sum = 0, count = 0, n = grumpy.length;
        
        for(int i = 0; i < n; i++)
            if(grumpy[i] == 0)
                count += customers[i];
        
        for(int j = 0, i = 0; j < n; j++){
            if(grumpy[j] == 1)
                sum += customers[j];
            
            if(j-i+1 == k){
                max = Math.max(max, sum);
                if(grumpy[i] == 1)
                    sum -= customers[i];
                i++;
            }
        }
        return count + max;
    }
}