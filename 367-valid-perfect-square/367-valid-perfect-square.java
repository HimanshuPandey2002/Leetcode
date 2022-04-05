class Solution {
    public boolean isPerfectSquare(int n) {
        int num = (int)Math.sqrt(n);
        return num * num == n; 
    }
}