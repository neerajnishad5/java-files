import java.io.CharArrayReader;

public class CharArrayReaderDemo {
    public static void main(String[] args) throws Exception {
        char a[] = { 'n', 'e', 'e', 'r', 'a', 'j' };

        CharArrayReader car = new CharArrayReader(a);

        int x;
        while ((x = car.read()) != -1) {
            System.out.print((char) x);
        }
        car.close();
    }
}
