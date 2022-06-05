public class NestedCatch {
    public static void main(String[] args) {

        {
            int A[] = { 10, 20,0, 4, 5, 2 };

            try {
                int x = A[0] / A[1];

                System.out.println("Ans is: " + x);

                try {
                    System.out.println(A[4]);
                } catch (ArrayIndexOutOfBoundsException c) {
                    System.out.println(c);
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
    }
}
