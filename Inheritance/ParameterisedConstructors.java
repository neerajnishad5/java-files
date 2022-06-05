class Parent {

    public Parent() {
        System.out.println("Non-Param Constructor");

    }

    public Parent(int x) {
        System.out.println("Param Constructor: " + x);
    }

}

class Child extends Parent{

     Child() {
        System.out.println("Non-Param Constructor");

    }

    Child (int y){
        System.out.println("Param Constructor: "+ y);
    }
     Child(int x,int y) {
        super(x);
        System.out.println("2 Param of Child: "+ y);
        
    }
}



public class ParameterisedConstructors {
    public static void main(String[] args) {

        Child c = new Child(10,30);

    }
}