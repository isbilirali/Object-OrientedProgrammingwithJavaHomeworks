package ch02_inheritance.accessScenario;

public class ParentInSamePackage {

    public String publicVar = "public variable from same package";
    String defaultVar = "default variable from same package";
    protected String protectedVar = "protected variable from same package";
    private String privateVar = "private variable from same package";

    public static String publicStaticVar = "public static variable from same package";
    static String  defaultStaticVar = "default static variable from same package";
    protected static String protectedStaticVar = "protected static variable from same package";
    private static String privateStaticVar = "private static variable from same package";

    public void publicMethod() {
        System.out.println("In public method from same package.");
    }
    void defaultMethod(){
        System.out.println("In default method from same package");
    }
    protected void protectedMethod(){
        System.out.println("In protected method from Parent class in same package");
    }
    private void privateMethod(){
        System.out.println("In private method from same package");
    }

    public static void publicStaticMethod() {
        System.out.println("In public static  method from same package.");
    }
    static void defaultStaticMethod(){
        System.out.println("In default static method from same package");
    }
    protected static void protectedStaticMethod(){
        System.out.println("In protected static method from same package");
    }
    private static void privateStaticMethod(){
        System.out.println("In private static method from same package");
    }
}
