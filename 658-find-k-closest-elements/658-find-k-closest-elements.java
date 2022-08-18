class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(arr.length,(o1,o2)->
        {
               if(Math.abs(o1-x)==Math.abs(o2-x)) 
               {
                   if(o1>o2) return -1;
                   return 1;
               }
               else if(Math.abs(o1-x)>Math.abs(o2-x)) return -1;  
               else return 1;
        });
        
        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
            if(pq.size() > k) pq.remove();
        }
        List<Integer> ans = new ArrayList<>();
        
        while(!pq.isEmpty()) ans.add(pq.remove());
        Collections.sort(ans);
        return ans;
    }
}