package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertInLinkedList(1, 0);
        singleLinkedList.insertInLinkedList(2, 1);
        singleLinkedList.insertInLinkedList(3, 2);
        singleLinkedList.insertInLinkedList(4, 3);
        singleLinkedList.insertInLinkedList(5, 1);
        System.out.println("We traverse the list");
        singleLinkedList.traverseLinkedList();
        System.out.println("We search for a node with the value of 4");
        singleLinkedList.searchNode(4);
        System.out.println("We delete a node with the value of 1 (Head Node)");
        singleLinkedList.deleteNode(1);
        singleLinkedList.traverseLinkedList();
        System.out.println("Head Node: "+ singleLinkedList.head.value);
        System.out.println("We delete a node with a value of 2");
        singleLinkedList.deleteNode(2);
        singleLinkedList.traverseLinkedList();
        System.out.println("We delete a node with a value of 4 (Tail Node)");
        singleLinkedList.deleteNode(4);
        singleLinkedList.traverseLinkedList();
        System.out.println("Tail Node: "+ singleLinkedList.tail.value);
    }
}


//Assignment question number
//1. Uncomment line 10 "singleLinkedList.insertInLinkedList(5, 1)" and Investigate and fix
    // why when inserting a value at a position that is already occupied, it throws a null pointer exception.
    // Answer: Error in our insertion method