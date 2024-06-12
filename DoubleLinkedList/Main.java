package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertDLL(1, 0);
        doublyLinkedList.insertDLL(2, 1);
        doublyLinkedList.insertDLL(3, 2);

        doublyLinkedList.traverseDLL();
        doublyLinkedList.reverseTraverseDLL();
        doublyLinkedList.search(2);
        doublyLinkedList.search(4);
        doublyLinkedList.delete(1);
        doublyLinkedList.traverseDLL();
        doublyLinkedList.clear();
        doublyLinkedList.traverseDLL();
    }
}
