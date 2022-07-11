class Solution {
    public int reverse(int x) {
        char[] ch = String.valueOf(x).toCharArray();
        int i = 0, j = ch.length - 1;

        while( i <= j){
            if(Character.isDigit(ch[i])){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j--] = temp;
            }
            i++;
        }
        long num = Long.valueOf(String.valueOf(ch));
        return (num > 2147483647 || num < -2147483647) ? 0 : (int)num;
    }
}