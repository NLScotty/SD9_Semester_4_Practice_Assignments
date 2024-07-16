package Stacks;

import java.util.LinkedList;

public class StackLinkedList {
    LinkedList list = new LinkedList<>();
    
    // we'll use the default constructor

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(Object o){
        list.addFirst(o);
    }

    public Object pop(){
        return list.removeFirst();
    }

    public Object peek(){
        return list.getFirst();
    }

    public void clear(){
        list.clear();
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        stack.clear();
        System.out.println(stack.isEmpty());
    }
}
