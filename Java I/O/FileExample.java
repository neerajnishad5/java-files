import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws Exception {

        try {

            FileOutputStream fos = new FileOutputStream("E:/Test.txt");

            // creating an object ( & file name Test.txt also) of FileO/PStream by passing
            // file location as parameter

            String str = "Learn Java Programming";

            byte b[] = str.getBytes(); // converting string into array of bytes

            //fos.write(b); // writing whole string at once in test.txt file

            //fos.write(b, 6, str.length() - 6); // writing string from 6th position to end

            for (byte c : b) { // printing array of bytes using for-each loop
                fos.write(c);
            }

            fos.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
