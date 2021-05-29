package com.java8.learn.stream.numeric;

import java.util.stream.IntStream;

public class NumericStreamRanges {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 50);
        System.out.println("Range: ");
        System.out.println("Size: ");
        System.out.println(intStream.count());
        System.out.println("values:");
        IntStream.range(1, 50).forEach(value -> System.out.print(value + ","));
        IntStream intStreamClosed = IntStream.rangeClosed(1, 50);
        System.out.println("Range closed: ");
        System.out.println("Size: ");
        System.out.println(intStreamClosed.count());
        System.out.println("values:");
        IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));

        System.out.println("Range closed Double : ");
        System.out.println("Size: ");
        System.out.println("values:");
        IntStream.rangeClosed(1, 50).asDoubleStream().forEach(value -> System.out.print(value + ","));
    }
}
