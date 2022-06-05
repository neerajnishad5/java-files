public class StudentClass {

    public static class Student {
        public int roll;
        public String name;
        public String course;
        public int m1, m2, m3;

        public int total() {
            return m1 + m2 + m3;

        }

        public int average() {

            return total() / 3;

        }

        public char grade() {
            char a = 'A';
            char b = 'B';
            char c = 'C';
            if (average() > 55 || average() == 55)
                return a;
            else if (average() < 55)
                return b;
            else
                return c;
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.roll = 1;
        s.name = "Rahul Kumar";
        s.course = "CSE";
        s.m1 = s.m2 = s.m3 = 55;

        System.out.println("Total: " + s.total());
        System.out.println("Average: " + s.average());
        System.out.println("Grade: " + s.grade());
    }

}
