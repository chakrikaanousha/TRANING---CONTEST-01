//4. StackUsingQueues.javaclass MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
        
    }
    //here q1 acts as an acting stack - while q2 helps in covering up for the push operation

    public void push(int x) {

        //in queue case - its FIFO so => new element added will be pushe d tot he end
        // so in such case => put all the previous ele in a anothe queue and let the new ele added on to the 
        // queue fist and then add the prev eleemts to - more likr line's cutting through'
        while(q1.size()>0){
            q2.add(q1.poll());
        }

        //add the new ele - trating as VIP
        q1.add(x);

        //and now bend him add all the prev elements
        while(q2.size()>0){
            q1.add(q2.poll());
        }
        return;
    }
    
    public int pop() {
        return q1.poll();
        //pushes out the first ele added - that's everytime the recently pushed element
    }
    
    public int top() {
       return q1.peek();
        
    }
    
    public boolean empty() {
        return q1.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//https://leetcode.com/problems/implement-stack-using-queues/description/

