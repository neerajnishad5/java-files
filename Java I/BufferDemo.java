import java.io.*;

public class BufferDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("E:/Test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        // int x = 9;

        // while((x = bis.read()) != -1){
        // System.out.print((char)x);
        // }

        System.out.println("\nFile: " + bis.markSupported());
        System.out.println("Buffer: " + bis.markSupported());

        System.out.println(((char) bis.read()));
        System.out.println(((char) bis.read()));
        System.out.println(((char) bis.read()));

        bis.mark(10); // mark will be put on next char after this eg. here 'r' has mark

        System.out.println(((char) bis.read()));
        System.out.println(((char) bis.read()));

        bis.reset();

        System.out.println(((char) bis.read()));
        System.out.println(((char) bis.read()));

        System.out.println(bis.readLine());

    }
}