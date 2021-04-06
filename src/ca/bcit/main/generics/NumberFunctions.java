package ca.bcit.main.generics;

// we can create bounded types by inheriting from
// some other class, for example if we want only numeric data
// we can extend from Number
public class NumberFunctions<T extends Number> {

    T num;


    NumberFunctions(T obj) {
        this.num = obj;
    }


    double square() {
        return num.intValue() * num.intValue();
    }

    // if we want a method to work with ANY type, we can use the wildcard
    // by passing a question mark (?) into the angle brackets
    boolean absoluteValueIsEqual(NumberFunctions<?> num) {
        return true;
    }

}
