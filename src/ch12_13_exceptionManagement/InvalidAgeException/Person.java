package ch12_13_exceptionManagement.InvalidAgeException;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if(age<0 || age>140){
            throw new InvalidAgeException("Age must be a positive integer between 0 and 140");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>140){
            throw new InvalidAgeException("Age must be a positive integer between 0 and 140");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
