class Solution {
    
    public String arrangeWords(String text) {
        String[] strs = text.toLowerCase().split(" ");
        Arrays.sort(strs, (a,b) ->  a.length() - b.length());
        String res = String.join(" ", strs);
        return Character.toUpperCase(res.charAt(0)) + res.substring(1);
    }
}