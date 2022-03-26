class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int ind = -1;
        for(int i = 0; i < n; i++){
            if(i == ind)
                continue;
            for(int j = n-1; j >= i; j--){
                int val = Math.min(height[i], height[j]) * Math.abs(j-i);
                if(val > max)
                    max = val;
                if(height[i] < height[j]) break;
                if(height[j] < height[i]) ind = i;
            }
        }
        return max;
    }
}