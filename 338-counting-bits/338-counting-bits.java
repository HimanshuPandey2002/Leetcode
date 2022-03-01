class Solution {
    public int countBinaryOnes(int num){
        int count = 0;
        
        while(num > 0){
            if(num%2 == 1) count++;
            num = num/2;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        
        for(int i = 1; i <= n; i++){
            ans[i] = countBinaryOnes(i);
        }
        return ans;
    }
}