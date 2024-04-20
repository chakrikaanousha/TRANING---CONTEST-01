//3. NumberOfStudentsUnableToEatLunch.java

//gave TLE 
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q1 = new ArrayDeque<>();
        Stack<Integer> s1 = new Stack<>();

        for (int i = 0; i < students.length; i++) {
            q1.add(students[i]);
            s1.add(sandwiches[i]);
        }

        while (!q1.isEmpty()) {
            if (q1.peek() == s1.peek()) {
                q1.poll();
                s1.pop();
            } else {
                q1.add(q1.poll());
            }
        }

        return q1.size();
    }
}


