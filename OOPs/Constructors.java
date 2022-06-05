
public class Constructors {

    public static class Rectangle {

        private int length;
        private int breadth;

        public Rectangle() {
            length = 1;
            breadth = 1;
        }

        public Rectangle(int l, int b) {
            setLen(l);
            setBre(b);
            
        }

        void setLen(int l) {
            if (l > -1)
                length = l;
            else
                length = 0;
        }

        int getLen() {
            return length;
        }

        void setBre(int b) {
            if (b > -1)
                breadth = b;
            else
                breadth = 0;
        }

        int getBre() {
            return breadth;
        }

        public int area() {
            return getLen() * getBre();
        }

        public int perimeter() {
            return (2 * (getBre() + getLen()));
        }

    }

    public static void main(String args[]) {

        Rectangle r = new Rectangle(-5, 5);
        System.out.println("Area: " + r.area());

    }
}
