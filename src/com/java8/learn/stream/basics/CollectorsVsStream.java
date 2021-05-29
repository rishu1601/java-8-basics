package com.java8.learn.stream.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectorsVsStream {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("name");
        l.add("ckam");
        l.add("four");

        Stream<String> nameStream = l.stream();
        nameStream.forEach(System.out::println);
//        nameStream.forEach(System.out::println); -> Raises illegalState Exception

    }
}
