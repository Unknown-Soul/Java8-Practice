package com.java.bootcamp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefinedFunctionalInterface {
    public static void main(String[] args) {

        //A Consumer is a functional interface that accepts a single input and returns no output.
        Consumer<Integer> consumer = a -> System.out.println(a);
        consumer.accept(1); //The accept method is the Single Abstract Method (SAM) which accepts a single argument of type T.

        //A Predicate interface represents a boolean-valued-function of an argument. This is mainly used to filter data from a Java Stream.
        Predicate<Integer> isOdd = a -> a % 2 == 1;
        System.out.println(isOdd.test(3));//A predicate has a test() method which accepts an argument and returns a boolean value.


        //A Function interface is more of a generic one that takes one argument and produces a result.
        Function<Integer, Integer> multiplyBy2 = a -> a * 2;
        System.out.println(multiplyBy2.apply(4));

        //A Supplier is a simple interface which indicates that this implementation is a supplier of results.
        Supplier<Integer> supplier = () -> 5;
        System.out.println(supplier.get()); //The supplier has only one method get() and does not have any other default and static methods.

    }
}
