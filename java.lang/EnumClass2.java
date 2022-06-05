
enum Dept {
    IT("John", "Block D"), CSE("Mike", "Block A"), CIVIL("Seema", "Block B"), MECH("Hopkins", "Block C"); //giving values to the constants

    String name;
    String location;

    private Dept(String name, String loc) { // Constructor with parameters since values given to enum constants
        this.name = name;
        this.location = loc;

    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
}

public class EnumClass2 {

    public static void main(String[] args) {

        Dept d = Dept.CIVIL;
        System.out.println(d.getName());
        System.out.println(d.getLocation());

    }

}
