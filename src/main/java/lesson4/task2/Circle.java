package lesson4.task2;

public class Circle extends Shape {
    private final double PI = 3.14;
    private double r;

    public Circle(double r, String color, String borderColor) {
        this.r = r;
        this.color = color;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * r;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(r, 2);
    }

    public void printAllInfo() {
        System.out.println("Circle{" + "perimeter = " + getPerimeter() +
                ", area = " + getArea() +
                ", color = " + color +
                ", borderColor = " + borderColor +
                '}');
    }
}
