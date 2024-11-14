package lesson4.task1;

public class Main {
    public static void main(String[] args) {

        Bowl bowl = new Bowl();
        bowl.setVolume(49);

        Animal animal1 = new Animal("Animal1");
        Animal animal2 = new Animal("Animal2");
        animal1.printCountAnimal();

        Dog dog1 = new Dog("Dog1");

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Cat1");
        cats[1] = new Cat("Cat2");
        cats[2] = new Cat("Cat3");
        cats[3] = new Cat("Cat4");
        cats[4] = new Cat("Cat5");
        for(Cat cat:cats){
            cat.eat(bowl);
            System.out.println(cat);
        }

        dog1.run(100);
        cats[1].run(500);
        cats[1].printCountCat();
        animal1.printCountAnimal();
        System.out.println(bowl.getVolume());
    }
}
