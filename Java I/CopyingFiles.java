import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class CopyingFiles {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("E:/s1.txt");
        FileOutputStream fos = new FileOutputStream("E:/s2.txt");

        int x = 0;

        while ((x = fis.read()) != -1) {
            if (x >= 65 && x <= 90)
                fos.write(32 + x);
            else
                fos.write(x);
        }

        fis.close();
        fos.close();

    }

}