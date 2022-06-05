public class MathClass {
    public static void main(String[] args) {

        int i = Integer.MIN_VALUE;

        i--;
        System.out.println(i); // due to underflow it prints the max int value

        // to prevent underflow use Integer.decrementExact(); it'll throw exception

        int j = Integer.MIN_VALUE;

        

        

        // System.out.println(Math.decrementExact(Integer.MIN_VALUE));

        System.out.println(Math.getExponent(55.55)); // returns expo from Float SEM format

        System.out.println("Floor division: " + Math.floorDiv(50, 3)); // returns floor divsion

        System.out.println("e power x: " + Math.exp(2)); // returns e raise to some power x

        System.out.println("e power x : " + StrictMath.exp(1)); // more precise than Math class

        System.out.println("log base 10: " + Math.log10(100));

        System.out.println("Tan value: " + Math.tan(45 * Math.PI / 180)); // takes value in radians as parameter and returns double value

        System.out.println(Math.toRadians(90));

        System.out.println("Random: "+ Math.random()*100); // Math.random return random no. b/w 0 and 1.

        System.out.println(Math.decrementExact(81));

        System.out.println("Next Float number: "+ Math.nextAfter(22.5, 100));



    }
}
