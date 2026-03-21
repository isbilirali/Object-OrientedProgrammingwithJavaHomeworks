package ch02_inheritance.initializationOrderEx;

public class A {

    protected static int x = 1903;

    static {
        System.out.println("initializing class A");
    }

    {
        System.out.println("initializing object A");
    }
}




