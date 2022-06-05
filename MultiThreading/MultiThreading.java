public class MThreading extends Thread { // creating separate class for MultiThreading
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "World by Mthreading");
        }
    }
}

public class Multithreading extends Thread {

    public void run() { // Extending same class for MultiThreading
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args) { // Now program has multiple control flow; sometimes hello & sometimes world
                                             // will be
        MyClass m = new MyClass();
        m.start();
        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }

}
