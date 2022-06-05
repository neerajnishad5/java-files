
class Student extends Thread {
    String name;
    Whiteboard wb;

    public Student(String n, Whiteboard w) {
        name = n;
        wb = w;

    }

    @Override
    public void run() {

        String text;
        wb.attendance();

        do {
            text = wb.read();
            System.out.println(name + "Reading " + text);
            System.out.flush();

        } while (!text.equals("end"));

        System.out.println("Name of Student: " + name);
    }
}

class Teacher extends Thread {

    Whiteboard wb;
    boolean b = true;

    String notes[] = { "Java is a lang", "It is platform indep", "It supports thread", "It is OOPs lang", "end" };

    public Teacher(Whiteboard w) {
        wb = w;
    }

    @Override
    public void run() {
        for (int i = 0; i < notes.length; i++)
            wb.write(notes[i]);
    }

}

class Whiteboard {
    String text;
    int noOfStudents = 0;
    int count = 0;

    void attendance() {
        noOfStudents++;
    }

    synchronized public void write(String msg) {
        System.out.println("Teacher is writing: " + msg);

        while (count != 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        text = msg;
        count = noOfStudents;
        notifyAll();

    }

    synchronized public String read() {
        while (count == 0) {
            try {
                wait();
            } catch (Exception e) {

            }
        }

        String t = text;
        count--;
        if (count == 0)
            notifyAll();
        return t;
    }

}

public class ClassroomProblem {
    public static void main(String[] args) {
        Whiteboard wb = new Whiteboard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student("1. John ", wb);
        Student s2 = new Student("2. Smith ", wb);
        Student s3 = new Student("3. Kloob ", wb);
        Student s4 = new Student("4. Ajay ", wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }
}

class Student extends Thread {
    String name;
    Whiteboard wb;

    public Student(String n, Whiteboard w) {
        name = n;
        wb = w;

    }

    @Override
    public void run() {

        String text;
        wb.attendance();

        do {
            text = wb.read();
            System.out.println(name + "Reading " + text);
            System.out.flush();

        } while (!text.equals("end"));

        System.out.println("Name of Student: " + name);
    }
}

class Teacher extends Thread {

    Whiteboard wb;
    boolean b = true;

    String notes[] = { "Java is a lang", "It is platform indep", "It supports thread", "It is OOPs lang", "end" };

    public Teacher(Whiteboard w) {
        wb = w;
    }

    @Override
    public void run() {
        for (int i = 0; i < notes.length; i++)
            wb.write(notes[i]);
    }

}

class Whiteboard {
    String text;
    int noOfStudents = 0;
    int count = 0;

    void attendance() {
        noOfStudents++;
    }

    synchronized public void write(String msg) {
        System.out.println("Teacher is writing: " + msg);

        while (count != 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        text = msg;
        count = noOfStudents;
        notifyAll();

    }

    synchronized public String read() {
        while (count == 0) {
            try {
                wait();
            } catch (Exception e) {

            }
        }

        String t = text;
        count--;
        if (count == 0)
            notifyAll();
        return t;
    }

}

public class ClassroomProblem {
    public static void main(String[] args) {
        Whiteboard wb = new Whiteboard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student("1. John ", wb);
        Student s2 = new Student("2. Smith ", wb);
        Student s3 = new Student("3. Kloob ", wb);
        Student s4 = new Student("4. Ajay ", wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }
}
