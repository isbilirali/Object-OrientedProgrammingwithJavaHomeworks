package ch02_inheritance.accessScenario;

import ch02_inheritance.accessScenario.aPackage.ParentInDifferentPackage;

public class AccessTest {

    static void main() {

        Child child = new Child();
        System.out.println(child.protectedVar); //depends on parent's package.
        System.out.println(child.defaultVar); //depends on parent's package.

        System.out.println("***************************************");

        child.printInfo();

        System.out.println("***************************************");

        ParentInSamePackage samePackage = new ParentInSamePackage();
        child.printInfo(samePackage);

        System.out.println("***************************************");

        ParentInDifferentPackage differentPackage = new ParentInDifferentPackage();
        child.printInfo(differentPackage);

    }
}
