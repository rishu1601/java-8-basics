package com.java8.learn.methodreference;

import java.util.Locale;
import java.util.function.Function;

public class FunctionMethodReference {
    static Function<String, String> upperCaseLambda = s -> s.toUpperCase(Locale.ROOT);
    static Function<String, String> upperCaseMethodRef = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(FunctionMethodReference.class);
        System.out.println("Using lambda: " + upperCaseLambda.apply("lambda"));
        System.out.println("Using method ref: " + upperCaseMethodRef.apply("methodRef"));
    }
}
