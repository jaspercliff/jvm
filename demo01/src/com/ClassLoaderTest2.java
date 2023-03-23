package com;

public class ClassLoaderTest2 {
    public static void main(String[] args) {
        try {
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println("classLoader = " + classLoader);
            ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
            System.out.println("classLoader1 = " + classLoader1);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
