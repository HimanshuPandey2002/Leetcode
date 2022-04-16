class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();  
        Arrays.sort(nums);
        help(nums, 0, res, new ArrayList<Integer>());
        return res;
    }
    
    public static void help(int[] arr, int ind, List<List<Integer>> res, ArrayList<Integer> list){
        res.add(new ArrayList<Integer>(list));
        
        for(int i = ind; i < arr.length; i++){
            if(i != ind && arr[i] == arr[i-1]) continue;
            list.add(arr[i]);
            help(arr, i+1, res, list);
            list.remove(list.size()-1);
        }
    }
}