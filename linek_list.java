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
        return "Node(data: " + data + ", next: " + next + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9};
        Node y = new Node(arr[2]);
        System.out.println(y);  // Should print the Node with data 8 and next as null
    }
}
