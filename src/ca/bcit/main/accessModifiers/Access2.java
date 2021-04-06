package ca.bcit.main.accessModifiers;

public class Access2 {

    public static void main(String[] args) {
        Access1 a = new Access1();
        System.out.println(a.hours);
        System.out.println(a.minutes);
        System.out.println(a.pMinutes);
        System.out.println(a.pHours);
        int h = a.getHours();
    }
}
