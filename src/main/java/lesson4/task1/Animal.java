package lesson4.task1;

public class Animal {
    protected static int count;

    protected String name;

    {
        count++;
    }

    public Animal(String name) {
        this.name = name;

    }

    private int getCountAnimal() {
        return count;
    }

    public void printCountAnimal() {
        System.out.println("Count of Animals is " + getCountAnimal());
    }

    public void run(int distance) {

    }

    public void swim(int distance) {

    }
}
