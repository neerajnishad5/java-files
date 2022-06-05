public class StaticBlock {

    int a = 100;
    static int x;

    static {
        x = 900;
        System.out.println("Block 1");
    }

    static public void main(String[] args) {
        System.out.println("Mainnn");
    }

    static {
        System.out.println("block 2");
    }

}
