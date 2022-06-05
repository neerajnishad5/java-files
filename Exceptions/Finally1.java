
import java.io.*;
import java.util.*;

class Demo {

    static FileInputStream fi;

    static void divide() throws Exception {

        fi = new FileInputStream("/my.txt");

        Scanner s = new Scanner(fi);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.println(a / b);

    }

}

public class Finally1 {

    // TRY WITH RESOURCES
    public static void main(String[] args) throws Exception {

        

    }
}