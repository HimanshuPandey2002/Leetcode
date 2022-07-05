class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int c1 = 0, c2 = 0;
        int e1 = -1, e2 = -1;
        
        for(int i : nums){
            if(i == e1) c1++;
            else if(i == e2) c2++;
            else if(c1 == 0){
                e1 = i;
                c1 = 1;
            } else if(c2 == 0){
                e2 = i;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        c1 = c2 = 0;
        for(int i : nums){
            if(i == e1) c1++;
            if(i == e2) c2++;
        }
        
        if(c1 > nums.length/3)
            list.add(e1);
        if(c2 > nums.length/3)
            if(!list.contains(e2))
            list.add(e2);
        
        return list;
    }
}