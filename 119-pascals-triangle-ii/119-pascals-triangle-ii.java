class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for(int i = 0; i <= rowIndex; i++){
            ArrayList<Integer> l = new ArrayList<Integer>();

            for(int j = 0; j <= i; j++){
                if(j==0 || j == i)
                    l.add(1);
                else {
                    int a = list.get(i-1).get(j-1);
                    int b = list.get(i-1).get(j);
                    l.add(a+b);
                }
            }
            list.add(l);
        }
        
        return list.get(rowIndex);
    }
}