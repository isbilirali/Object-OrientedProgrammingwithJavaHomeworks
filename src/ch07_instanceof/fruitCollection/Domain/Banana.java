package ch07_instanceof.fruitCollection.Domain;

public class Banana extends Fruit{
    @Override
    public void eat(){
        System.out.println("Banana is being eaten.");
    }

    public void peel(){
        System.out.println("Banana is being peeled.");
    }
}
