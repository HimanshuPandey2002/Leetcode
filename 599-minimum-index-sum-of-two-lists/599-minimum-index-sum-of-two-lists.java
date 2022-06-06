class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> strs = new ArrayList<>();
        
        int min_sum = Integer.MAX_VALUE;
        
        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list2.length; j++){
                if(list1[i].equals(list2[j])){
                    if(i+j == min_sum)
                        strs.add(list1[i]);
                    else if(i+j > min_sum)
                        continue;
                    else{
                        min_sum = i+j;
                        strs.clear();
                        strs.add(list1[i]);
                    }
                }
            }
        }
        String[] str = new String[strs.size()];
        int ind = 0;
        
        for(String s: strs)
            str[ind++] = s;
        
        return str;
    }
}