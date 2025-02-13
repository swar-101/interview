package dsa.linkedlist.implementation;

public class SinglyLinkedList {

    /* The first node of the Linked List initialized to null */
    private Node head = null;

    /* Node is the inner class which represents each node in a Linked List. */
    private static class Node {
        int data;
        Node next;

        /* When we create a new Node, we assign it data and the next Node points to null, which becomes the tail
        * of the Linked list */
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /* Inserting data at the end of a Linked List */
    public void insert(int data) {
        Node newNode = new Node(data);
        /* If `head` is null, means the Linked List is null. It means, this `newNode` with `data` becomes the first
        * Node of the Linked List.
        */
        if (head == null) {
            head = newNode;
            return;
        }

        /*
        1. If head is not null, we go ahead, we don't know how many elements are there in our linked list.
           Therefore, we start from the head node and traverse until the last node

        2. We know that for the last node, `thatNode.next` is always null that's exactly when we stop.

        3. We know that `current` is now the last node as the condition in the while loop becomes false.
            Therefore, we assign `current.next` point to our new Node.
         */
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    /* If head is null, it skips the while loop and returns false.
    * If not, similar to insert(), we traverse the Linked List until we find `data` we're looking for.
    * When we find it, we return true. */
    public boolean isDataPresent(int queryData) {
        Node current = head;
        while (current.next != null) {
            if (queryData == current.data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }
        /* If `data` is present at the `head` node, we move the head to the next node i.e. head.next */
        if (head.data == data) {
            head = head.next;
        }

        /* If `data` present at a node other than `head` this means we need to start traversing the Linked List */
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        /* Once the loop ends, we know there are two possibilities, it's either that `current` is now the last node of
        the Linked List, or it's Node previous to the Node we want to delete. */

        /* We check if it's not the last Node.
        * If it's not, we know that the `current` is Node previous to the Node we want to delete.
        * We bypass the node we want to delete by assigning `current.next` to the node after the Node we want to delete.
        */
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    /* We traverse, and print `data` at each node seperated by a `->` which prints until `current == null`.
    * We finally, print `null` as the last node points to null in a Singly Linked List
    * */
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    /* Let's create a cool function: purge(). purge() will essentially remove all the occurrences of a particular data
    * from the Linked List.
    * This is especially useful is scenarios like: For instance, where certain events tracked using LinkedList are not
    * relevant anymore. We purge() these irrelevant data occurrence once and for all nodes!
    * Other examples,
    *   - deduplication of IDs stored as nodes of a Linked List
    *   - dynamic memory management of IoT or embedded systems where it may be important to periodically clean up
    *       certain elements to release memory.
     */
    public void purge(int data) {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current.next != null && current.data != data) {
            if (current.next.data == data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
}
