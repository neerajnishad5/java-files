public class WrapperClass {
    public static void main(String[] args) {
        // THESE ARE ALL OBJECTS OF WRAPPER CLSSEES
        Integer i = Integer.valueOf(500);

        Integer b = 10;

        Byte c = 15;
        byte bb = 45;
        Byte d = Byte.valueOf(bb);
        Byte e = Byte.valueOf("45");

        Short f = Short.valueOf("55");

        float g = 77.5f;
        Float h = Float.valueOf(55.33f);

        Double j = Double.valueOf("44.323");

        Boolean l = Boolean.valueOf(true);

        System.out.println(l);

    }
}
