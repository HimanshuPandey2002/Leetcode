class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        int c1 = 0;
        int c2 = 0;
        Solve(n, c1, c2, "", ans);
        return ans;
    }
    
    public void Solve(int n, int c1, int c2, String res, List<String> ans){
        if(c1 == n && c2 == n){
            if(isValid(res))
                ans.add(res);
            return ;
        }
        
        if(c1 <= n)
            Solve(n, c1+1, c2, res + '(', ans);
        if(c2 <= n)
            Solve(n, c1, c2+1, res + ')', ans);
    }
    
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if((c == '(') || (c == '{') || (c == '[')){
                st.push(c);
            } else {
                if(st.isEmpty())
                    return false;
                else if(!((c == '}' && st.peek() == '{') ||
                          (c == ')' && st.peek() == '(') ||
                          (c == ']' && st.peek() == '[') )
                       )
                    return false;
                else 
                    st.pop();
            }
        }
        
        return st.isEmpty();
    }
}