class Phone {
    void call() {
        System.out.println("Phone is calling");
    }

    void sms() {
        System.out.println("Phone is sms-ing");
    }
}

interface MuiscPlayer {
    void play();

    void stop();

}

interface Camera {
    void click();

    void record();
}

class Smartphone extends Phone implements Camera, MuiscPlayer {
    public void call() {
        System.out.println("Smartphone is calling");
    }

    public void video() {
        System.out.println("Smartphone is making video");
    }

    public void click() {
        System.out.println("Smartphone is clicking");
    }

    public void record() {
        System.out.println("Smartphone is recording video");
    }

    public void play() {
        System.out.println("Smartphone is playing music");
    }

    public void stop() {
        System.out.println("Smartphone has stopped playing music");
    }

}

public class Phone1 {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        Phone p = s;

        s.call();
        s.play();
        s.click();
        p.sms();

    }
}
