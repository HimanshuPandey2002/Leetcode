class Solution {
    int[] di = {-1, 1, 0, 0, -1, -1, 1, 1};
    int[] dj = {0, 0, -1, 1, -1, 1, -1, 1};
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1)
            return -1;
        
        boolean[][] vis = new boolean[n][n];
        vis[0][0] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        
        int count = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                int[] pop = q.remove();
                
                if(pop[0] == n-1 && pop[1] == n-1)
                    return count+1;
                
                for(int k = 0; k < 8; k++){
                    int nexti = di[k]+pop[0];
                    int nextj = dj[k]+pop[1];
                    
                    if(nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && !vis[nexti][nextj] && grid[nexti][nextj] == 0){
                        q.add(new int[] {nexti, nextj});
                        vis[nexti][nextj] = true;
                    }
                }
            } 
            count++;
        }
        
        return -1;
    }
}