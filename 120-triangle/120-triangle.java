class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        
        int[] A = new int[n + 1];
        
        for(int i = n - 1; i >= 0; i--) 
            for(int j = 0; j < triangle.get(i).size(); j++) 
                A[j] = Math.min(A[j], A[j+1]) + triangle.get(i).get(j);
            
        return A[0];
    }
}