package lesson4.task2;

public class Triangle extends Shape {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c, String color, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;

    }

    @Override
    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    public void printAllInfo() {
        System.out.println("Triangle{" + "perimeter = " + getPerimeter() +
                ", area = " + getArea() +
                ", color = " + color +
                ", borderColor = " + borderColor +
                '}');
    }
}
