package Stacks;

public class StackArrays {
    int [] arr;
    int topOfStack;

    public StackArrays(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }
    //Check if it is empty

    public boolean isEmpty(){
        if (topOfStack == -1){
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    //check if stack is Full
    public boolean isFull(){
        if (topOfStack == arr.length -1){
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    //implement a push method
    public void push(int value){
        if (isFull()){
            System.out.println("the stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    //implement pop method
    public int pop(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        topOfStack --;
        System.out.println("The value of "+arr[topOfStack + 1]+" was removed from the top");
        return arr[topOfStack +1];
    }
    //implement peek
    public int peek(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("The value of "+arr[topOfStack]+" is at the top of the stack");
        return arr[topOfStack];
    }
    //implement delete a stack
    public void clear(){
        this.topOfStack = -1;
    }
    // use the stack datastructure to check whether a word is a palindrome or not eg racecar  == racecar
    //Implement a stack datastructure using LinkedList instead of Arrays
    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.peek();
        stackArrays.push(2);
        stackArrays.push(3);
        stackArrays.pop();
        stackArrays.peek();
        stackArrays.isEmpty();
        stackArrays.isFull();
        stackArrays.clear();
        stackArrays.isEmpty();
    }
}
