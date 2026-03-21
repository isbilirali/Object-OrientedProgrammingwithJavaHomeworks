package ch02_inheritance.structureEx.test;

import ch02_inheritance.structureEx.plants.Rose;

public class Test {

    static void main() {
        Rose rose = new Rose("rose",35,"red",true);
        rose.grow();
        //System.out.println(rose.height);
        System.out.println(rose.getHeight());  //Rose--->Flower--->Plant
    }
}
