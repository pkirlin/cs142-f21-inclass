package bigoh;

// Linked lists are formed by sequences of nodes, that are "linked"
// together by references.  Each node in the list "points to" references
// the following node.
class Node {
    public int data;
    public Node next;
}

public class LinkedListPlayground {
    public static void main(String[] args) {
        // Make some nodes.
        Node node1 = new Node();
        node1.data = 10;

        Node node2 = new Node();
        node2.data = 20;

        Node node3 = new Node();
        node3.data = 30;

        // Link them together.
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

    }

}

