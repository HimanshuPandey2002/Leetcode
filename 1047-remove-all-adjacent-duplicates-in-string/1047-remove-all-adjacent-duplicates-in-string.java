class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        
        for(char c : s.toCharArray()){
            if(st.isEmpty()) st.push(c);
            else {
                if(st.peek() == c) st.pop();
                else st.push(c);
            }
        }
        
        String ans = "";
        for(char c : st)
            ans = ans + c;
        
        return ans;
    }
}