import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) throws Exception {
        
        FileWriter fw = new FileWriter("E:/Test.txt");

        String s = new String("lorem ipsum falana dhimkanae");

        byte[] b = s.getBytes();

        for (byte x : b) {
            fw.write((char) x);
        }


        // fw.write(s);

        fw.close();

    }
}
