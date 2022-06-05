import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

class My {
    private int a;
    protected int b;
    public int c;
    int d;

    public My() {
    }

    public My(int a, int b) {

    }

    public void disp() {

    }

    public int show(String s1, String s2) {
        return 0;
    }
}

public class ReflectPackage {
    public static void main(String[] args) {
        // 1st Method
        Class c = My.class; // c will get the info of My class i.e all the meths , constructors, dataMembers

        // 2nd Method
        My m = new My();
        Class c1 = m.getClass(); // c1 will get all the info about the class My object m

        System.out.println(c.getName()); // name of class

        Field field[] = c.getDeclaredFields(); // to get all the data members in

        for (Field f : field) {
            System.out.println(f);
        }

        Constructor c2[] = c.getConstructors(); // returns all the constructors to the array of type Constructor

        for (Constructor cc : c2) {
            System.out.println(cc);

        }

        Method m1[] = c.getMethods();

        for (Method mm : m1) {
           //System.out.println("Methods of Class: "+ m1.getClass()+" "+mm);

        }

       


        Parameter p1[] = m1[1].getParameters();

        for (Parameter ppp : p1) {
            System.out.println("Parameter of method: "+ppp);
        }
        
        

    }
}
