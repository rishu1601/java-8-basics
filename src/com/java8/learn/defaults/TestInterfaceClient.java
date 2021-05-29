package com.java8.learn.defaults;

public class TestInterfaceClient implements Interface1, Interface2, Interface3 {
    public static void main(String[] args) {
        TestInterfaceClient testInterfaceClient = new TestInterfaceClient();
        //Multiple Inheritance
        /**Resolution-
         * class implementing the interface >
         * sub interface extending the interface >
         * function owner interface
         */
        testInterfaceClient.methodA();
        testInterfaceClient.methodB();
        testInterfaceClient.methodC();
    }
}
