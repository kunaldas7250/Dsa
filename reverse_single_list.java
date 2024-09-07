public class Solution
{
    public static Node reverseLinkedList(Node head)
    {
        // Write your code here.
        Node temp=head;
        Node prev=null;
        while(temp!=null){
          Node  front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}