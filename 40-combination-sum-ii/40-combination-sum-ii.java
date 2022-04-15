class Solution {
    public static void help(int[] arr, int ind, int target, List<List<Integer>> res, List<Integer> list){
        if(target < 0 || ind > arr.length) return;
        // if(ind == arr.length){
        if(target == 0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        
        // if(target < arr[ind]){
            for(int i = ind; i < arr.length; i++){
                if(i > ind && arr[i] == arr[i-1]) continue;
                if(arr[i] > target) break;
                list.add(arr[i]);
                help(arr, i+1, target-arr[i], res, list);
                list.remove(list.size()-1);
            }
        // }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        help(candidates, 0, target, result, new ArrayList<Integer>());
        return result;
    }
}