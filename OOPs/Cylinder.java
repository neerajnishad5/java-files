public class Cylinder {
    public static class Cylind {
        public double r;
        public double h;

        public double area() {
            return ((2 * Math.PI * r) * (r + h));
        }

        public double lidArea() {
            return Math.PI * r * r;
        }

        public double volume() {
            return lidArea() * h;
        }

        public double circumference() {
            return 2 * Math.PI * r;
        }
    }

    public static void main(String[] args) {

        Cylind c = new Cylind();
        c.r = 7;
        c.h = 10;

        System.out.println("Lid area: " + c.lidArea());
        System.out.println("Volume: " + c.volume());
        System.out.println("TSA: " + c.area());
        System.out.println("Circumference: " + c.circumference());

    }
}
