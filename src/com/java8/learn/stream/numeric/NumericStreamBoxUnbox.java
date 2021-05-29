package com.java8.learn.stream.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxUnbox {
    //Boxing -> primitive to wrapper
    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 10) //int
                .boxed()             //Integer
                .collect(Collectors.toList());
    }

    //Unboxing -> wrapper to primitive
    public static int unBoxing(List<Integer> integerList) {
        return integerList
                .stream()
                //Wrapper Integer Values
                .mapToInt(Integer::intValue)
                //intStream
                .sum();
    }
    public static void main(String[] args) {
        System.out.println("Boxing: " + boxing());
        System.out.println("Unboxing: " + unBoxing(boxing()));
    }
}
