//8. MiddleOfTheLL.java
# Concept

// <aside>
// 💡 **FLYOD WARSHALL ALGORITHM:**

// Rabbit - Tortoise Concept

// a race between hare and tortoise, Hare advances 2 steps at a time,
// Tortoise advances 1 step at a time. In a circle track, hare covers a 
// distance a 2x then tortoise covers a distance of x .


// According to question, 

// - hare(fast pointer: advancing 2 steps at a time)

// -tortoise(slow pointer: advancing 1 step at a time)

  //{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            int ans = g.getMiddle(head);
            System.out.println(ans);
            //printList(head); 
            t--;
        }
    } 
} 
   
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         //use HARE TORTOISE ALGORITHM
         //intialise two pointers:
         Node hare = head;
         Node tortoise = head;
         
         //use a while loop
         while(hare !=null && hare.next!=null ){
             
             tortoise = tortoise.next;
             hare = hare.next.next;
            
         }
         return tortoise.data;
    }
}
