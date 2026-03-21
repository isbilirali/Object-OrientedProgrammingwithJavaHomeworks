package ch01_associations.universityAssociationEx;

/*
1. Üniversitedeki profesörler ve öğrencileri arasında iki türlü ilişki söz konusu olabilir:
Profesör ders verir öğrencisi ise o dersi alır ya da profesör öğrencinin danışmanı olur.
Bu iki ilişkiyi modelleyin ve ilişkinin türünü belirleyin.
 */

public class Student {
    private String name;
    private Course coursesTaken;
    private Professor advisor;

    public Student(String name, Course coursesTaken, Professor advisor) {
        this.name = name;
        this.coursesTaken = coursesTaken;
        coursesTaken.setStudents(this);
        this.advisor = advisor;
        advisor.setAdvisee(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public Professor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Professor advisor) {
        this.advisor = advisor;
    }
}
