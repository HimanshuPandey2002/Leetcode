class Solution {
    String[] arr = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        
        if(digits.length() == 0) 
            return ans;
        
        Solve(digits, ans, "", 0);
        return ans;
    }
    
    private void Solve(String digits, List<String> ans, String comb, int ind){
        if(ind == digits.length()){
            ans.add(comb);
            return;
        }
        
        String str = arr[Integer.parseInt(String.valueOf(digits.charAt(ind)))-2];
        
        for(char c: str.toCharArray()){
            Solve(digits, ans, comb+c, ind+1);            
        }
    }
    
}