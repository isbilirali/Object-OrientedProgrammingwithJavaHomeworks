package ch02_inheritance.initializationOrderEx;

public class B extends A{

    protected static int y = 66;

    static {
        System.out.println("initializing class B");
    }

    {
        System.out.println("initializing object B");
    }
}