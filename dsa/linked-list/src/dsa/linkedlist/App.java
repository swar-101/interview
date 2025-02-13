package dsa.linkedlist;

import dsa.linkedlist.implementation.SinglyLinkedList;

public class App {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insert(10);
        singlyLinkedList.insert(20);
        singlyLinkedList.insert(30);
        singlyLinkedList.insert(100);
        singlyLinkedList.insert(40);
        singlyLinkedList.insert(50);
        singlyLinkedList.insert(60);
        singlyLinkedList.insert(100);

        singlyLinkedList.print();

        System.out.println(singlyLinkedList.isDataPresent(70));
        System.out.println(singlyLinkedList.isDataPresent(40));

        singlyLinkedList.delete(40);
        singlyLinkedList.isDataPresent(40);

        singlyLinkedList.print();

        singlyLinkedList.purge(100);
        System.out.println(singlyLinkedList.isDataPresent(100));
        singlyLinkedList.print();

        /* After running this code, you'll notice that delete() only removes the first instance of `100` only. */
    }
}