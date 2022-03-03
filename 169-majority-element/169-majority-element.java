class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.merge(nums[i], 1, Integer::sum);
        }
        
        System.out.println(map);
        
        int max = 0;
        int key = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getValue();
            if(num > max){
                max = num;
                key = entry.getKey();
            }
        }
        
        return key;
    }
}