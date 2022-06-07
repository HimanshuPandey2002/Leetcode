class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[nums1.length];
        int i, j, k;
        i = j =  k = 0;
        
        while(i < m && j < n)
            arr[k++] = (nums1[i] <= nums2[j]) ? nums1[i++] : nums2[j++];
        while(i < m) arr[k++] = nums1[i++];
        while(j < n) arr[k++] = nums2[j++];
        
        for(int c = 0; c < nums1.length; c++)
            nums1[c] = arr[c];
        
    }
}