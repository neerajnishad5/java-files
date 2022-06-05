public class OOPs {
    public static class Rectangle {
        public double breadth;
        public double length;

        public double area() {
            return length * breadth;
        }

        public double perimeter() {
            return 2 * (length + breadth);
        }

        public boolean isSquare() {
            if (length == breadth)
                return true;

            return false;

        }
    }

    public static void main(String[] args) {

        Rectangle a = new Rectangle();
        a.length = 100;
        a.breadth = 100;
        System.out.println("Area : " + a.area());
        System.out.println("Perimeter : " + a.perimeter());
        if (a.isSquare() == true)
            System.out.println("It's a Square");
        else
            System.out.println("Not a Square");
    }
}
