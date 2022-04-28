class Solution {    
    
    private static void fact(int n, int[] dp){
        for(int i = 1; i <= n; i++){
            dp[i] = dp[i-1] * i;
        }
    }

    public static String getPermutation(int n, int k) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        fact(n, dp);
        for(int i: dp){
            System.out.print(i + " ");
        }
        String res = "";

        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        for(int i = 1; i <= n; i++)
            arr.add(i);
        k = k-1;
        while(n > 0){
            int grp_len = dp[n] / n;
            int ind = k / grp_len;
            res += String.valueOf(arr.get(ind));
            arr.remove(ind);
            k = k%grp_len;
            n--;
        }

        return res;
    }
}