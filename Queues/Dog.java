package Queues;

public class Dog {
    String name;
    String breed;
    int place;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
        this.place = 0;
    }

    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getPlace() {
        return place;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setPlace(int place) {
        this.place = place;
    }
    @Override
    public String toString() {
        return "Dog [name = '"+name+"', breed = '"+breed+", place = "+place+"']";
    }
}
