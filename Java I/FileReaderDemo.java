import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("E:/Test.txt");

        int x = 0;

        do {

            x = fr.read();
            if (x != -1)
                System.out.print((char) x);
        } while (x != -1);

        // int y=0;
        // while ((y = fr.read()) != -1) {
        //     System.out.print((char) y);
        // }
    }
}
