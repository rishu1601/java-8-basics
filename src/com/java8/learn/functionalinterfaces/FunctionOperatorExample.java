package com.java8.learn.functionalinterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class FunctionOperatorExample {
    static UnaryOperator<String> concatUP = s -> s.concat(" Gone");
    static BinaryOperator<Integer> someBinaryOperator = (a,b) -> a*b;
    public static void main(String[] args) {
        System.out.println(concatUP.apply("java8"));
        System.out.println(someBinaryOperator.apply(10,20));
    }
}
