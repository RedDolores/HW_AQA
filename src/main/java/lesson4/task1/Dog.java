package lesson4.task1;

public class Dog extends Animal {

    private final int RUN_DISTANCE = 500;
    private final int SWIM_DISTANCE = 10;

    protected static int count;

    private boolean satiety;

    {
        count++;
    }

    public Dog(String name) {
        super(name);
    }

    private int getCountDog() {
        return count;
    }

    public void printCountCat() {
        System.out.println("Count of Dogs is " + getCountDog());
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_DISTANCE && distance > 0) {
            System.out.println("Dog " + name + " runs " + distance + " meters");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= SWIM_DISTANCE && distance > 0) {
            System.out.println("Dog " + name + " swims " + distance + " meters");
        }
    }

    public void eat(Bowl bowl) {
        if(bowl.getVolume() >= 20) {
            bowl.setVolume(bowl.getVolume() - 20);
            this.satiety = true;
        }
    }
}
