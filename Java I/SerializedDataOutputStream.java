import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

// here using DataOutputStream we can write data in own dataType form so no issue of string conversion

class Student {
    int rollNo;
    String name;
    float avg;
    String dept;

}

public class SerializedDataOutputStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("E:/Test2.txt");

        DataOutputStream dos = new DataOutputStream(fos);

        Student s = new Student();

        s.rollNo = 100;
        s.name = "Shiva Kaul";
        s.avg = 90.6f;
        s.dept = "CSE";

        dos.writeInt(s.rollNo); // Writing dataType in its own type eg Int
        dos.writeUTF(s.name);
        dos.writeFloat(s.avg);

        dos.writeUTF(s.dept);

        dos.close();
        fos.close();

    }
}
