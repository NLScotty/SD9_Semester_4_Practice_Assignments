public class User {
    //Attributes
    String name;
    TaskList list;

    //Constructor
    public User(String name){
        this.name = name;
        list = new TaskList();
    }

    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public TaskList getList() {
        return list;
    }
    public void setList(TaskList list) {
        this.list = list;
    }

    //Task manipulation functions
    public void addTask(Task task){
        list.insertTask(task);
    }
    public void setTaskAsComplete(int location){
        try {
            list.completeTask(location);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void displayTasks(){
        System.out.println("======= "+name+"'s Tasks =======");
        list.displayTasks();
    }
}
