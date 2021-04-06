package ca.bcit.main.generics;

// to use a generic we must pass <T> between class declaration and curly brackets
// we can pass in multiple values between the angle brackets for multiple types
public class MyClass<T, V> {

    T object;
    V object2;

    MyClass(T object, V object2) {
        this.object = object;
        this.object2 = object2;
    }

    void showType() {
        System.out.println(object.getClass().getName());
    }
}

class Demo {


}
