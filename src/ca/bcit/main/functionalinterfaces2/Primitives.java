package ca.bcit.main.functionalinterfaces2;

import java.util.function.Consumer;

public class Primitives {
}

// Functional interfaces should be defined ina class as public
class Service {
    public Consumer<String> blah = System.out::println;
}
