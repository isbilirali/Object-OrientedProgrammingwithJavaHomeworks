package ch01_associations.universityAssociationEx2;

/*
2. Benzer şekilde üniversitede profesörler bölümlerin altında hizmet verirler. Bu ilişkiyi modelleyin ve ilişkinin türünü belirleyin.
 */

public class Test {

    static void main() {
        Professor professor1 = new Professor("Akın Kaldıroğlu");
        Department department1 = new Department("Software Engineering" , professor1);

        Professor professor2 = new Professor("Ali Güneş" , department1);
        Professor professor3 = new Professor("Zafer Aslan" , department1);
        Professor professor4 = new Professor("Selçuk Şener" , department1);
        Professor professor5 = new Professor("Ferdi Sönmez" , department1);

        department1.printInfo();
    }
}
