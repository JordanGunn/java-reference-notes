package ca.bcit.main.oopBasics;

public class Headphones {

    String charge = "micro USB";
    String[] controls = {"power", "volume", "skip", "play/pause"};

    static boolean power = false;
    static int volume = 0;

    public static void powerOn(){
        power = true;
    }

    public static void powerOff(){
        power = false;
    }

    public static void volumeUp(){
        volume++;
    }
}
