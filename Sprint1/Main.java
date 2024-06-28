import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        User user1 = new User("Scott");
        User user2 = new User("Kayne");
        User user3 = new User("Colten");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        users.get(0).addTask(new Task("The first task"));
        users.get(0).addTask(new Task("The second task"));
        users.get(0).addTask(new Task("The final task"));
        users.get(1).addTask(new Task("The first task"));
        users.get(1).addTask(new Task("The final task"));
        users.get(2).addTask(new Task("The first task"));
        users.get(2).addTask(new Task("The second task"));
        users.get(2).addTask(new Task("The third task"));
        users.get(2).addTask(new Task("The final task"));

        users.get(0).setTaskAsComplete(0);
        users.get(1).setTaskAsComplete(0);
        users.get(1).setTaskAsComplete(1);
        users.get(2).setTaskAsComplete(0);
        users.get(2).setTaskAsComplete(1);
        users.get(2).setTaskAsComplete(2);

        for(User user : users){
            user.displayTasks();
        }
    }
}
