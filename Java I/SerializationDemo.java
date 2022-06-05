import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.Reader;

// for storing/printing object into the txt file using printStream class
class Student {
    int rollNo;
    String name;
    String dept;
}

public class SerializationDemo {
    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("E:/Test2.txt");

        PrintStream ps = new PrintStream(fos); // same as sysout methods, out is an object of PrintStream, System: class
        Student s = new Student();
        s.rollNo = 100;
        s.name = "Shiva Kaul";
        s.dept = "CSE";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.print(s.dept);

        fos.close();
        ps.close();

    }
}
