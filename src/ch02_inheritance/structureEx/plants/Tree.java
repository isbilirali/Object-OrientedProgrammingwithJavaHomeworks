package ch02_inheritance.structureEx.plants;

public class Tree extends Plant{

    protected int age;

    public Tree(String name , int height , int age){
        super(name,height);
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
