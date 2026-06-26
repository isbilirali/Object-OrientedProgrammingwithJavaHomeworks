package ch05_javalangObject;

import java.util.Objects;

/*
1. Id, email, firstName, lastName ve age alanlarına sahip Person nesnesi için
equals(), hashCode() ve toString() metotlarını override edin.
a. equals() metodunun sağlaması gereken özelliklerini kontrol edin.
b. equals() ve hashCode() metotlarının tutarlı olup olmadıklarını kontrol edin.
c. toString() metodunda StringBuilder kullanın.
 */


public class Person {
    private int    id;
    private String email;
    private String firstName;
    private String lastName;
    private int    age;

    public Person(int id, String email,
                  String firstName, String lastName, int age) {
        this.id        = id;
        this.email     = email;
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person other = (Person) o;
        return id == other.id
                && age == other.age
                && Objects.equals(email,     other.email)
                && Objects.equals(firstName, other.firstName)
                && Objects.equals(lastName,  other.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, firstName, lastName, age);
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "id=" + id +
//                ", email='" + email + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", age=" + age +
//                '}';
//    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Person{")
                .append("id=").append(id)
                .append(", email='").append(email).append('\'')
                .append(", firstName='").append(firstName).append('\'')
                .append(", lastName='").append(lastName).append('\'')
                .append(", age=").append(age)
                .append('}')
                .toString();
    }
}
