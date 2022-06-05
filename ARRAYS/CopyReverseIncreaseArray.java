public class CopyReverseIncreaseArray {
    public static void main(String[] args) {

        // COPYING AN ARRAY

        // int a[] = { 8, 6, 10, 9, 2, 15, 7, 13, 14, 11 };
        // int n = a.length;
        // System.out.print("Array A: ");

        // for (int x : a)
        // System.out.print(x + " ");
        // int b[] = new int[n];
        // System.out.println();
        // for (int i = 0; i < n; i++)
        // b[i] = a[i];

        // System.out.print("Array B: ");
        // for (int x : b)
        // System.out.print(x + " ");

        // REVERSE COPYING AN ARRAY

        // int a[] = { 8, 6, 10, 9, 2, 15, 7, 13, 14, 11 };
        // for (int x : a)
        // System.out.print(x + " ");
        // int b[] = new int[10];

        // for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
        // b[j] = a[i];
        // }
        // System.out.println();
        // for (int x : b)
        // System.out.print(x + " ");

        // INCREASE SIZE OF ARRAY

        int a[] = { 8, 6, 10, 9, 2 };

        int b[] = new int[2 * a.length];

        for (int i = 0, j = 0; i < a.length; i++, j++) {
            b[j] = a[i];
        }
        a = b;
        b = null;

        System.out.print("Array a: ");
        for (int x : a)
            System.out.print(x + " ");

    }
}
