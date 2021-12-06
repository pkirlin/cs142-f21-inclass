package lab12;

// Linked lists are formed by sequences of nodes, that are "linked"
// together by references.  Each node in the list "points to" references
// the following node.

public class NodeDemo {
    public static void main(String[] args) {
        demo1();
        //demo2();
    }

    public static void demo1() {
        // Make some nodes.
        Node node1 = new Node();
        node1.data = 10;
        node1.next = null;
        // Draw node1 in box A.

        Node node2 = new Node();
        node2.data = 20;
        node2.next = null;
        node1.next = node2;
        // Draw node1 and node2 in box B.

        Node node3 = new Node();
        node3.data = 30;
        node3.next = null;
        node2.next = node3;
        // Draw nodes 1, 2, and 3 in box C.

        // Write a line of code to print the 10, using just node1:

        // Write a line of code to print the 20, using just node2:

        // Write a line of code to print the 20, using just node1:

        // Write a line of code to print the 30, using just node2:

        // Write a line of code to print the 30, using just node1:

    }

    public static void demo2() {
        Node head;
        Node newNode;

        head = new Node();
        head.data = 4;
        head.next = null;
        // Draw the head node in box D.

        newNode = new Node();
        newNode.data = 3;
        newNode.next = head;
        head = newNode;
        // Draw all nodes created so far in box E.

        newNode = new Node();
        newNode.data = 2;
        newNode.next = head;
        head = newNode;
        // Draw all nodes created so far in box F.

        newNode = new Node();
        newNode.data = 1;
        newNode.next = head;
        head = newNode;
        // Draw all nodes created so far in box G.

        Node curr = head;
        int i = 0;
        while (curr != null) {
            i++;
            curr = curr.next;
        }
        // What is the section of code above doing?

    }

}
