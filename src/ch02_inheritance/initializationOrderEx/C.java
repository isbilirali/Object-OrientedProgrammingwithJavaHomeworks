package ch02_inheritance.initializationOrderEx;

public class C extends B{

    static {
        System.out.println("initializing class C");
    }

    {
        System.out.println("initializing object C");
    }
}