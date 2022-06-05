import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

class Customer implements Serializable {
    private String custID;
    private String name;
    private String phoneNo;

    static int count = 1;

    Customer(String n, String p) {
        custID = "C" + count;
        count++;
        name = n;
        phoneNo = p;
    }

    Customer() {
    }

    public Customer(String custID, String name, String phoneNo) {
        this.custID = custID;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String tosString() {
        return "\nCust ID: " + custID + "\nName: " + name + "\nPhone No.: " + phoneNo + "\n";
    }
}

public class StudentChallengeCustomer {
    /*
     * public static void main(String[] args) throws Exception {
     * 
     * Customer list[] = { new Customer("Shiva", "7685940319"), new Customer("Kaul",
     * "5748739201"),
     * new Customer("Person", "8844993322") };
     * 
     * FileOutputStream fos = new FileOutputStream("E:/Customer.txt");
     * 
     * ObjectOutputStream dos = new ObjectOutputStream(fos);
     * 
     * dos.writeInt(list.length);
     * 
     * for (Customer customer : list) {
     * dos.writeObject(customer);
     * 
     * }
     * 
     * dos.close();
     * fos.close();
     * 
     * }
     */

    public static void main(String[] args) throws Exception {


        FileInputStream fis = new FileInputStream("E:/Customer.txt");
        ObjectInputStream dis = new ObjectInputStream(fis);

        Scanner s = new Scanner(System.in);

        int length = dis.readInt();

        Customer list[] = new Customer[length];

        for (int i = 0; i < length; i++) {
            list[i] = (Customer) dis.readObject();
        }

        System.out.println("Enter Name of Customer: ");

        String name = s.nextLine();

        for (int i = 0; i < length; i++) {
            if (name.equalsIgnoreCase(list[i].name))
                System.out.println(list[i]);
        }

        dis.close();
        fis.close();

    }
}