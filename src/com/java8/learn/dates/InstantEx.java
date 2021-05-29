package com.java8.learn.dates;

import java.time.Instant;

public class InstantEx {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Instant Now : " + instant);
        System.out.println("instant.getEpochSecond(): " + instant.getEpochSecond());
    }
}
