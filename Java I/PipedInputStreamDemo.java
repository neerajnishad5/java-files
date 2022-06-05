import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream o) {
        os = o;
    }

    public void run() {
        int count = 0;
        while (true) {
            try {
                os.write(count); // to write on the o/p stream

                os.flush(); // to make sure the data is sent on the other side
                System.out.println("Producer: " + count);
                System.out.flush();

                Thread.sleep(10); // make it sleep for achieving sync

                count++;
            } catch (Exception e) {
            }
        }

    }

}

class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream o) {
        is = o;
    }

    public void run() {
        int x = 0;
        while (true) {
            try {
                x = is.read();

                System.out.println("Consumer: " + x);

                System.out.flush(); 

            } catch (Exception e) {
            }
        }

    }

}

public class PipedInputStreamDemo {
    public static void main(String[] args) throws Exception {

        PipedInputStream pis = new PipedInputStream();

        PipedOutputStream pos = new PipedOutputStream();

        pos.connect(pis); // either connect pos to pis or vice versa both are same
        // pis.connect(pos);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();

    }
}