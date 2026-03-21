package ch01_associations.universityAssociationEx;

/*
1. Üniversitedeki profesörler ve öğrencileri arasında iki türlü ilişki söz konusu olabilir:
Profesör ders verir öğrencisi ise o dersi alır ya da profesör öğrencinin danışmanı olur.
Bu iki ilişkiyi modelleyin ve ilişkinin türünü belirleyin.
 */

/*
------> 1-1 , bi-directional , tight usage association (has-a)
Hoca ders verir. (Hoca olmazsa ders olmaz.)
Ders olursa öğrenciler o dersi alır. (Ders olmazsa öğrenciler de olmaz.
 */


public class Test {
    static void main() {
        Professor professor1 = new Professor("Akın Kaldıroğlu");
        Course course1 = new Course("Object-Oriented Programming with Java" , professor1);
        Student student1 = new Student("Ali İşbilir" , course1 , professor1);

        course1.printfInfo();
    }
}
