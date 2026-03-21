package ch01_associations.universityAssociationEx;

/*
1. Üniversitedeki profesörler ve öğrencileri arasında iki türlü ilişki söz konusu olabilir:
Profesör ders verir öğrencisi ise o dersi alır ya da profesör öğrencinin danışmanı olur.
Bu iki ilişkiyi modelleyin ve ilişkinin türünü belirleyin.
 */

public class Professor {
    private String name;
    private Course coursesGiven;
    private Student advisee;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCoursesGiven() {
        return coursesGiven;
    }

    public void setCoursesGiven(Course coursesGiven) {
        this.coursesGiven = coursesGiven;
    }

    public Student getAdvisee() {
        return advisee;
    }

    public void setAdvisee(Student advisee) {
        this.advisee = advisee;
    }
}
