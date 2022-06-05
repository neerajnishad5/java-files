
public class Loops {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        while (n > 0) {
            sum = sum + n; // Sum of first n numbers.
            n--;
        }

        // System.out.println(sum);
        long fact = 1;
        for (int i = 0; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
