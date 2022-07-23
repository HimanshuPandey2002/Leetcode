class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] arr = new int[n];
        ArrayList<Integer> ind = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
            if(boxes.charAt(i) == '1')
                ind.add(i);
        
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            for(int j: ind){
                arr[i] += Math.abs(j-i); 
            }    
        }
        
        return arr;
    }
}