import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

// program for reading the object from the txt file using bufferedReader class which has fileI/PStream attached object

class Student {
    int rollNo;
    String name;
    String dept;
}

public class SerializationReadData {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("E:/Test2.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(fis)); // attaching fileI/PStream to bufferedReader
                                                                            // br

        Student s = new Student();

        s.rollNo = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();

        System.out.println("Roll No.: " + s.rollNo);
        System.out.println("Name: " + s.name);
        System.out.println("Dept: " + s.dept);

    }
}
