public class Polymorphism {

    static boolean validate(String s) {

        return s.matches("[a-zA-Z\\s]*");

    }

    static boolean validate(int s) {
        if (s > 3 && s < 15)
            return true;
        else
            return false;

    }

    static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

    static float area(float r) {

        return (float) Math.PI * r * r;
    }

    static float area(float l, float b) {

        return (float) l * b;
    }

    static float area(float l, float b, float h) {

        return (float) 0.5 * (l + b) * h;
    }

    static float max(byte x, byte y) {
        return x > y ? x : y;
    }

    static int reverse(int a) {
        int rev = 0;
        while (a != 0) {

            rev = rev * 10 + a % 10;
            a = a / 10;

        }
        return rev;

    }

    static int[] reverse(int a[]) {

        int b[] = new int[a.length];

        for (int i = a.length - 1, j = 0; i >= 0; j++, i--) {
            b[j] = a[i];

        }
        return b;

    }

    public static void main(String[] args) {

        float l = 5, b = 10, h = 20;
        float r = 7;
        int a = 8765;
        // System.out.println(max(a, b));
        int A[] = { 4, 5, 6, 7, 8, 9 };

        System.out.println("Area of circle: " + area(r));
        System.out.println("Area of rect : " + area(l, b));
        System.out.println("Area of trap : " + area(l, b, h));

        System.out.println("Reverse: " + reverse(a));

        int B[] = reverse(A);

        for (int x : B)
            System.out.print(x + " ");
        System.out.println();
        System.out.println(validate("\nBhonda P"));
        System.out.println(validate(5));

    }
}
