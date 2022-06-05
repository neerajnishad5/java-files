public class FloatClass {
    public static void main(String[] args) {
        Float a = Float.valueOf("55.33");

        float b = 77.66f / 0;
        Float c = 55.44f / 0;
        Float d = -99.11f / 0;
        Float e = (float) Math.sqrt(9);

        System.out.println(c == Float.POSITIVE_INFINITY);
        System.out.println(d == Float.NEGATIVE_INFINITY);
        
        System.out.println(e == Float.NaN);



        // System.out.println(a.isInfinite());

    }
}
