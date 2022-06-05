import java.io.File;
import java.io.*;

public class FileClass {
    public static void main(String[] args) throws Exception {

        File f = new File("E:/Test.txt");

       // f.setReadOnly(); // setting file as read only

        System.out.println(f.lastModified());

        

        // FileOutputStream fos = new FileOutputStream("E:/Test.txt");

        System.out.println("Path: " + f.getPath());
        System.out.println("Length: " + f.length());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.canExecute());
        System.out.println(f.isDirectory());
        System.out.println(f.lastModified());
        System.out.println("Hashcode: " + f.hashCode());

        System.out.println("Hidden hai? : " + f.isHidden());

        // File list[] = f.listFiles(); // return an array of string files

        // for (File x : list) {
        // System.out.println("Name: "+ x.getName()+" Location: "+x);

        // }

    }
}
