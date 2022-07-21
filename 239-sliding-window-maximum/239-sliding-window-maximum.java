class Solution {
    public int[] maxSlidingWindow(int[] A, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int j = 0, i = 0; j < A.length; j++){
            while(list.size() > 0 && list.get(list.size()-1) < A[j])
                list.remove(list.size()-1);
            list.add(A[j]);
            
            if(j-i+1 == k){
                ans.add(list.get(0));
                if(list.get(0) == A[i++])
                    list.remove(0);
            }
        }
        
        return ans.stream().mapToInt(l -> l).toArray();
    }
}