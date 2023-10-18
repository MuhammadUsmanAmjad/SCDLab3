import java.util.Scanner;

abstract class Shape {
    double length;

    abstract void calculateArea();

    abstract void calculatePerimeter();

    abstract void displayInformation();
}

class Rectangle extends Shape {
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        System.out.println("Area of Rectangle: " + length * breadth);
    }

    void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle: " + 2 * (length + breadth));
    }

    void displayInformation() {
        System.out.println("Length of Rectangle: " + length);
        System.out.println("Breadth of Rectangle: " + breadth);
    }
}

class Circle extends Shape {
    private static final double PI = 3.14;

    Circle(double length) {
        this.length = length;
    }

    public void calculateArea() {
        System.out.println("Area of Circle: " + PI * length * length);

    }

    public void calculatePerimeter() {
        System.out.println("Perimeter of Circle: " + 2 * PI * length);
    }

    public void displayInformation() {
        System.out.println("Radius of Circle: " + length);
    }

}

public class lab3q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter Breadth of Rectangle: ");
        double breadth = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.displayInformation();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println("Enter Radius of Circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        circle.displayInformation();
        circle.calculateArea();
        circle.calculatePerimeter();
        sc.close();
    }
}