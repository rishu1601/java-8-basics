package com.java8.learn.lambda;

import java.util.Comparator;

public class LambdaComparator {
    public static void main(String[] args) {
        /**
         * Before Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<Integer> comparatorLambda = (a, b) ->  b.compareTo(a);

        System.out.println("Result of comparator: " + comparator.compare(3, 2));

        System.out.println("Result of comparatorLambda: " + comparatorLambda.compare(3, 2));
        /**
         * Java 8 onwards
         */
    }
}
