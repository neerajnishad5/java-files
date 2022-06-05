class NegativeDimensionException extends Exception {
    public String toString() {
        return "Dimensions of a rectangle can't be negative!";
    }
}

public class ThrowVsThrows2 {
    static int area(int a, int b) throws NegativeDimensionException {

        if (a < 0 || b < 0)
            throw new NegativeDimensionException();

        return a * b;
    }

    static void meth1() throws NegativeDimensionException {
        System.out.println("Area is: " + area(-5, 10));
    }

    public static void main(String[] args) {
        
        try {
            meth1();
        } 
        catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }
}
