import java.io.*;

class Student implements Serializable {
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int data = 60;
    public transient int t = 7878;

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
        return "\nStudent Details\n" +
                "\nRoll: " + rollNo +
                "\nName: " + name +
                "\nAvg: " + avg +
                "\nDept: " + dept +
                "\nData: " + data +
                "\nTransient: " + t + "\n";
    }

}

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("E:/Test2.txt");

        ObjectInputStream os = new ObjectInputStream(fis);

        Student s = (Student) os.readObject();

        System.out.println(s);

        fis.close();
        os.close();
    }
}