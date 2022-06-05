import java.util.Scanner;

public class FindingRadixOfANumberInString {
    public static void main(String[] args) {

        System.out.println("Enter the string: ");
        Scanner s = new Scanner(System.in);

        String s0 = new String(s.nextLine());

        if (s0.matches("[0-1]+")) {
            System.out.println("Base-2 Radix");
        } else if (s0.matches("[0-7]+")) {
            System.out.println("Base-8 Radix");
        } else if (s0.matches("[0-9]+")) {
            System.out.println("Base-10 Radix");
        } else if (s0.matches("[0-9A-Ba-b]+")) {
            System.out.println("Base-16 Radix");
        } else
            System.out.println("None");
    }
}
