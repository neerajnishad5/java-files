
public class StudentSubject {

    public static class Subject {
        private String subid;
        private String name;
        private int maxMarks;
        private int marksObtain;

        public Subject(String subid, String name, int maxMarks) {
            this.subid = subid;
            this.name = name;
            this.maxMarks = maxMarks;

        }

        public String getSubId() {
            return subid;

        }

        public String getName() {
            return name;
        }

        public int getMaxMarks() {
            return maxMarks;

        }

        public int getMarksObtain() {
            return marksObtain;
        }

        public void setMaxMarks(int maxMarks) {
            this.maxMarks = maxMarks;
        }

        public void setMarksObtian(int marksObtain) {
            this.marksObtain = marksObtain;
        }

        public String toString() {
            return "\nSubject ID: " + subid + "\n" + "Name: " + name + "\nMarks Obtain: " + marksObtain; // this will be
                                                                                                         // automatically
                                                                                                         // called by
                                                                                                         // System.out.println
                                                                                                         // and printed.
        }

        public Subject(String subid, String name) {
            this.subid = subid;
            this.name = name;

        }

        boolean isQualified(int marksObtain) {
            return (marksObtain >= (maxMarks * .4));

        }

    }

    public static class Student {
        private String rollNo;
        private String name;
        private String dept;
        private String subjects;

        public String getRollNo() {
            return rollNo;

        }

        public String getName() {
            return name;
        }

        public String getDept() {
            return dept;

        }

        public String getSubject() {
            return subjects;
        }

        public void setSubjects(String... s) {
            String[] ss = new String[3];
            ss[0] = getSubject();
            ss[1] = getSubject();
            ss[2] = getSubject();
        }

        public Student(String rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        public Student(String Srollno, String sname, String Sdept, String Ssubs) {
            rollNo = Srollno;
            name = sname;
            dept = Sdept;
            subjects = Ssubs;
        }

        public Student(String Srollno, String sname, String Sdept) {
            rollNo = Srollno;
            name = sname;
            dept = Sdept;

        }

        public String toString() {
            return "\nRoll No.: " + rollNo + "\nName: " + name + "\nDept: " + dept + "\nSubjects: " + subjects;

        }
    }

    public static void main(String[] args) {

        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s100", "Algos", 100);
        subs[1] = new Subject("s101", "DS", 100);
        subs[2] = new Subject("s102", "OS", 100);

        for (Subject x : subs) {
            System.out.println(x);
        }

        Student[] s = new Student[3];

        s[0] = new Student("s111", "Rahul", "CSE");
        s[1] = new Student("s222", "Kunal", "CSE");
        s[2] = new Student("s333", "Utpal", "CSE");

        for (Student x : s) {
            System.out.println(x);
        }

    }
}
