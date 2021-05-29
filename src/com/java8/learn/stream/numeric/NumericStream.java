package com.java8.learn.stream.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStream {
    private static int sumOfNumbers(List<Integer> l) { //Integer wrapper to int
        return l.stream().reduce(0, Integer::sum);  //unboxing to convert Integer to int
    }
    public static int sumOfNNumbersStream(int n) {
       return IntStream.rangeClosed(1, n).sum();
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of numbers: " + sumOfNumbers(integerList));
        System.out.println("Sum of n numbers with stream: " + sumOfNNumbersStream(5));
    }
}
