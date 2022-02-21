class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i: nums)
            if(!list.contains(i))
                list.add(i);
        return (list.size() - 3 < 0 ) ? list.get(list.size()-1) : list.get(list.size() - 3);
    }
}