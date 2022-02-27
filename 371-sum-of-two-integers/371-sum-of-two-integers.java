class Solution {
    public int getSum(int a, int b) {
        for(int i = 0; i < Math.abs(b); i++){
            if((a < 0 && b < 0) || (a >= 0 && b < 0)){
                a--;
            } else if ((a < 0 && b >= 0) || (a >= 0 && b >= 0)){
                a++;
            }
        }
        return a;
    }
}