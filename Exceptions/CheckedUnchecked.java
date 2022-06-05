
class LowerBalanceException extends Exception { // Defining our own exception class for balance <= 3000
    @Override
    public String toString() {

        return "Balance shouldn't be less than 3000";
    }
}

public class CheckedUnchecked {

    static void fun1() {

        try {
            throw new LowerBalanceException();
        } catch (Exception e) {
            System.out.println(e);
            
            // TODO: handle exception
        }

        try {
            System.out.println(20 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());// TODO: handle exception
        }

    }

    static void fun2() {
        fun1();

    }

    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();

    }
}
