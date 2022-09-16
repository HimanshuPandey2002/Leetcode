class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length, n = n1+n2;
        int[] arr = new int[n];
        merge(arr, nums1, nums2, n1, n2);
        
        if(n % 2 == 1) return arr[(n-1)/2];
        else return (arr[n/2] + arr[(n-1)/2])/2.0;
    }
    
    public void merge(int[] arr, int[] nums1, int[] nums2, int n1, int n2){
        int i = 0, j = 0, k = 0;
        
        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j]) arr[k++] = nums1[i++];
            else arr[k++] = nums2[j++];
        }
        while(i < n1) arr[k++] = nums1[i++];
        while(j < n2) arr[k++] = nums2[j++];
    }
}