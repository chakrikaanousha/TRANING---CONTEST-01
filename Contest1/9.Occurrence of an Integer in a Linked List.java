//Occurrence of an Integer in a Linked List
//https://www.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article


class Solution
{
    public static int count(Node head, int key)
    {
        //code here

      //1.create a pointer
        Node pointer = head;
        int cnt = 0; 
      //2. iterate through linkedlist - pointer != null  
        while(pointer != null){
          //3. pointer.data == key
            if(pointer.data == key){
                cnt = cnt + 1;
            }
          //to iterate - while condition
            pointer = pointer.next;
        }
      //4.return occurrence cnt
        return cnt;
    }
}
