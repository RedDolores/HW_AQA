package lesson4.task2;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b, String color, String borderColor) {
        this.a = a;
        this.b = b;
        this.color = color;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    public void printAllInfo() {
        System.out.println("Rectangle{" + "perimeter = " + getPerimeter() +
                ", area = " + getArea() +
                ", color = " + color +
                ", borderColor = " + borderColor +
                '}');
    }
}
