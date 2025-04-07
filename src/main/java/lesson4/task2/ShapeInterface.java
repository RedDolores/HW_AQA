package lesson4.task2;

public interface ShapeInterface {
    default double getPerimeter() {
        return 0;
    }

    double getArea();

}
