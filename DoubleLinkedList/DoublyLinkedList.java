package DoubleLinkedList;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    //Create a DLL
    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }


    //insert into a DLL
    //0. If link list doesn't
    //1. inserting at the begining
    //2. Inserting at the ending
    //3. Insert anywhere

    public void  insertDLL (int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if(head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = tail;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    //Traverse a Linked List
    public void traverseDLL(){
        if (head == null) {
            System.out.println("DLL does not exist");
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1) {
                    System.out.print(" <-> ");

                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    // Reverse Traverse
    public void reverseTraverseDLL(){
        if (tail == null) {
            System.out.println("DLL does not exist");
        } else {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1) {
                    System.out.print(" <-> ");

                }
                tempNode = tempNode.prev;
            }
        }
        System.out.print("\n");
    }
    // Search Node
    public int search(int element) {
        if (head == null) {
            System.out.println("DLL does not exist");
            return -1;
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if(tempNode.value == element){
                    System.out.println("Element found at index "+i);
                    return i;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Element not found");
        return -1;
    }

    // Deletion Method
    public void delete(int location){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }else if(location >= this.size || location < 0){
            System.out.println("Index is out of bound");
        } else if(location == 0){
            this.head = this.head.next;
            size --;
            return;
        } else if(location == this.size -1){
            this.tail = this.tail.prev;
            size --;
            return;
        } else {
            DoublyNode currentNode = this.head;
            for(int i = 0; i < location; i++){
                currentNode = currentNode.next;
            }
            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;
            size --;
            return;
        }
    }


    // Delete entire DLL
    public void clear(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

}
