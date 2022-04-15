class Solution {
    public static void help(int[] arr, int ind, int target, List<Integer> list, List<List<Integer>> res){
        if(target < 0 || ind >= arr.length) return;
        if(target == 0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        
        list.add(arr[ind]);
        help(arr, ind, target - arr[ind], list, res);
        
        list.remove(list.size()-1);
        help(arr, ind+1, target, list, res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        help(candidates, 0, target, list, l);
        return l;
    }
}