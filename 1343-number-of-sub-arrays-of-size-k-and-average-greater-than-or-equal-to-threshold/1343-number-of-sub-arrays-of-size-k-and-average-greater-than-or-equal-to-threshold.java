class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        
        for(int i = 0; i < k; i++)
            sum += arr[i];
            
        double avg = (double)((double)sum/(double)k);
        int count = (avg >= threshold) ? 1 : 0;
            
        for(int i = k; i < arr.length; i++){
            sum += (arr[i] - arr[i-k]);
            avg = (double)((double)sum/(double)k);
            
            if(avg >= threshold) count++;
        }
        
        return count;
    }
}