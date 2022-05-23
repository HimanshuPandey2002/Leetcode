class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        // ArrayList<ArrayList<Integer>> mem = new ArrayList<>();
        int[][] mem = new int[m+1][n+1];
        int count0 = 0, count1 = 0;
        
        for(String s: strs){
            count0 = count1 = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0') count0++;
                else count1++;
            }
            
            for(int i = m; i >= count0; i--)
                for(int j = n; j >= count1; j--)
                    mem[i][j] = Math.max(mem[i][j], mem[i-count0][j-count1]+1);
        }
        
        return mem[m][n];
    }
}