enum Dept {
    CSE, CIVIL, IT, MECH;

   private Dept(){ // constructor called when object created in main
        System.out.println(this.name());
    }
    public void disp(){
        System.out.println(this.name()+": "+ this.ordinal());
    }
}

public class EnumClass {
    public static void main(String[] args) {
       
        Dept e = Dept.MECH;

        e.disp();

        // Dept list[] = Dept.values();

        // for (Dept x : list) {
        // System.out.println(x);
        // }



        
        
        
        
        
        
        
        
        
        
        
        
        
       // System.out.println(d.ordinal()); // returns object position
       // System.out.println(d.name()); // returns the identifier itself

        /* switch (d) { //  prints the Head and loc of the object referenced
            case CSE:
                System.out.println("Head: John\nLocation: Block A");
                break;
            case IT:
                System.out.println("Head: Rekha\nLocation: Block B");
                break;
            case CIVIL:
                System.out.println("Head: Seema\nLocation: Block C");
                break;
            case MECH:
                System.out.println("Head: Hopkins\nLocation: Block D");
                break;
        }*/

    }
}