package com.java8.learn.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    static Predicate<Integer> testEven = (i) -> i % 2 == 0;
    static Predicate<Integer> testDiv5 = (i) -> i % 5 == 0;
    public static void testPredicateAnd() {
        System.out.println("Divisible by 10 test : "  + testEven.and(testDiv5).test(20));
    }
    public static void testPredicateOr() {
        System.out.println("Divisible by 2 or 5 test : "  + testEven.or(testDiv5).negate().test(18));
    }
    public static void main(String[] args) {
        System.out.println(testEven.test(4));
        testPredicateAnd();
        testPredicateOr();
    }
}
