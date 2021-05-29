package com.java8.learn.stream.parallel;

import org.omg.SendingContext.RunTime;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStream {
    public static long checkPerformance(Supplier<Integer> supplier, int n) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < n; i++) {
            supplier.get();
        }
        return System.currentTimeMillis() - startTime;
    }
    private static int sumSeq() {
        return IntStream
                .rangeClosed(1, 1000000)
                .sum();
    }

    private static int sumParallel() {
        return IntStream
                .rangeClosed(1, 1000000)
                .parallel()
                .sum();
    }
    public static void main(String[] args) {
        System.out.println("Processors Available: " + Runtime.getRuntime().availableProcessors());
        System.out.println("Seq");
        System.out.println(checkPerformance(ParallelStream::sumSeq, 200));

        System.out.println("parallel");
        System.out.println(checkPerformance(ParallelStream::sumParallel, 200));
    }
}
