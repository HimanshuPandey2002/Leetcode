class Solution {
    public int minCost(int n, int[] cuts) {
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        return solve(cuts, 0, n, map);
    }
    
    public int solve(int[] cuts, int l, int r, HashMap<ArrayList<Integer>, Integer> map){
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(l); list.add(r);
        
        if(map.containsKey(list)) return map.get(list);
        
        int min = Integer.MAX_VALUE;
        
        for(int i: cuts){
            if(i <= l || i >= r) continue;
            int temp = solve(cuts, l, i, map) + solve(cuts, i, r, map);
            min = Math.min(temp + r - l, min);
        }
        
        if(min == Integer.MAX_VALUE) min = 0;
        
        map.put(list, min);
        return min;
    }
}