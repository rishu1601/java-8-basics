package com.java8.learn.functionalinterfaces;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> upperCase = (name) -> name.toUpperCase(Locale.ROOT);
    static Function<String, String > addString = (name) -> name.toUpperCase(Locale.ROOT).concat(" We are back");
    public static void main(String[] args) {
        System.out.println(FunctionExample.class);
        System.out.println(upperCase.apply("Hello"));
        System.out.println(upperCase.andThen(addString).apply("andThenExample"));
        System.out.println(upperCase.compose(addString).apply("composeExample"));
    }
}
