package com.java8.learn.lambda;

public class LambdaRunnable {
    public static void main(String[] args) {
        /**
         * Before java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable now");
            }
        };
        Runnable runnableLambda = () -> System.out.println("Inside runnable lambda");

        /**
         * Java 8 lambda impl
         * For single line lambda, no {} are required.
         */
        new Thread(runnable).start();
        new Thread(runnableLambda).start();

        // Directly using lambda expression.
        new Thread(
                () -> System.out.println("Inside directly running lambda")
        ).start();
    }
}
