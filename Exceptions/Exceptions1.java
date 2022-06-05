import java.util.Scanner;

public class Exceptions1 {

    public static void main(String[] args) {
        int x = 10, y = 5, z;
        int a, b, c;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        a = s.nextInt();
        b = s.nextInt();

        try {

            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {

            System.out.println(e);
        }

        System.out.println("This program ends here");
        System.out.println("Bye");

    }

}
