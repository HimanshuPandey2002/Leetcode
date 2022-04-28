class Solution {
    private int[] d = {0, 1, 0, -1, 0};
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        int[][] efforts = new int[m][n];
        for (int[] e : efforts) {
            Arrays.fill(e, Integer.MAX_VALUE);
        }
        efforts[0][0] = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[3]);
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int effort = cur[0], x = cur[1], y = cur[2];
            for (int k = 0; k < 4; ++k) {
                int r = x + d[k], c = y + d[k + 1];
                if (0 <= r && r < m && 0 <= c && c < n && efforts[r][c] > Math.max(effort, Math.abs(heights[r][c] - heights[x][y]))) {
                    int nextEffort = Math.max(effort, Math.abs(heights[r][c] - heights[x][y]));
                    efforts[r][c] = nextEffort;
                    q.offer(new int[]{nextEffort, r, c});
                }
            }
        }
        return efforts[m - 1][n - 1];
    }
}