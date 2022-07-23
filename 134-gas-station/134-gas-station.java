class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr = 0, count = 0, gs = 0, cs = 0;
        
        for(int i: gas) gs += i;
        for(int i: cost) cs += i;
        
        if(cs > gs) return -1;
        
        for(int i = 0; i < gas.length; i++){
            curr += gas[i] - cost[i];
            if(curr < 0){
                curr = 0;
                count = i + 1;
            }
        }
        
        return count;
    }
}