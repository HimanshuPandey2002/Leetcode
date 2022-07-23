class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for(String s: tokens){
            switch(s){
                case "+":
                    st.push(st.pop() + st.pop());
                    break;
                case "-":
                    st.push(-st.pop() + st.pop());
                    break;
                case "*":
                    st.push(st.pop() * st.pop());
                    break;
                case "/":
                    st.push((int)((double)1/((double)st.pop() / (double)st.pop())));
                    break;
                default:
                    st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
    }
}