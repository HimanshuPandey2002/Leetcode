class Solution {
    public static void help(int[] arr, int ind, int target, List<List<Integer>> res, List<Integer> list, int k){
        if(target == 0){
            if(list.size() == k)
                res.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = ind; i < arr.length; i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

                list.add(arr[i]);
                help(arr, i+1, target-arr[i], res, list, k);
                list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int[] arr = new int[9];
        for(int i = 0; i <= 8; i++)
            arr[i] = i+1;
        help(arr, 0, n, result, new ArrayList<Integer>(), k);
        return result;
    }
}