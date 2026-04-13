package ch03_overriding.Animals;

//2. Hayvanlar ses çıkarırlar; farklı hayvanlar farklı sesler çıkarırlar. Bunu nasıl modellersiniz?

public class Test {

    static void main() {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Cat lion = new Lion();

        dog.makeSound();
        cat.makeSound();
        lion.makeSound();

    }
}
