import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        System.out.println("Enter the constants of quadratic eqn of form ax^2 + bx +c = 0: ");
        Scanner s = new Scanner(System.in);

        int a, b, c;

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        float r1 = (float) (((-b) + Math.sqrt(b * b - 4 * a * c)) / 2f);
        float r2 = (float) (((-b) - Math.sqrt(b * b - 4 * a * c)) / 2f);

        System.out.println("Roots of the eqn are: " + r1 + " " + r2);

    }

}
