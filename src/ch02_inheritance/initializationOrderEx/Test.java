package ch02_inheritance.initializationOrderEx;

public class Test {

    static void main() {

        new C();
        /*
        initializing class A
        initializing class B
        initializing class C
        initializing object A
        initializing object B
        initializing object C
        */

//        System.out.println(C.x); //C üzerinden A'daki static fielda ulaşırken sadece A classı yüklenir. B ve C yüklenmez!

//        System.out.println(C.y); //ama C üzerinden B'deki bir static fielda ulaşmaya çalışırsak B classının yüklenmesi için önce A classı yüklenmelidir.
    }
}
