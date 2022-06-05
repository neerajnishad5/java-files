abstract class Shape {

    Shape() {
    }

    abstract double perimeter();

    abstract double area();
}

class Circle extends Shape {

    int r;

    double area() {

        return Math.PI * r * r;
    }

    double perimeter() {
        return 2 * Math.PI * r;
    }
}

class Rectangle extends Shape {
    int l, b;

    double area() {
        return l * b;
    }

    double perimeter() {
        return 2 * (l + b);
    }
}

public class ShapeAbstractClass {
    public static void main(String[] args) {

        Rectangle rr = new Rectangle();
        rr.l = 9;
        rr.b = 9;
        Shape s = rr;
        System.out.println("Area of rectangle: " + s.area());

        Circle c = new Circle();
        c.r = 7;
        Shape ss = c;
        System.out.println("Perimeter of Circle: " + ss.area());

    }

}