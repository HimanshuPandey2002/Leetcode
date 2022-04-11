class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        while(k-- > 0){
            int prev = grid[0][0];
            
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[0].length; j++){
                    int curr = grid[i][j];
                    grid[i][j] = prev;
                    prev = curr;
                }
            }
            grid[0][0] = prev;
        }
        
        for(int i = 0; i < grid.length; i++){
            List<Integer> l = new ArrayList<Integer>();
            for(int j = 0; j < grid[0].length; j++){
                l.add(grid[i][j]);
            }
            list.add(l);
        }
        
        return list;
    }
}