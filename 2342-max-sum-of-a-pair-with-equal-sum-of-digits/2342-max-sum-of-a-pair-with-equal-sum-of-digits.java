class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = -1;
        
        for(int num: nums){
            int s = sum(num);
            if(!map.containsKey(s))
                map.put(s, num);
            else{
                res = Math.max(res, map.get(s) + num);
                map.put(s, Math.max(map.get(s), num));
            }
        }
        return res;
    }
    
    public int sum(int num){
        int sum = 0;
        
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        
        return sum;
    }
}