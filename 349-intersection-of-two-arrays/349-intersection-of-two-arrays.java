class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        
        for(int i : nums1)
            set.add(i);
        
        for(int i: nums2)
            if(set.contains(i))
                ans.add(i);
        
        int[] res = new int[ans.size()];
        
        int i = 0;
        
        for(Integer it: ans)
            res[i++] = it;
        
        return res;
    }
}