class MinStack {
    Stack<Integer>minstack;
    Stack<Integer>mainstack;
    public MinStack() {
       minstack= new Stack<>();
       mainstack=new Stack<>(); 
    }
    
    public void push(int val) {
        mainstack.push(val);
        if(minstack.isEmpty()||val<=minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        if(mainstack.isEmpty()) return;
        int top=mainstack.pop();
        if(top==minstack.peek()){
            minstack.pop();
        }
    }
    
    public int top() {
        if(mainstack.isEmpty()) return 0;
        return mainstack.peek();
    }
    
    public int getMin() {
        if(mainstack.isEmpty()) return 0;
        return minstack.peek();
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