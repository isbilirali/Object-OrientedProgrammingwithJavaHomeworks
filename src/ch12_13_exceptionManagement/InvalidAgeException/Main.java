package ch12_13_exceptionManagement.InvalidAgeException;

/*
Person nesnesi oluşturacak şekilde Person create(String name, int
age) metoduna sahip PersonFactory sınıfını oluşturun. Ayrıca
InvalidAgeException isimli unchecked bir sıra dışı durum sınıfı geliştirin.
create() metoduna geçilen yaş negatif veya 150’den büyük olduğunda
InvalidAgeException nesnesi fırlatılmalıdır.
a. main metotta Person nesneleri oluşturun. Bazı Person nesneleri için yaş
verisini sıra dışı durum fırlatacak şekilde verin.
b. try-catch bloğu yazmanıza gerek var mı? Neden?
c. Bu sıra dışı durum sizce neden uncheckeddir?
 */
public class Main {

    public static void main(String[] args) {

        // Valid Person objects / Geçerli Person nesneleri
        Person p1 = PersonFactory.create("Alice", 30);
        Person p2 = PersonFactory.create("Bob", 0);
        Person p3 = PersonFactory.create("Charlie", 150);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Invalid ages — will throw InvalidAgeException
        // Geçersiz yaşlar — InvalidAgeException fırlatır
        String[] names = {"Dave", "Eve", "Frank"};
        int[] ages    = {  -1,   200,    25  };

        for (int i = 0; i < names.length; i++) {
            try {
                Person p = PersonFactory.create(names[i], ages[i]);
                System.out.println(p);
            } catch (InvalidAgeException e) {
                System.out.println("Caught exception for '" + names[i]
                        + "' (age=" + ages[i] + "): " + e.getMessage());
            }
        }
    }


}
