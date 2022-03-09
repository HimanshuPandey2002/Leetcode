class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        
        while(i >= 0 || j >= 0 || carry == 1){
            int n1 = i < 0 ? 0 : num1.charAt(i--) - '0';
            int n2 = j < 0 ? 0 : num2.charAt(j--) - '0';
            sb.append((n1 + n2 + carry) % 10);
            carry = (n1 + n2 + carry) / 10;
        }
        return sb.reverse().toString();
    }
}