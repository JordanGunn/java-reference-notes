package ca.bcit.main.functionalinterfaces2;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int inc = increment(0);
        inc = increment(inc);
        System.out.println(inc);

        // Function<T, R> DEMO
        int increment2 = incrementByOneFunction.apply(0);
        increment2 = incrementByOneFunction.apply(increment2);
        System.out.println(increment2);

        // .andThen() DEMO
        int  multiply = multiplyByTen.apply(increment2);
        System.out.println(multiply);

        inc = incrementByOneThenMultiplyByTen.apply(inc);
        System.out.println(inc);
        inc = incrementByOneThenMultiplyByTen.apply(inc);
        System.out.println(inc);

    }

    // !!!!you can define Functional interfaces OUTSIDE of a method by making the Function static!!!!!
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyByTen = number -> number * 10;
    // !!! you can use .andThen() to chain the above functions together into a single function
    static Function<Integer, Integer> incrementByOneThenMultiplyByTen = incrementByOneFunction.andThen(multiplyByTen);

    static int increment(int number) {
        return number + 1;
    }
}
