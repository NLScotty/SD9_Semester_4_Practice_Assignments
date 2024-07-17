
public class TaskList {
    // A nested class for the node. Each node contains a task and the next node.
    static class Node{
        Task task;
        Node next;

        Node(Task task){
            this.task = task;
            next = null;
        }
    }
    // The attributes for our TaskList: the head node and size
    Node head;
    int size;

    // Some constructors for different inputs
    public TaskList(){
        this.head = null;
        this.size = 0;
    }
    public TaskList(Task task){
        this.head = new Node(task);
        this.size = 1;
    }

    // Insert Task Functions
    public void insertTask(Task task){
        if(this.head == null){
            this.head = new Node(task);
            this.size++;
            return;
        }
        Node currentNode = this.head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(task);
        this.size++;
    }
    public void insertTask(int location, Task task){
        if(location == 0){
            Node newNode = new Node(task);
            newNode.next = this.head;
            this.head = newNode;
            size++;
        }else if(location == this.size){
            this.insertTask(task);
        }else if(location > size){
            throw new IndexOutOfBoundsException();
        }else {
            int currlocation = 0;
            Node currentNode = this.head;
            while (currlocation < location){
                currentNode = currentNode.next;
                currlocation++;
            }
            Node newNode = new Node(task);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            size++;
        }
    }

    // Get Task
    public Task getTask(int location){
        if(location >= size){
            throw new IndexOutOfBoundsException();
        }else {
            int currlocation = 0;
            Node currentNode = this.head;
            while (currlocation < location){
                currentNode = currentNode.next;
                currlocation++;
            }
            return currentNode.task;
        }
    }

    // Mark a Task as complete
    public void completeTask(int location){
        if(location >= size){
            throw new IndexOutOfBoundsException();
        }else {
            int currlocation = 0;
            Node currentNode = this.head;
            while (currlocation < location){
                currentNode = currentNode.next;
                currlocation++;
            }
            currentNode.task.setComplete(true);
        }
    }

    // Display all Tasks
    public void displayTasks(){
        if(size == 0){
            System.out.println("There are no tasks to display");
        }else{
            Node currentNode = head;
            int count = 1;
            while(currentNode != null){
                System.out.print(count+". "+currentNode.task.description);
                if(currentNode.task.isComplete()){
                    System.out.print(" (Completed)");
                }else{
                    System.out.print(" (Incomplete)");
                }
                System.out.println();
                currentNode = currentNode.next;
                count++;
            }
        }
    }
}
