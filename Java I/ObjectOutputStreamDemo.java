import java.io.*;

class Student implements Serializable {
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int data = 10;
    public transient  int t;

    public Student() {
    }

    public Student(int r, String n, float a, String d) {
        rollNo = r;
        name = n;
        avg = a;
        dept = d;
        data = 800;
        t = 800;
    }

    public String toString() {
        return "\nStudent Details" +
                "\nRoll: " + rollNo +
                "\nName: " + name +
                "\nAvg: " + avg +
                "\nDept: " + dept +
                "\nData: " + data +
                "\nTransient: " + t + "\n";
    }

}

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fis = new FileOutputStream("E:/Test2.txt");

        ObjectOutputStream os = new ObjectOutputStream(fis);

        Student s= new Student(5, "Shiva Kaul", 89.6f, "CSE");

       os.writeObject(s);

       os.close();
       fis.close();

         
    }
}
