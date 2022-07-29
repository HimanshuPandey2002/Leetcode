class Solution {
    public boolean isHappy(int n) {
        if (n <= 0) return false;
        
        while (true) {
            if (n == 1) return true;
            if (n == 4) return false;
            int t = 0;
            while(n != 0) {
                t += (n % 10) * (n % 10);
                n /= 10;
            }
            n = t;
        }
    }
}