interface Member {
    void callback();
}

class Customer implements Member {
    String name;

    Customer(String n) {
        name = n;
    }

    public void callback() {
        System.out.println("Okay, I will visit " + name);
    }
}

class Store {
    Member mem[] = new Member[100];
    int count = 0;

    void register(Member m) {
        mem[count++] = m;
    }

    void inviteSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }

}

public class StoreCallback {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c = new Customer("John");
        Customer c1 = new Customer("Steve");
        s.register(c);
        s.register(c1);

        s.inviteSale();
    }
}
