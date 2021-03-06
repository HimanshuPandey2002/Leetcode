class Solution {
    public static double calc(double x, int n){
        if(n == 0) return 1;
        if(n == 1) return x;
        
        double ans = calc(x, n/2);
        
        return (n % 2 == 0) ? ans * ans :  x * ans * ans;
    }
    public double myPow(double x, int n) {
        if(n >= 0)
            return calc(x, n);
        else{
            double num = calc(x, Math.abs(n));
            return 1/num;
        }
    }
}