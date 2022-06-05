public class RunnableInterfaceMThreading implements Runnable {

    public void run() {
        int i = 1;

        while (true) {
            System.out.println(i + "World");
            i++;

        }
    }

    public static void main(String[] args) {

        RunnableInterfaceMThreading r = new RunnableInterfaceMThreading();
        Thread m = new Thread(r);
        m.start();

        int i = 1;

        while (true) {
            System.out.println(i + "World");
            i++;

        }
    }

}
