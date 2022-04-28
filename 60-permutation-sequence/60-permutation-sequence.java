class Solution {    
    
    public String getPermutation(int n, int k) {
        String res = "";
        
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        
        int fact = 1;
        
        for(int i = 1; i < n; i++){
            fact = fact * i;
            arr.add(i);
        }
        
        System.out.println(fact);
        
        arr.add(n);
        
        k = k-1;
        while(arr.size() > 0){
            res += String.valueOf(arr.get(k / fact));
            arr.remove(k/fact);
            if(arr.size() == 0) break;
            k = k % fact;
            fact = fact / arr.size();
            
        }
        
        return res;
    }
}