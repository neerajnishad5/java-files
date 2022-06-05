import java.io.DataInputStream;
import java.io.FileInputStream;

class Student {
    int rollNo;
    String name;
    float avg;
    String dept;

}

// DataInputStream is used for formatted reaading of object's data members i.e. int read as int, String as String & so on.

public class SerializedDataInputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("E:/Test2.txt");
        DataInputStream dis = new DataInputStream(fis);

        Student s = new Student();

        s.rollNo = dis.readInt();
        s.name = dis.readUTF();
        s.avg = dis.readFloat();
        s.dept = dis.readUTF();

        System.out.println("Roll no: " + s.rollNo);
        System.out.println(s.name);
        System.out.println(s.avg);
        System.out.println(s.dept);

    }
}
