import java.util.Scanner;

public class CheckGmailAddressOrNot {

    public static void main(String[] args) {

        System.out.println("Enter email address to check if valid: ");
        Scanner s = new Scanner(System.in);

        String email = s.nextLine();

        if (email.matches("[.a-z0-9A-Z@]+gmail.com") == true) {
            System.out.println("Enter mail address belongs to gmail.");
        } else
            System.out.println("Enter mail address doesn't belong to gmail.");

       
    }
}
