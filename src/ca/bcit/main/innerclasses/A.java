package ca.bcit.main.innerclasses;

public class A {

    static int i;

    class B {
        int j;
    }

    static class C {
        int k;
    }
}

class X {
    int v;


}

// simple example of phone class
interface Phone {
    void show();
}

// syntax for accessing inner B object class
class Main {
    public static void main(String[] args) {

        A.i = 1; // assign a value to a static variable
        A obj = new A();
        A.B obj1 = obj.new B(); // instantiate a new inner class (non-static)
        obj1.j = 5; // assign a value to member of inner class
        A.C obj2 = new A.C(); // instantiate an inner static class
        obj2.k = 3;

        Phone pAnon = new Phone() {
            public void show() {
                System.out.println("Call, sms");
            }
        };
        pAnon.show();

    }
}
