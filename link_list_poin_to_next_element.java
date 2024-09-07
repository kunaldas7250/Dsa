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
        return "Node(data: " + data + ", next: " + (next != null ? next.data : "null") + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = {1, 5, 8, 9};

        // Create nodes for each element in the array
        Node node1 = new Node(arr[0]);
        Node node2 = new Node(arr[1]);
        Node node3 = new Node(arr[2]);
        Node node4 = new Node(arr[3]);

        // Link the nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Print the nodes
        System.out.println(node1);  // Should print the Node with data 1 and next pointing to node with data 5
        System.out.println(node2);  // Should print the Node with data 5 and next pointing to node with data 8
        System.out.println(node3);  // Should print the Node with data 8 and next pointing to node with data 9
        System.out.println(node4);  // Should print the Node with data 9 and next as null
    }
}
