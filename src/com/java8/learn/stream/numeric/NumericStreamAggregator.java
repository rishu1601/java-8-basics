package com.java8.learn.stream.numeric;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregator {
    public static void main(String[] args) {
        System.out.println("sum 1-50: " + IntStream.rangeClosed(1, 50).sum());
        System.out.println("max 1-50: " + IntStream.rangeClosed(1, 50).max().orElse(0));
        System.out.println("min 1-50: " + LongStream.rangeClosed(40, 101).min().orElse(0));
        System.out.println("avg 1-50: " + IntStream.rangeClosed(1, 50).average().orElse(0.0));
    }
}
