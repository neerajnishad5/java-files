public class ConstrtuctorInInheritance {

    public static class Parent {
        public Parent() {
            System.out.println("Parent Class");
        }
    }

    public static class GrandChild extends Child {
        public GrandChild(){
            System.out.println("Grandchild Constructor");
        }
    }

    public static class Child extends Parent {
        public Child() {
            System.out.println("Child Class");

        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        // First Parent class will be executed then Child class will be exectued as Child is inherting properties from Parent.


    }
}
