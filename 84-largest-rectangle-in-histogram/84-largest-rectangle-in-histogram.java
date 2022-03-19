class Solution {
    public static int[] nextSmallerElement(int[] nums){
        Stack<Integer> st = new Stack<Integer>();
        int[] ans = new int[nums.length];
        st.push(-1);

        for(int i = nums.length - 1; i >= 0; i--){
            while(st.peek() != -1 && nums[st.peek()] >= nums[i]) st.pop();
            ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
    
    public static int[] prevSmallerElement(int[] nums){
        Stack<Integer> st = new Stack<Integer>();
        int[] ans = new int[nums.length];
        st.push(-1);

        for(int i = 0; i < nums.length; i++){
            while(st.peek() != -1 && nums[st.peek()] >= nums[i]) st.pop();
            ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
    
    public int largestRectangleArea(int[] heights) {
        int[] next = nextSmallerElement(heights);
        int[] prev = prevSmallerElement(heights);
        int max_area = Integer.MIN_VALUE;
        
        for(int i = 0; i < heights.length; i++){
            if(next[i] == -1)
                next[i] = heights.length;
            int width = next[i] - prev[i] - 1;
            max_area = Math.max(heights[i] * width, max_area);
        }
        return max_area;
    }
}