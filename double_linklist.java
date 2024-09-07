public class Node {
    int data;
    Node next;
    Node back;

    // Constructor for setting data and next node
    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    // Constructor for setting only data, next node is null
    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }

    public static void printList(Node head) {
        while (head!= null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node convertArrayToDoublyLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node newHead = head.next;
        newHead.back = null;
        head.next = null;
        return newHead;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next!= null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        prev.next = null;
        tail.back = null;
        return head;
    }
  public static Node deleteKelement(Node head, int k) {
    if (head == null) {
        return null;
    }
    Node temp = head;
    int cnt = 1;
    while (temp!= null) {
        if (cnt == k) {
            break;
        }
        cnt++;
        temp = temp.next;
    }
    if (temp == null) {
        return head;
    }
    if (temp.back == null) {
        head = temp.next;
        head.back = null;
    } else if (temp.next == null) {
        temp.back.next = null;
    } else {
        temp.back.next = temp.next;
        temp.next.back = temp.back;
    }
    return head;
}
public static Node insertElement(Node head, int val) {
    Node newHead = new Node(val, head, null);
    if (head != null) {
        head.back = newHead;
    }
    return newHead;
}
public static Node Inserttailbefore(Node head,int val){
    Node tail=head;
    while(tail.next!=null){
        tail=tail.next;
    }
    Node prev=tail.back;
    Node newNode=new Node(val,tail,prev);
    prev.next=newNode;
    tail.back=newNode;
    return head;
}
public static Node insertbeforekelement(Node head ,int k,int val){
    if(k==1){
        return insertElement(head,val);
    }
    Node temp=head;
    int cnt=0;
    while(temp!=null){
        cnt++;
        if(cnt==k){
            break;
        }
        temp=temp.next;
    }
    Node prev=temp.back;
    Node newNode=new Node(val,temp,prev);
    prev.next=newNode;
    temp.back=newNode;
    return head;
}
    public static void main(String[] args) {
        int arr[] = {12, 5, 8, 7};
        Node head = convertArrayToDoublyLinkedList(arr);
        System.out.println("Convert array into doubly linked list:");
        printList(head);

        // Node head2 = deleteHead(head);
        // System.out.println("Delete head from linked list:");
        // printList(head2);

        // Node head3 = deleteTail(head2);
        // System.out.println("Delete tail from linked list:");
        // printList(head3);
        
       
//         Node head4 = deleteKelement(head, 4); // delete the 3rd element
// System.out.println("Delete kth element from linked list:");
// printList(head4);

//         Node head4 = insertElement(head, 20); // delete the 3rd element
// System.out.println("insert head before head element from linked list:");
// printList(head4);

//     Node head5 = Inserttailbefore(head, 30); // delete the 3rd element
// System.out.println("insert node  before tail element from linked list:");
// printList(head5);

Node head5 = insertbeforekelement(head,4, 40); // delete the 3rd element
System.out.println("insert node  before kth element from linked list:");
printList(head5);
    }
}