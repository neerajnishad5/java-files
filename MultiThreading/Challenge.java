class Customer extends Thread {
    ATM atm;
    String name;
    int amount;

    Customer(String n, ATM a, int amt) {
        name = n;
        atm = a;
        amount = amt;

    }

    void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);

    }

    public void run() {
        useATM();
    }
}

class ATM {

    synchronized public void checkBalance(String name) {
        System.out.print(name + " Checking ");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        System.out.println("Balance");
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.print(name + " Withdrwaing: ");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }

        System.out.println(amount);
    }
}

public class Challenge {
    public static void main(String[] args) {

        ATM atm = new ATM();

        Customer c2 = new Customer("John", atm, 1000);
        Customer c1 = new Customer("Smith", atm, 2000);

        c1.start();
        c2.start();

    }
}
