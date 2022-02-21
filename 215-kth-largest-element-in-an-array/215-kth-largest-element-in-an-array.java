class Solution {
    public int findKthLargest(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        Arrays.sort(nums);
        
        for(int i : nums)
            list.add(i);
        
        return list.get(list.size() - k);
    }
}