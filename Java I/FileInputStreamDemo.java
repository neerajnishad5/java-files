import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("E:/Test.txt");
        byte[] b = new byte[fis.available()];

        // fis.read(b);

        // String str = new String(b);

        // System.out.println(str);

        // PRINTING FILE CONTENTS CHAR by CHAR

        // Method1 by while loop
        int x;
        while ((x = fis.read()) != -1) {
            System.out.print((char) x);
        }

        // Method2 by do-while loop

        // do {
        //     x = fis.read();
        //     if (x != -1)
        //         System.out.print((char) x);
        // } while (x != -1);
    }
}