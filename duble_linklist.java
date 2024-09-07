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
public static Node reverseDdl(Node head) {
    if (head == null || head.next == null) {
        return head;
    }
    Node prev = null;
    Node current = head;
    while (current!= null) {
        Node nextTemp = current.next;
        current.next = prev;
        current.back = nextTemp;
        prev = current;
        current = nextTemp;
    }
    return prev;
}
public static Node Add2sum(Node num1, Node num2) {
    Node dummyHead = new Node(0);
    Node curr = dummyHead;
    Node temp1 = num1;
    Node temp2 = num2;
    int carry = 0;
    while (temp1 != null || temp2 != null || carry != 0) {
        int sum = carry;
        if (temp1 != null) {
            sum += temp1.data;
            temp1 = temp1.next;
        }
        if (temp2 != null) {
            sum += temp2.data;
            temp2 = temp2.next;
        }
        Node newNode = new Node(sum % 10);
        carry = sum / 10;
        curr.next = newNode;
        curr = curr.next;
    }
    return dummyHead.next;
}
public static Node oddThenEven(Node head) {
    Node odd = null;
    Node even = null;
    Node oddTail = null;
    Node evenTail = null;

    Node temp = head;
    while (temp != null) {
        Node nextTemp = temp.next;
        if (temp.data % 2 != 0) { // odd element
            if (odd == null) {
                odd = temp;
                oddTail = temp;
            } else {
                oddTail.next = temp;
                temp.back = oddTail;
                oddTail = temp;
            }
        } else { // even element
            if (even == null) {
                even = temp;
                evenTail = temp;
            } else {
                evenTail.next = temp;
                temp.back = evenTail;
                evenTail = temp;
            }
        }
        temp.next = null; // break the link to prevent infinite loop
        temp = nextTemp;
    }

    // connect the odd and even lists
    if (odd != null) {
        oddTail.next = even;
        if (even != null) {
            even.back = oddTail;
        }
        return odd;
    } else {
        return even;
    }
}
public static Node zeroonetwo(Node head) {
    Node zeroHead = null;
    Node zeroTail = null;
    Node oneHead = null;
    Node oneTail = null;
    Node twoHead = null;
    Node twoTail = null;

    Node temp = head;
    while (temp!= null) {
        Node nextTemp = temp.next;
        temp.next = null; // break the link to prevent infinite loop

        if (temp.data == 0) {
            if (zeroHead == null) {
                zeroHead = temp;
                zeroTail = temp;
            } else {
                zeroTail.next = temp;
                zeroTail = temp;
            }
        } else if (temp.data == 1) {
            if (oneHead == null) {
                oneHead = temp;
                oneTail = temp;
            } else {
                oneTail.next = temp;
                oneTail = temp;
            }
        } else if (temp.data == 2) {
            if (twoHead == null) {
                twoHead = temp;
                twoTail = temp;
            } else {
                twoTail.next = temp;
                twoTail = temp;
            }
        }

        temp = nextTemp;
    }

    // connect the lists
    if (zeroHead!= null) {
        zeroTail.next = oneHead;
        if (oneHead!= null) {
            oneTail.next = twoHead;
        } else {
            zeroTail.next = twoHead;
        }
    } else if (oneHead!= null) {
        oneTail.next = twoHead;
    }

    return zeroHead!= null? zeroHead : oneHead!= null? oneHead : twoHead;
}
//     public static void main(String[] args) {
//         int arr[] = {12, 5, 8, 7};
//         Node head = convertArrayToDoublyLinkedList(arr);
//         System.out.println("Convert array into doubly linked list:");
//         printList(head);

//         // Node head2 = deleteHead(head);
//         // System.out.println("Delete head from linked list:");
//         // printList(head2);

//         // Node head3 = deleteTail(head2);
//         // System.out.println("Delete tail from linked list:");
//         // printList(head3);
        
       
// //         Node head4 = deleteKelement(head, 4); // delete the 3rd element
// // System.out.println("Delete kth element from linked list:");
// // printList(head4);

// //         Node head4 = insertElement(head, 20); // delete the 3rd element
// // System.out.println("insert head before head element from linked list:");
// // printList(head4);

// //     Node head5 = Inserttailbefore(head, 30); // delete the 3rd element
// // System.out.println("insert node  before tail element from linked list:");
// // printList(head5);

// Node head5 = insertbeforekelement(head,4, 40); // delete the 3rd element
// System.out.println("insert node  before kth element from linked list:");
// printList(head5);
//     }
//     Node head6 = reverseDdl(head); // delete the 3rd element
// System.out.println("reverse linklist linked list:");
// printList(head6);
//     }
// public static void main(String[] args) {
//     int arr[] = {12, 5, 8, 7};
//     Node head = convertArrayToDoublyLinkedList(arr);
//     System.out.println("Convert array into doubly linked list:");
//     printList(head);

//     //...

//     // Node head5 = insertbeforekelement(head, 4, 40); // delete the 3rd element
//     // System.out.println("insert node  before kth element from linked list:");
//     // printList(head5);

//     Node head6 = reverseDdl(head); // delete the 3rd element
//     System.out.println("reverse linklist linked list:");
//     printList(head6);
    
//     Node head8 = oddThenEven(head); // delete the 3rd element
//     System.out.println("odd then even  linked list:");
//     printList(head8);
    
//     int num1[] = {5, 10, 15};
// int num2[] = {20, 25, 30, 35};

// Node head1 = convertArrayToDoublyLinkedList(num1);
// Node head2 = convertArrayToDoublyLinkedList(num2);

// Node head7 = Add2sum(head1, head2);
// System.out.println("add 2 two summ of a double linklist:");
// printList(head7);//57893 answer
// }
public static void main(String[] args) {
    // int arr[] = {12, 5, 8, 7}; 
    // int arr[] = {1, 3, 4, 5, 6, 7, 8 };
    int arr[] = {1 ,0, 1, 2, 0, 2, 1 };
    Node head = convertArrayToDoublyLinkedList(arr);
    System.out.println("Convert array into doubly linked list:");
    printList(head);

    // Node head8 = oddThenEven(head); // reorder the list
    // System.out.println("odd then even linked list:");
    // printList(head8);
    Node head8 = zeroonetwo(head); // reorder the list
    System.out.println("zero one two  linked list:");
    printList(head8);
}
}