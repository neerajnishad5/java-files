public class CylinderConstructor {

    public static class Cylinder {
        private double radius;
        private double height;

        public double getRadius() {
            return radius;
        }

        public void setRadius(double r) {
            if (r >= 0)
                radius = r;
            else
                r = 0;
        }

        public double getHeight() {
            return height;

        }

        public void setHeight(double h) {
            if (h >= 0)
                height = h;
            else
                height = 0;
        }

        public void setDimensions(int r, int h) {
            radius = r;
            height = h;
        }

        public Cylinder() {
            radius = 1;
            height = 1;
        }

        public Cylinder(double r, double h) {
            setHeight(h);
            setRadius(r);
        }

        public Cylinder(double r) {
            setRadius(r);
            height = 1;
        }

        public double vol() {
            return Math.PI * getHeight() * getRadius() * getRadius();
        }
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        System.out.print("Volume: " + c.vol());

    }
}
