public class ThrowVsThrows {

    public static int area(int a, int b) throws Exception {
        if (a < 0 || b < 0)
            throw new Exception();

        return a * b;
    }

    public static void meth2() {
        try {
            System.out.println("Area is: " + area(99, 10));
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public static void meth1() {
        meth2();
    }

    public static void main(String[] args) {

        meth1();

    }
}