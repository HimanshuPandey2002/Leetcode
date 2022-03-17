class MinStack {
    private ArrayList<Integer> list = new ArrayList<Integer>();
    private int top = -1;
    private int min = 0;
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        top++;
        list.add(val);
        if(val < list.get(min))
            min = top;
    }
    
    public void pop() {
        if(top == min){
            min = 0;
            for(int i = 0; i < list.size()-1; i++)
                if(list.get(i) < list.get(min))
                    min = i;
        }
        list.remove(top--);
        
    }
    
    public int top() {
        return list.get(top);
    }
    
    public int getMin() {
        return list.get(min);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */