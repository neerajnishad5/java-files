import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int day = s.nextInt();
        switch (day) {
            default:
                System.out.println("sun");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("WEeb");
                break;
            case 4:
                System.out.println("Thru");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;

        }
    }

}