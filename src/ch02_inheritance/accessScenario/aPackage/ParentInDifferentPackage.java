package ch02_inheritance.accessScenario.aPackage;

public class ParentInDifferentPackage {

    public String publicVar = "public variable from  different package";
    String defaultVar = "default variable from different package";
    protected String protectedVar = "protected variable from different package";
    private String privateVar = "private variable from different package";

    public static String publicStaticVar = "public static variable from different package";
    static String  defaultStaticVar = "default static variable from different package";
    protected static String protectedStaticVar = "protected static variable from different package";
    private static String privateStaticVar = "private static variable from different package";

    public void publicMethod() {
        System.out.println("In public method from different package.");
    }
    void defaultMethod(){
        System.out.println("In default method from different package");
    }
    protected void protectedMethod(){
        System.out.println("In protected method from Parent class in different package");
    }
    private void privateMethod(){
        System.out.println("In private method from different package");
    }

    public static void publicStaticMethod() {
        System.out.println("In public static  method from different package.");
    }
    static void defaultStaticMethod(){
        System.out.println("In default static method from different package");
    }
    protected static void protectedStaticMethod(){
        System.out.println("In protected static method from different package");
    }
    private static void privateStaticMethod(){
        System.out.println("In private static method from different package");
    }
}
