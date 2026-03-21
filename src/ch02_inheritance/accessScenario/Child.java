package ch02_inheritance.accessScenario;

import ch02_inheritance.accessScenario.aPackage.ParentInDifferentPackage;

public class Child extends ParentInSamePackage{

    // Devralma *********************************
    public void printInfo(){
        System.out.println(publicVar );
        System.out.println(defaultVar); //depends on Parent's package
        System.out.println(protectedVar);
//      System.out.println(privateVar);

        System.out.println(publicStaticVar );
        System.out.println(defaultStaticVar); //depends on Parent's package
        System.out.println(protectedStaticVar);
//      System.out.println(privateStaticVar);

        publicMethod();
        defaultMethod(); //depends on Parent's package
        protectedMethod();
//      privateMethod();

        publicStaticMethod();
        defaultStaticMethod(); //depends on Parent's package
        protectedStaticMethod();
 //     privateStaticMethod();
    }

    // Paket içi erişim *********************************
    public void printInfo(ParentInSamePackage samePackage){
        System.out.println(samePackage.publicVar );
        System.out.println(samePackage.defaultVar);
        System.out.println(samePackage.protectedVar);
//      System.out.println(samePackage.privateVar);

        System.out.println(ParentInSamePackage.publicStaticVar );
        System.out.println(ParentInSamePackage.defaultStaticVar);
        System.out.println(ParentInSamePackage.protectedStaticVar);
//      System.out.println(ParentInSamePackage.privateStaticVar);

        samePackage.publicMethod();
        samePackage.defaultMethod();
        samePackage.protectedMethod();
//      psp.privateMethod();

        ParentInSamePackage.publicStaticMethod();
        ParentInSamePackage.defaultStaticMethod();
        ParentInSamePackage.protectedStaticMethod();
//      ParentInSamePackage.privateStaticMethod();
    }

    // Paket dışı erişim *********************************
    public void printInfo(ParentInDifferentPackage differentPackage){
        System.out.println(differentPackage.publicVar );
//      System.out.println(differentPackage.defaultVar);
//      System.out.println(differentPackage.protectedVar);
//      System.out.println(differentPackage.privateVar);


        System.out.println(ParentInDifferentPackage.publicStaticVar );
//      System.out.println(ParentInDifferentPackage.defaultStaticVar);
//      System.out.println(ParentInDifferentPackage.protectedStaticVar);
//      System.out.println(ParentInDifferentPackage.privateStaticVar);

        differentPackage.publicMethod();
//      differentPackage.defaultMethod();
//      differentPackage.protectedMethod();
//      differentPackage.privateMethod();

        ParentInDifferentPackage.publicStaticMethod();
//      ParentInDifferentPackage.defaultStaticMethod();
//      ParentInDifferentPackage.protectedStaticMethod();
//      ParentInDifferentPackage.privateStaticMethod();
    }
}
