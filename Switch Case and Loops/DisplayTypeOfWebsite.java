
import java.util.*;

public class DisplayTypeOfWebsite {
    public static void main(String[] args) {

        System.out.println("Enter the website: ");

        Scanner s = new Scanner(System.in);

        String type = s.nextLine();
        type = type.substring(type.lastIndexOf(".") + 1);

        switch (type) {

            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organization");
                break;
            case "in":
                System.out.println("India");
                break;
            case "net":
                System.out.println("Network");
                break;
            case "gov":
                System.out.println("Government");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}
