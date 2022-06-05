import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.swing.text.StyledEditorKit.ForegroundAction;


public class ByteArrayOUtputDemo {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        
        bos.write('b');
        bos.write('j');
        bos.write('c');
        bos.write('d');
        bos.write('e');

        byte b[] = bos.toByteArray(); // storing the written bytes in byte array

        // for (byte c : b) {
        //     System.out.print((char) c);
        // }

        bos.writeTo(new FileOutputStream("E:/Test.txt"));


        bos.close();



    }
}
