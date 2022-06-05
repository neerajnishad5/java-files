import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile ras = new RandomAccessFile("E:/Test.txt", "rw");

        // byte b [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        System.out.println((char) ras.read());
        System.out.println((char) ras.read());
        System.out.println((char) ras.read());

        ras.write('d');
        System.out.println((char) ras.read());

        ras.skipBytes(3);
        System.out.println((char) ras.read()); 
        ras.seek(3);// prints 3rd byte from beginning 
        System.out.println((char) ras.read());
        System.out.println(ras.getFilePointer()); // gives current file location pointer

        ras.seek(ras.getFilePointer() - 2);
        System.out.println((char) ras.read()); }
}
