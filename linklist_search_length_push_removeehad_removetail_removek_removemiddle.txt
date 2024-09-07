class Node {
    int data;
    Node next;

    // Constructor for setting data and next node
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor for setting only data, next node is null
    Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}

public class LinkList {
    private static Node convert(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static int lengthall(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public static boolean SearchKey(Node head) {
        int search = 8;
        Node temp = head;
        while (temp != null) {
            if (temp.data == search) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static Node Reomvehead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    // public static Node removek(Node head, int k) {
    //     if (head == null) return head;
    //     if (k == 1) {
    //         return head.next;
    //     }
    //     Node temp = head;
    //     for (int i = 1; i < k - 1; i++) {
    //         if (temp != null) {
    //             temp = temp.next;
    //         }
    //     }
    //     if (temp != null && temp.next != null) {
    //         temp.next = temp.next.next;
    //     }
    //     return head;
    // }
public static int removek(Node head, int k) {
    if (head == null) return 0;
    if (k == 1) {
        int removedValue = head.data;
        head = head.next;
        return removedValue;
    }
    Node temp = head;
    for (int i = 1; i < k - 1; i++) {
        if (temp != null) {
            temp = temp.next;
        }
    }
    if (temp != null && temp.next != null) {
        temp.next = temp.next.next;
    }
    return 0;
}
    public static Node Removemiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static Node Removetail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
public static Node InsertNode(Node head, int val) {
    Node newNode = new Node(val);
    newNode.next = head;
    return newNode;
}
public static Node Inserttail(Node head,int val){
    if(head==null){
        return new Node(val);
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    Node newNode=new Node(val);
    temp.next=newNode;
    return head;
}
public static Node InserkPostion(Node head,int val,int k){
    if(head==null){
        if(k==1){
                    return new Node(val);
        }
        else{
            return head;
        }
    }
    if(k==1){
        return new Node(val,head);
    }
    int cnt=0;
    Node temp=head;
    while(temp!=null){
       cnt++;
       if(cnt==(k-1)){
           Node x=new Node(val,temp.next);
           temp.next=x;
           break;
       }
       temp=temp.next;
    }
    return head;
}
public static void main(String args[]) {
    int arr[] = {1, 5, 8, 9};
    Node head = convert(arr);
    boolean found = SearchKey(head);
    printList(head);
    System.out.println("Search result: " + found);
    System.out.println("Original list: ");
    printList(head);
    head = Reomvehead(head);
    System.out.println("Remove head of the linklist: ");
    printList(head);
    head = convert(arr);
    head = Removetail(head);
    System.out.println("Remove tail of the linklist: ");
    printList(head);
    head = convert(arr);
    int removedValue = removek(head, 4);
    if (removedValue != 0) {
        System.out.println("Removek element of the linklist: " + removedValue);
    } else {
        printList(head);
    }
    System.out.println("Length of the list: " + lengthall(head));
    head = convert(arr);
    head = InsertNode(head, 100);
    System.out.println("Insert new node: ");
    printList(head);
    head = Inserttail(head, 100);
    System.out.println("Inserttail new node: ");
    printList(head);
    head = InserkPostion(head, 45,7);
    System.out.println("Insertk postion new node: ");
    printList(head);
}
}