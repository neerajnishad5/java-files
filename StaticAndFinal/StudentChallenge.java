import java.util.Date;

class Student {
    private String rollNo;
    private static int count = 1;

    private String generateRollNo() {
        Date d = new Date();
        String rn = "Univ-" + (d.getYear() + 1900) + "-" + count;
        count++;
        return rn;
    }

    Student() {
        rollNo = generateRollNo();
    }

    public String getRollNo() {
        return rollNo;
    }

}

public class StudentChallenge {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s.getRollNo());
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
    }

}
