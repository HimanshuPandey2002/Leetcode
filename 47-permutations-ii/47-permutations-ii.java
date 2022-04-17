class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        help(nums, 0, result);
        return result;
    }
    
    private void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void help(int[] arr, int ind, List<List<Integer>> res){
        if(ind == arr.length){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < arr.length; i++)
                list.add(arr[i]);
            if(!res.contains(list))
                res.add(list);
            return ;
        }
        
        for(int i = ind; i < arr.length; i++){
            swap(i, ind, arr);
            help(arr, ind+1, res);
            swap(i, ind, arr);
        }
    }
}