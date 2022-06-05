class Tv {
    public void switchOn() {
        System.out.println("TV is on");

    }

    public void channelChange() {
        System.out.println("TV Channel changed");

    }

}

class SmartTV extends Tv {
    public void switchOn() {
        System.out.println("Smart TV is on");

    }

    public void channelChange() {
        System.out.println("Smart TV Channel changed");

    }

    public void browser() {
        System.out.println("SmartTV is browsing");
    }
}

public class TvSmartTVOverriding {
    public static void main(String[] args) {
        Tv t = new SmartTV();
        t.channelChange();
        t.browser(); // not available as reference is of normal TV and object is of SmartTV so all the methods of normal TV will be available only.




    }
}
