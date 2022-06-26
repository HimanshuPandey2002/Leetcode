class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        
        if(n == k) return Arrays.stream(arr).sum();
        
        int[] l = new int[k+1];
        
        for(int i = 1; i <= k; i++)
            l[i] = l[i-1] + arr[i-1];
        
        int[] r = new int[k+1];
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 1; i <= k; i++)
            r[i] = r[i-1] + arr[n-i];
        
        for(int i = 0; i <= k; i++)
            max = Math.max(max, l[i] + r[k-i]);
        
        return max;
            
    }
}