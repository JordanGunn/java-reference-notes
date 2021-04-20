package ca.bcit.main.functionalinterfaces2;

// functional interface is an interface with a single abstract method


public class PersonalFunctionalInterface {

    public static void main(String[] args) {
        WeightFunction<Integer, Integer> weightFunction = (input)-> input * 1000;

        System.out.println(weightFunction.convert(3));
    }
}

@FunctionalInterface
interface WeightFunction<T, R> {
    T convert(R from);
}
