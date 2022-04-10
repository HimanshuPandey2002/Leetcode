class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> score = new Stack<Integer>();
        
        for(String c: ops){
            if (c.equals("+")){
                int num1 = score.pop();
                int num2 = score.peek();
                score.push(num1);
                score.push(num1+num2);
            } 
            else if (c.equals("D"))
                score.push(score.peek() * 2);
            else if (c.equals("C"))
                score.pop();
            else
                score.push(Integer.valueOf(c));
        }
        int sum = 0;
        
        while(!score.isEmpty()){
            sum += score.pop();
        }
        return sum;
    }
}