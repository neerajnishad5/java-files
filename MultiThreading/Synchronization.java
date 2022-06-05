class MyThread1 extends Thread {
    MyData d;

    MyThread1(MyData dat) {
        d = dat;
    }

    public void run() {
        d.disp("Double ");
    }
}

class MyThread2 extends Thread {
    MyData dat;

    MyThread2(MyData d) {
        dat = d;
    }

    public void run() {
        dat.disp("Hello! ");
    }
}

class MyData {

    synchronized public void disp(String str) {
        synchronized (this) { // use this or declare sync in meth sign itself

            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");

            }
        }
    }
}

public class Synchronization {
    public static void main(String[] args) {

        MyData d = new MyData();

        MyThread1 d1 = new MyThread1(d);
        MyThread2 d2 = new MyThread2(d);

        d1.start();
        d2.start();
        

    }
}
