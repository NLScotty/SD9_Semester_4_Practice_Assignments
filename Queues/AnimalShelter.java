package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    Queue<Cat> catQueue = new LinkedList<Cat>();
    Queue<Dog> dogQueue = new LinkedList<Dog>();
    int place = 1; //used for keeping track latest between both queues.

    // We'll use the default constructor

    //enqueue
    public void enqueue(Dog dog){
        dog.setPlace(place);
        dogQueue.add(dog);
        place++;
    }
    public void enqueue(Cat cat){
        cat.setPlace(place);
        catQueue.add(cat);
        place++;
    }

    //dequeue
    public Dog dequeueDog(){
        return dogQueue.remove();
    }
    public Cat dequeueCat(){
        return catQueue.remove();
    }
    //to do
    public Object dequeueAny(){
        if(catQueue.peek() == null && dogQueue.peek() == null){
            return null;
        }
        else if(catQueue.peek()!=null && dogQueue.peek() == null){
            return dequeueCat();
        }
        else if(dogQueue.peek()!=null && catQueue.peek() == null){
            return dogQueue;
        }
        else if(dogQueue.peek().place < catQueue.peek().place){
            return dequeueDog();
        }else{
            return dequeueCat();
        }
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("Charlie", "Unknown");
        Cat c2 = new Cat("Bob", "Tabby");
        Cat c3 = new Cat("Socks", "Unkown");

        Dog d1 = new Dog("Buddy", "Collie");
        Dog d2 = new Dog("Chomper", "Pit Bull");

        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(c1);
        shelter.enqueue(d1);
        shelter.enqueue(d2);
        shelter.enqueue(c2);
        shelter.enqueue(c3);

        System.out.println(shelter.dequeueAny());
        System.out.println(shelter.dequeueCat());
        System.out.println(shelter.dequeueAny());
        System.out.println(shelter.dequeueDog());
        System.out.println(shelter.dequeueAny());

    }
}
