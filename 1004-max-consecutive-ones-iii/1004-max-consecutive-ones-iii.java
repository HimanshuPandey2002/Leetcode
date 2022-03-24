class Solution {
    public static int longestOnes(int[] A, int k) {
        int count = 0;
        int l = 0;
        int max_len = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0)
                count++;

            while (count > k) {
                if (A[l] == 0)
                    count--;
                l++;
            }
            max_len = Math.max(max_len, i - l + 1);
        }

        return max_len;
    }
    
}