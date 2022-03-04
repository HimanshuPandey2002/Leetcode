class Solution {
    public boolean checkStraightLine(int[][] p) {
//         int dx = p[1][0] - p[0][0];
//         int dy = p[1][1] - p[0][1];
        
//         for(int i = 0; i < p.length; i++){
//             if(dx * p[i][1]-p[1][1] != dy * p[i][0]-p[1][0])
//                 return false;
//         }
//         return true;
        int dx = p[1][0] - p[0][0];
        int dy = p[1][1] - p[0][1];
        
        for (int[] co : p) {
            int x = co[0], y = co[1];
            if (dx * (y - p[1][1]) != dy * (x -  p[1][0]))
                return false;
        }
        return true;
    }
}