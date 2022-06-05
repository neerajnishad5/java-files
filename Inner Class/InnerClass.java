class Outer {
    int x = 10;
    Inner i = new Inner();

    class Inner {
        int y = 20;

        void innerDisp() {
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }

    }

    void outerDisp() {

        i.innerDisp();
        System.out.println("y: " + i.y);
    }

}

public class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisp();
        Outer.Inner i = new Outer().new Inner(); // Accessing method of Inner class directly in main method.
        i.innerDisp();

    }

}
