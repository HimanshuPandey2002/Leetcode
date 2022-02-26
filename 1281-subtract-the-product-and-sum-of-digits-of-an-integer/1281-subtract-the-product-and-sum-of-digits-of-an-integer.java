class Solution {
    public int subtractProductAndSum(int num) {
        int sum = 0;
        int pro = 1;
        
        while(num != 0){
            int rem = num%10;
            sum += rem;
            pro *= rem;
            num = num/10;
        }
        return pro-sum;
    }
}