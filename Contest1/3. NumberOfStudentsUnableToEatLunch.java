//3. NumberOfStudentsUnableToEatLunch.java
//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int len = students.length; // Sandwiches will be the same length

        //STORE THE STUDENTS IN A QUEUE
        Queue<Integer> studentQueue = new LinkedList<>();
        //STORE THE SANDWICH IN A STACK
        Stack<Integer> sandwichStack = new Stack<>();
        
        // Add students and sandwiches to the queue and stack
        for (int i = 0; i < len; i++) {
            sandwichStack.push(sandwiches[len - i - 1]);
            //[0,1,0,1] => 1 => 0,1=> 1,0,1 =>0,1,0,1
            studentQueue.offer(students[i]);
        }

        // Simulate the lunch process by serving sandwiches 
        // or sending students to the back of the queue.
        int lastServed = 0;
        while (studentQueue.size() > 0 && lastServed < studentQueue.size()) {
            //Sandwich and students are equal 
            if (sandwichStack.peek() == studentQueue.peek()) {
                sandwichStack.pop(); // Serve sandwich
                studentQueue.poll(); // Student leaves queue
                lastServed = 0;

            } else {
                // Student moves to back of queue
                studentQueue.add(studentQueue.poll()); 
                lastServed++;
            }
        }
        // Remaining students in queue are unserved students
        return studentQueue.size();    
    }
}
