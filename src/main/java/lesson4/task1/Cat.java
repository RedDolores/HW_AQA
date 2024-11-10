package lesson4.task1;

public class Cat extends Animal {
    private final int RUN_DISTANCE = 200;
    private final int SWIM_DISTANCE = 0;

    protected static int count;
    private boolean satiety;

    {
        count++;
    }

    public Cat(String name) {
        super(name);
        this.satiety = false;
    }

    private int getCountCat() {
        return count;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void printCountCat() {
        System.out.println("Count of Cats is " + getCountCat());
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", satiety = " + satiety;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_DISTANCE && distance > 0) {
            System.out.println("Cat " + name + " runs " + distance + " meters");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat " + name + " can't swim");
    }

    public void eat(Bowl bowl) {
        if(bowl.getVolume() >= 10) {
            bowl.setVolume(bowl.getVolume() - 10);
            this.satiety = true;
        }
    }
}
