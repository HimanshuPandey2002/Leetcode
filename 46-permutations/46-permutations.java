class Solution {
    private void recursion(List<List<Integer>> ans, List<Integer> list, int[] nums, boolean[] freq){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                list.add(nums[i]);
                recursion(ans, list, nums, freq);
                list.remove(list.size() - 1);
                freq[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        boolean freq[] = new boolean[nums.length];
        recursion(ans, list, nums, freq);
        return ans;
    }
}