class HondaCityClass {
    int a, b;
    static int price = 10000;

    static float onRoad(String city) {
        switch (city) {
            case "Delhi":
                return price + (price * 0.1f);
            case "Goa":
                return price + (price * 0.2f);
            case "Mumbai":
                return price + (price * 0.3f);
            case "Kolkata":
                return price + price * (0.0212f);
            default:
                return 0;
        }
    }
}

public class HondaCity {
    public static void main(String[] args) {
        HondaCityClass h1 = new HondaCityClass();

        System.out.println(h1.onRoad("Kolkata"));
    }
}
