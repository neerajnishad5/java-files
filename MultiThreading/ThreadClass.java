class MyRun implements Runnable {
    public void run() {
        System.out.println("I'm running");
        
    }
}

class myThread extends Thread { // decalring thread by extending thread class

    public void run(){
        int count = 1;
        while(true)
        {
            System.out.println(count++);
            try{Thread.sleep(300);} // this will make sleep thread for 300 milliseconds then continue priting
            catch(InterruptedException e){
                System.out.println(e);
            }
    }
    }
    public myThread(String name) {
        super(name); /* Thread is parent class and we're calling constructor of super class so we pass name into super class for nameing myThread as name */
        setPriority(Thread.MIN_PRIORITY +2);
    }
}

public class ThreadClass {
    public static void main(String[] args) {

        Thread t = new Thread("Dhaagaaa"); //* implementing thread using Runnable interface and naming thread by passing name into constructor*/

        t.start();



        /*Setting name of a thread decalread above in separate class using  constructor*/

        myThread t1 = new myThread("Dhaaga"); 
        t1.start();
        t1.interrupt(); // this will make a sleep interrupt after 1 number is printed and then continue printing values
        

        // System.out.println("ID: "+t.getId());
        // System.out.println("ID: "+t1.getId());
        // System.out.println("Name: "+t.getName());
        // System.out.println("Name: "+t1.getName());
        // System.out.println("Priority: "+ t.getPriority());
        // System.out.println("Priority: "+ t1.getPriority());
        // System.out.println("State: "+t.getState());
        // System.out.println("State: "+t1.getState());
        // System.out.println("Alive: "+t.isAlive());






    }
}
