class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Integer> st = new Stack<Integer>();
        boolean[] vis = new boolean[26];
        int[] lt = new int[26];
        
        for(int i = 0; i < s.length(); i++)
            lt[s.charAt(i)-'a'] = i;
        
        for(int i = 0; i < s.length(); i++){
            int curr = s.charAt(i) - 'a';
            if(vis[curr])
                continue;
            
            while(!st.isEmpty() && st.peek() > curr && i < lt[st.peek()])
                vis[st.pop()] = false;
            
            st.push(curr);
            vis[curr] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!st.isEmpty())
            sb.append((char)(st.pop()+'a'));
        
        return sb.reverse().toString();        
    }
}