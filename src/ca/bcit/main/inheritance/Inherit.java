package ca.bcit.main.inheritance;

public class Inherit {

    public static void main(String[] args) {

        Mouse1 m1 = new Mouse1();
        m1.leftClick();
        m1.rightClick();
        m1.scrollUp();
        m1.scrollDown();
        System.out.println();

        Mouse2 m2 = new Mouse2();
        m2.leftClick();
        m2.rightClick();
        m2.scrollUp();
        m2.scrollDown();
        System.out.println();
    }
}
