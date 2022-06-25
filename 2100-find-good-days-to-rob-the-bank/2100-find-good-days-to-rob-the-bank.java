class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n = security.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        for(int i = 1; i < n; i++)
            left[i] = security[i] <= security[i-1] ? left[i-1] + 1 : 0;
        
        for(int i = n-2; i >= 0; i--)
            right[i] = security[i] <= security[i+1] ? right[i+1] + 1 : 0;
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = time; i < n-time; i++)
            if(left[i] >= time && right[i] >= time)
                list.add(i);
        
        return list;
    }
}