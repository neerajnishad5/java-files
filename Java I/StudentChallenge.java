import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StudentChallenge {
    public static void main(String[] args) throws Exception {
        float f[] = { 66.5f, 77.5f, 55.5f, 22.5f, 99.5f };

        FileOutputStream fos = new FileOutputStream("E:/Test3.txt");

        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(f.length);

        for (float g : f) {
            dos.writeFloat(g);
        }
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("E:/Test3.txt");

        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();

        float data;

        for (int i = 0; i < length; i++) {
            data = dis.readFloat();
            System.out.println(data);
        }

        dis.close();
        fis.close();
    }

}
