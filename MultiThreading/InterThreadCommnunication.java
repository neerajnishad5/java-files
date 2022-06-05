

class Producer extends Thread {

    MyData data;

    public Producer(MyData d) {
        data = d;

    }

    @Override
    public void run() {
        int count = 1;

        while (true) {
            data.setValue(count);
            System.out.println("Producer: " + count);
            count++;
        }
    }

}

class Consumer extends Thread {

    MyData data;

    public Consumer(MyData d) {
        data = d;

    }

    @Override
    public void run() {
        int value = 1;

        while (true) {
            data.getValue();
            System.out.println("Consumer: " + value);
            value++;
        }
    }

}

class MyData {

    int value;
    boolean flag = true;

    synchronized public void setValue(int v) {
        while (flag != true)
            try {
                wait();
            } catch (Exception e) {
            }

        value = v;
        flag = false;
        notify();
    }

    synchronized public int getValue() {

        while (flag != false) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        int x = value;
        flag = true;
        notify();
        return x;
    }

}

public class InterThreadCommnunication {

    public static void main(String[] args) throws Exception {
        
        MyData data = new MyData();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
}