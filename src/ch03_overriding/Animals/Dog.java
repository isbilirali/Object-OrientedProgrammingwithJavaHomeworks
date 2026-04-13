package ch03_overriding.Animals;

//2. Hayvanlar ses çıkarırlar; farklı hayvanlar farklı sesler çıkarırlar. Bunu nasıl modellersiniz?

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("hav hav");
    }
}
