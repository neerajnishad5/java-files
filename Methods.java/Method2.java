public class Method2 {

    static int max(int A[]) {

        int max = A[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
        }
        return max;

    }

    int gcd(int m, int n) {

        while (m != n) {
            if (m > n)
                m = m - n;
            else
                n = n - m;
        }
        return n;

    }

    static boolean isPrime(int x) {

        for (int i = 2; i < (x / 2); i++) {
            if ((x % i) == 0)
                return false;

        }

        return true;
    }

    public static void main(String[] args) {
        int A[] = { 66, 77, 88, 90000, 1880, 76 };
        // System.out.println(isPrime(18));
        Method2 m = new Method2(); // creating object of class Method2 which contains gcd method.

        // System.out.println(m.gcd(56, 35));

        System.out.println(max(A));

    }
}
