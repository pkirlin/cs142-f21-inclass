package lab12;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;  // always points to the first element.
    }

    /** Add a new element to the front of the list. */
    public void addToFront(int num) {
        Node newNode = new Node();
        newNode.data = num;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    /** Add a new element to the back of the list. */
    public void addToBack(int num) {
        Node newNode = new Node();
        newNode.data = num;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        }
        else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    /** Retrieve a specific element in the list, using array-style indexing. */
    public int get(int index)
    {
        int count = 0;
        Node curr = head;
        while (count < index) {
            count++;
            curr = curr.next;
        }
        return curr.data;
    }

    /** Get the size of the list. */
    public int size() {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    /** Determine if this list contains a specific element or not. */
    public boolean contains(int key) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            if (curr.data == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public String toString() {
        String answer = "[";

        // Iterate over list, adding elements to the string.
        Node curr = head;
        while (curr != null) {
            answer += curr.data;
            // If there's a next element, add a comma.
            if (curr.next != null) {
                answer += ", ";
            }
            // Advance to next element.
            curr = curr.next;
        }

        answer += "]";
        return answer;
    }
}
