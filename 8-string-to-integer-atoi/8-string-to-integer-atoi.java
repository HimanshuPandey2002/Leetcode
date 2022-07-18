class Solution {
    final int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
    
    public int myAtoi(String str) {
        String s = str.trim();
        int n = s.length();
        if(n == 0 || s.isEmpty()) return 0;
        
        int sign = 1, i = 0;
        long num = 0;
                
        if (s.charAt(i) == '-' || s.charAt(i) == '+')
            sign = s.charAt(i++) == '-' ? -1 : 1;
        
        while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            if(num > MAX/10 || (num == MAX/10 && s.charAt(i) - '0' > 7))
                return (sign == -1) ? MIN : MAX;
            num = 10 * num + (s.charAt(i++) - '0');
        }
        
        return (int)num * sign;
    }
}