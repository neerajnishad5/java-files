class myThread extends Thread {

    public void run() {

        int count = 1;

        while (true) {
            System.out.println(count++ + " myThread");

        }

    }
}

public class myThreadMethods {
    public static void main(String[] args) throws Exception {

        myThread t = new myThread();

        // t.setDaemon(true);
        t.start();

        // Thread.sleep(2000);

        // Thread mainThread = new Thread();
        // mainThread = Thread.currentThread();

        // mainThread.join();

        int count = 1;

        while (true) {
            System.out.println(count++ + " Main");
            Thread.yield(); // yield basically stops current thread(main method) and gives pref to other thread so that it gets more of CPU time and STARVATION is avoided.

        }

    }
}
