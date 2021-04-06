package ca.bcit.main.functionalinterface;

// The iterate(T, java.util.function.Predicate, java.util.function.UnaryOperator) method allows us to iterate
// stream elements till the specified condition. This method returns a sequential ordered Stream produced by
// iterative application of the given next function to an initial element, conditioned on satisfying hasNext
// predicate passed as parameter. The stream terminates as soon as the hasNext predicate returns false.
//
// The resulting sequence returned by this method may be empty if passed predicate does not hold on the
// seed value. Otherwise, the first element will be the supplied seed value, the next element will be
// the result of applying the next function to the seed value, and so on iteratively until the hasNext
// predicate indicates that the stream should terminate.


import java.util.stream.Stream;

public class StreamInteratePredicateUnaryOperator {

    public static void main(String[] args) {

        // create a stream using iterate
        Stream<Integer> stream
                = Stream.iterate(1, i -> i <= 20, i -> i * 2);

        // print Values
        stream.forEach(System.out::println);

        // create a stream using iterate
        Stream<Double> stream2
                = Stream.iterate(2.0, decimal -> decimal > 0.25, decimal -> decimal / 2);

        // print Values
        stream2.forEach(System.out::println);
    }
}
