package ch12_13_exceptionManagement.InvalidAgeException;

public class PersonFactory {
    public static Person create(String name , int age){
        return new Person(name,age);
    }
}
