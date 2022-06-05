class Bank {
    private String accNo;
    private static int c = 1;

    private String createAcc() {
        String AccNo = "ACC-490026" + "-" + c;
        c++;
        return AccNo;
    }

    public String getAccNo() {
        return accNo;
    }

    Bank() {
        accNo = createAcc();
    }
}

public class Account {
    public static void main(String[] args) {

        Bank b = new Bank();
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        Bank b3 = new Bank();

        System.out.println(b.getAccNo());
        System.out.println(b1.getAccNo());

        System.out.println(b2.getAccNo());
        System.out.println(b3.getAccNo());

    }

}
