class Solution {
    public static int countBinaryOnes(int num){
        int count = 0;
        String bin = Integer.toBinaryString(num);
        
        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) == '1')
                count++;
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