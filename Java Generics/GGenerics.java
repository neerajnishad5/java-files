import javax.swing.text.html.FormView;

@SuppressWarnings("unchecked")

// UPPERBOUND - EXTENDS
// LOWERBOUND - SUPER

 
class A {}

interface B{}
interface C{}


 
class MyArrayC<T extends B&C   >{

    void disp(int v){
        System.out.println(v);
    }
 
}

class MyArray<T> {

    int length = 0;

    T obj[] = (T[]) new Object[10]; /* Decalring array of type T inheriting object from Object class as we can't
                            create of generic Object directly*/

    public void append(T v) {
        obj[length++] = v;
    }

    public void disp() {

        for (int i = 0; i < length; i++) {
            System.out.print(obj[i]+" ");
        }
    }
}

public class GGenerics {

    public static void fun(MyArray<?>  array) {   // ? : is wildcard & not bounded means any type or same as not wrting
        array.disp();
    }

    private static void fun2(MyArray <? extends Number> obj     ) { // ? is wildcard means any type but it sets upper bound as Number class i.e. it must be a Number
        obj.disp();
    }
    public static void fun3(MyArray<? super Number> obj) { // inside wildcard we can use super also nowhere else its allowed.
        obj.disp();
    }

    public static void main(String[] args) {
        MyArray<String> a = new MyArray();
        a.append("Hello ");
        a.append("Hi ");
        a.append("Bye ");

        MyArray<Integer> b = new MyArray();
        b.append(5);
        b.append(6);
        b.append(1);

        fun(a);
        //fun(b);

        fun2(b);

         
        
    }
}
