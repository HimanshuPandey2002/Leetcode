class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.replace(nums[i], 2);
        }
        int ele = -1;
        for(HashMap.Entry m : map.entrySet()){
            if((int)m.getValue() == 1)
                ele = (int)(m.getKey());
        }
        return ele;
    }
}