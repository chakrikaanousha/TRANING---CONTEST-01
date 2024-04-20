//1. QueueUsingStacks.java
//https://leetcode.com/problems/implement-queue-using-stacks/description/

class MyQueue {
            //create 2 new sytacks:

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

    public MyQueue() {


    }

    //Pushes element x to the back of the queue.
    public void push(int x) {
        //push => add the elements on to the stack
        s1.add(x);
    }
    
    public int pop() {//Removes the element from the front of the queue and returns it.
        
        //pop - remove the first elemetn added
        //base case
        if(!s2.isEmpty()){
           return s2.pop();
        }
        //s2 = empty --> its the first pop operation after all the pushes
            while(!s1.isEmpty()){
                //all poped elements will be added on to s2
                s2.add(s1.pop());
            }
            return s2.pop();        
    }
    
    public int peek() {//Returns the element at the front of the queue.
    //case 1. s2 has elemets
    if(!s2.isEmpty()){
        return s2.peek();
    }
    //case 2. elemts only pushed so far - present in the s1 only
    while(!s1.isEmpty()){
        //empty all of the s1
        s2.add(s1.pop());
    }
    return s2.peek();
    }
    
    public boolean empty() {
        // Returns true if the queue is empty, false otherwise.

        //check pushing wala stack s1 and pop wala stack too 
        return s1.isEmpty() && s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
