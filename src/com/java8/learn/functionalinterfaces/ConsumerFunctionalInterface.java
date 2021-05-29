package com.java8.learn.functionalinterfaces;

import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase(Locale.ROOT));
        c1.accept("someSampleString");
    }
}
