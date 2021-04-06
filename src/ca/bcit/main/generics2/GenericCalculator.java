//package ca.bcit.main.generics2;
//
//public class GenericCalculator {
//
//    public static void demo() {
//        System.out.println(Calculator.calculate(1, 1, ()));
//    }
//
//}
//
//class Calculator {
//
//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sub(int a, int b) {
//        return a + b;
//    }
//
//    public static int mul(int a, int b) {
//        return a + b;
//    }
//
//    public static int div(int a, int b) {
//        return a + b;
//    }
//
//    public static int calculate(int a, int b, BinaryOperation op) {
//        return op.apply(a, b);
//    }
//
//    @FunctionalInterface
//    interface BinaryOperation {
//        int apply(int num1, int num2);
//    }
//}
