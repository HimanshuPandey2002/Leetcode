class Solution {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(-1);
        for(int i = 0; i < str.length; i++)
            if(str[i] == ' ')
                list.add(i);
        list.add(str.length);
        
        for(int n = 0; n < list.size()-1; n++){
            int i = list.get(n)+1;
            int j = list.get(n+1)-1;
            
            while(i <= j){
                char c = str[i];
                str[i] = str[j];
                str[j] = c;
                i++;
                j--;
            }
        }
        
        
        return  String.valueOf(str);
    }
}
