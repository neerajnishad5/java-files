import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class usingFileSeqclass {
    public static void main(String[] args) throws Exception {

        FileInputStream fis1 = new FileInputStream("E:/s1.txt");
        FileInputStream fis2 = new FileInputStream("E:/s2.txt");
        FileOutputStream fos = new FileOutputStream("E:/d.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int x = 9;

        while ((x = fis1.read()) != -1) {
            fos.write(x);
        }


        fis1.close();
        fis2.close();
        fos.close();
        sis.close();

    }
}
