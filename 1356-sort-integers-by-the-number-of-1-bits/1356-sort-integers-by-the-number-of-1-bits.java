class Solution {
    public int[] sortByBits(int[] arr) {
        int[] res = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++)
            res[i] = countBitOne(arr[i])*10001 + arr[i];
        Arrays.sort(res);
        for (int i = 0; i < arr.length; i++) {
            res[i] %= 10001;
        }
        return res;
    }
    private int countBitOne(int n) {
        int res = 0;
        while (n != 0) {
            res += (n & 1);
            n >>= 1;
        }
        return res;
    }
}