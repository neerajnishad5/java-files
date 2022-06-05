import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double area, a, ss, b, c;
        

        System.out.println("Enter three sides of triangle: ");
        Scanner s = new Scanner(System.in);

        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();

        ss = (a + b + c) / 2f;
        area = Math.sqrt(ss * (ss - a) * (ss - b) * (ss - c));

        System.out.println("Area of triangle is: " + area);

    }
}
