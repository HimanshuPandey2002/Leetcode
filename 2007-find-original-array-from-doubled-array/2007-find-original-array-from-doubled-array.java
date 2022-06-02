class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n % 2 != 0) return new int[0];
        
        Arrays.sort(changed);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[n/2];
        int ind = 0;
        
        for(int i = n-1; i >= 0; i--){
            int el = changed[i];
            int dbl = 2 * el;
            if(map.containsKey(dbl)){
                if(map.get(dbl) == 1) map.remove(dbl);
                else map.put(dbl, map.get(dbl)-1);
                res[ind++] = el;
            } else
               map.put(el,map.getOrDefault(el,0) + 1);
        }
        
        return ind == n/2 ? res : new int[0];
    }
}