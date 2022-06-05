import java.io.CharArrayWriter;
import java.io.FileOutputStream;
public class CharArrayWriterDemo {


    // NOT WORKING
    public static void main(String[] args) {
        CharArrayWriter caw = new CharArrayWriter();

        caw.write('h');
        caw.write("string");

        char c[] = caw.toCharArray();

        caw.writeTo(new FileOutputStream("E:/Test.txt"));

        caw.close();
    }
}
