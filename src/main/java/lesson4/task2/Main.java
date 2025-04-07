package lesson4.task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,2, "red", "blue");
        Triangle triangle = new Triangle(5,5,4,"green","yellow");
        Circle circle = new Circle(3, "white", "black");

        rectangle.printAllInfo();
        triangle.printAllInfo();
        circle.printAllInfo();

    }
}
