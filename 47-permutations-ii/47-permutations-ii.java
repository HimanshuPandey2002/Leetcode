class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        help(nums, 0, res);
        return res;
    }
    
    private void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void help(int[] arr, int ind, List<List<Integer>> res){
        if(ind == arr.length){
            List<Integer> list = new ArrayList<Integer>();
            for(int i: arr) list.add(i);
            res.add(list);
            return ;
        }
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = ind; i < arr.length; i++){
            if(set.add(arr[i])){
                swap(i, ind, arr);
                help(arr, ind+1, res);
                swap(i, ind, arr);   
            }
        }
    }
}