

public class ArmstrongNumber {
    public static void main(String[] args) {

        int n = 212;
        int m = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;

            sum = (digit * digit * digit) + sum;

            n = n / 10;

        }

        if (sum == m)
            System.out.print("Armstrong");
        else
            System.out.println("Not armstrong");

    }
}
