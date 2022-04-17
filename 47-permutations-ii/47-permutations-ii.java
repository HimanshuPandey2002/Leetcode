class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        help(nums, result, new ArrayList<Integer>(), new boolean[nums.length]);
        return result;
    }
    
    public void help(int[] arr, List<List<Integer>> res, ArrayList<Integer> list, boolean[] map){
        if(list.size() == arr.length){
            ArrayList<Integer> l = new ArrayList<Integer>(list);
            if(!res.contains(l))
                res.add(l);
            return;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(!map[i]){
                map[i] = true;
                list.add(arr[i]);
                help(arr, res, list, map);
                list.remove(list.size()-1);
                map[i] = false;
            }
        }
    }
}