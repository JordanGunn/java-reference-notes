package ca.bcit.main.functionalinterface;

// The UnaryOperator Interface<T> is a part of the java.util.function package which has been introduced
// since Java 8, to implement functional programming in Java. It represents a function which takes in
// one argument and operates on it. However what distinguishes it from a normal Function is that both
// its argument and return type are the same.
//
// Hence this functional interface which takes in one generic namely:-
//
//        T: denotes the type of the input argument to the operation
//
// Hence the UnaryOperator<T> overloads the Function<T, T> type. So it inherits
// the following methods from the Function Interface:
//
//        T apply(T t)
//        default <V> Function<T, V> andThen(Function<? super R, ? extends V> after)
//        default <V> Function<V, R> compose(Function<? super V, ? extends T> before)
//
// The lambda expression assigned to an object of UnaryOperator type is used to define its accept() which eventually applies the given operation on its argument.

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        // Example using a single lambda expression
        UnaryOperator<Integer> xor = a -> a ^ 1;
        System.out.println(xor.apply(2));

        // example using UnaryOperator.andThen()
        UnaryOperator<Integer> xorr = a -> a + 1;
        UnaryOperator<Integer> and = a -> a + 1;
        Function<Integer, Integer> compose = xorr.andThen(and);
        System.out.println(compose.apply(2));

        // example using UnaryOperator.compose()
        UnaryOperator<Integer> xorrr = a -> a + 1;
        UnaryOperator<Integer> andd = a -> a + 1;
        Function<Integer, Integer> composed = xorrr.compose(andd);
        System.out.println(composed.apply(2));
    }
}
