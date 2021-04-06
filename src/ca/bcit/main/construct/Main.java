package ca.bcit.main.construct;

public class Main {

    public static void main(String[] args) {
        // without specifying a constructor
        // Shirt() is the constructor
        Shirt s = new Shirt("White", 'M');
        s.putOn();
        s.putOn();

        System.out.println(s.color);
        System.out.println(s.size);

    }
}
