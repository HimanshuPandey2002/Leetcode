class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;
        if(x == 2 || x == 3) return 1;
        
        long i;
        for(i = 1; i <= x; i++){
            if(i*i == x) return (int)i;
            if(i*i > x) return (int)(i-1);
        }
        return x;
    }
}