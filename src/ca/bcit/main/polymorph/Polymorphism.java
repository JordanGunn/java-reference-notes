package ca.bcit.main.polymorph;

class Bird {
    // polymorphism occurs when you have multiple classes with the same
    // method signature

    public void sing(){
        System.out.println("tweet tweet");
    }
}

class Robin extends Bird {
    public void sing(String song){
        System.out.println("twiddle dee dee");
    }
        }

class Pelican extends Bird {
    public void sing(){
        System.out.println("kwaaaak");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        // all 3 methods behave differently
        Bird b = new Bird();
        b.sing();

        Pelican p = new Pelican();
        p.sing();

        Robin r = new Robin();
        r.sing();


    }

}
