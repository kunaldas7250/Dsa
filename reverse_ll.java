public class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head) {
    if (head == null || head.next == null) {
        return head;
    }
    Node newHead = reverse(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
}

    public static Node arrayToLinkedList(int[] arr) {
        Node head = null;
        Node tail = null;
        for (int i = 0; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 10, 15, 20};
        Node head = arrayToLinkedList(arr);
        printList(head);
        head = reverse(head);
        printList(head);
    }
}