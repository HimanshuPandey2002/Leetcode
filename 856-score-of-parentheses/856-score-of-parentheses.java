class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<Integer>();
        int res = 0;
        
        for(char ch: s.toCharArray()){
            if(ch == '('){
                st.push(res);
                res = 0;
            }else{
                res = st.pop() + Math.max(2*res, 1);
            }
        }
        return res;
    }
}