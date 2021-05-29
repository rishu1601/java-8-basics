package com.java8.learn.stream.basics;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFactory {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("a", "aa", "bb");
        stringStream.forEach(System.out::println);

        List<Integer> pow2List = Stream.iterate(1, x -> x * 2)
                .limit(24)
                .collect(Collectors.toList());
        System.out.println(pow2List);

        System.out.println("generate");
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(10)
                .forEach(System.out::println);
    }
}
