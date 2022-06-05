import java.util.Scanner;

public class Cubiod {

    public static void main(String[] args) {
        System.out.println("Enter the len, bre, height : ");
        int len, bre, hei;

        Scanner s = new Scanner(System.in);

        len = s.nextInt();
        bre = s.nextInt();
        hei = s.nextInt();

        float vol = len * hei * bre;
        float area = (float)2*(len*bre  + len*hei + bre*hei);
        System.out.println("Vol of cuboid is : " + vol);
        System.out.println("Total surface are of cuboid is: " + area);


    }
}