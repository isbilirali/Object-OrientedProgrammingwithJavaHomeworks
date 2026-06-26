package ch06_polymorphism;

import ch06_polymorphism.shapes.domain.*;

/*
2. Bir metoda Object tipinde bir argüman geçmenin anlamlı olduğu örnekler veriniz.
 */
public class ObjectAsAParameter {

    public void printInfoWithIfBlocks(Object s) {
        if (s instanceof Circle c) {
            System.out.println("Daire");
        } else if (s instanceof Rectangle r) {
            System.out.println("Dikdörtgen");
        } else if (s instanceof Square sq) {
            System.out.println("Kare");
        } else if (s instanceof Triangle t) {
            System.out.println("Üçgen");
        }
    }

    public void printInfoWithSwitchCase(Object s) {
        switch (s) {
            case Circle c    -> System.out.println("Daire");
            case Rectangle r -> System.out.println("Dikdörtgen");
            case Square sq   -> System.out.println("Kare");
            case Triangle t  -> System.out.println("Üçgen");
            default          -> System.out.println("Bilinmeyen şekil");
        }
    }
}
