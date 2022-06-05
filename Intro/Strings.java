import java.lang.*;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // int a = 10;
        // //float b = 8.654f;
        // String str = "Java\n";

        // System.out.printf("%-10s", str);
        
        // DECLN 1
        char[] c = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
        // DECLN 2
        byte[] b = { 65, 66, 67, 68, 69, 70 };
        String str3 = new String(b);

        // DECLN 3
        String str1 = "Java is an OOP language.";

        // DECLN 4
        String str2 = new String("Java program using new keyword in heap");

        System.out.println(c);
        System.out.println(str1);
        System.out.println(str3);
        System.out.println(str2);

        String str4 = "Program";
        String str5 = "Program";

        System.out.println(str4 == str5);

        String str6 = new String(c, 2, 6);
        System.out.println(str6);

        String str7 = "Java";
        System.out.println(str7.toLowerCase());

        String str8 = "Abdul";

        String str9 = str8.toUpperCase();

        System.out.println(str8 == str9);

        String str10 = "    Coronavirus    ";

        str10 = str10.trim(); // trims blankspaces out of string.

        System.out.println(str10);

        String s11 = str10.substring(3); // prints substring from index 3

        System.out.println(s11);

        s11 = str10.substring(3, 8); // prints substring from index 3 to 8

        System.out.println(s11);

        String s12 = "Learning";

        s12 = s12.replace('n', 'A'); // replaces char n with A. Method format : string replace(char old, char new)
        System.out.println(s12);

        String s13 = "Programming";

        boolean cccc = s13.startsWith("Pro"); // method startsWith checks if the string starts with a particular String,
                                              // Pro in our case

        System.out.println(cccc);

        String s14 = "www.abcd.org";
        char c0 = s14.charAt(7);
        int i1 = s14.indexOf("."); // method indexOf takes string as input and returns the index value of that
                                   // string in our string. When string not present it returns -1.
        System.out.println(i1);

        int i2 = s14.lastIndexOf(".");

        System.out.println(i2);
        System.out.println(c0);

    }
}
