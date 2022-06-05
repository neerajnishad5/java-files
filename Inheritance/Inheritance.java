public class Inheritance {
    public static class Circle {
        public double radius;

        public double area() {
            return Math.PI * radius * radius;
        }

        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        public double circumference() {
            return perimeter();
        }
    }

    public static class Cylinder extends Circle {
        public double height;

        public double volume() {
            return area() * height;
        }
    }

    public static void main(String[] args) {

       
        Cylinder c2 = new Cylinder();
        c2.radius = 7;
        c2.height = 7;
        System.out.println(c2.volume());
        System.out.println(c2.area());

    }
}
