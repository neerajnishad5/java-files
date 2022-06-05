import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayInputDemo {
    public static void main(String[] args) throws Exception {

        byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        // METHOD2: READING BYTE ARRAY WITH LOOP
        // int x;
        // while ((x = bis.read()) != -1) {
        // System.out.print((char) x);
        // }
        // bis.close();

        // METHOD 1 :READING BYTE ARRAY AT ONE GO
        String s = new String(bis.readAllBytes());
        System.out.println(s);

        System.out.println(bis.markSupported());

        bis.close();

    }
}