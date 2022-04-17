class Solution {
//     public List<List<Integer>> permuteUnique(int[] nums) {
//         List<List<Integer>> result = new ArrayList<List<Integer>>();
//         help(nums, 0, result);
//         return result;
//     }
    
//     private void swap(int i, int j, int[] arr){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
    
//     public void help(int[] arr, int ind, List<List<Integer>> res){
//         if(ind == arr.length){
//             ArrayList<Integer> list = new ArrayList<Integer>();
//             for(int i = 0; i < arr.length; i++)
//                 list.add(arr[i]);
//             if(!res.contains(list))
//                 res.add(list);
//             return ;
//         }
        
//         for(int i = ind; i < arr.length; i++){
//             swap(i, ind, arr);
//             help(arr, ind+1, res);
//             swap(i, ind, arr);
//         }
//     }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums==null || nums.length==0) { return ans; }
        permute(ans, nums, 0);
        return ans;
    }
    
    private void permute(List<List<Integer>> ans, int[] nums, int index) {
        if (index == nums.length) { 
            List<Integer> temp = new ArrayList<>();
            for (int num: nums) { temp.add(num); }
            ans.add(temp);
            return;
        }
        Set<Integer> appeared = new HashSet<>();
        for (int i=index; i<nums.length; ++i) {
            if (appeared.add(nums[i])) {
                swap(nums, index, i);
                permute(ans, nums, index+1);
                swap(nums, index, i);
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int save = nums[i];
        nums[i] = nums[j];
        nums[j] = save;
    }
}