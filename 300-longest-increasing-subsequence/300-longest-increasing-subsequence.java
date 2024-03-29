class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > temp.get(temp.size()-1))
                temp.add(nums[i]);
            else{
                int pos = Collections.binarySearch(temp, nums[i]);
                if(pos < 0) pos = Math.abs(pos)-1;
                temp.set(pos, nums[i]);
            }
        }
        return temp.size();
    }
}