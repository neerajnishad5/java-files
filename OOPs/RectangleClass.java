public class RectangleClass {
    public static class Rectangle {
        private int len; // setting data variables PRIVATE
        private int bre;

        public void setLen(int l) {
            if (l > 0)
                len = l;
            else
                len = 0;
        }

        public int getLen() {
            return len;
        }

        public void setBre(int b) {
            if (b > 0)
                bre = b;
            else
                bre = 0;
        }

        public int getBre() {
            return bre;
        }

        public int area() {
            return getLen() * getBre();
        }

        public int perimeter() {
            return 2 * (getLen() + getBre());
        }

        public boolean isSquare() {
            if (getLen() == getBre())
                return true;
            else
                return false;

        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLen(70);
        r.setBre(7);
        System.out.println("Length: " + r.getLen());
        System.out.println("Length: " + r.getBre());
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println("It's a square: " + r.isSquare());

    }
}
