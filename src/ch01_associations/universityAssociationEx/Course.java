package ch01_associations.universityAssociationEx;

/*
1. Üniversitedeki profesörler ve öğrencileri arasında iki türlü ilişki söz konusu olabilir:
Profesör ders verir öğrencisi ise o dersi alır ya da profesör öğrencinin danışmanı olur.
Bu iki ilişkiyi modelleyin ve ilişkinin türünü belirleyin.
 */

public class Course {
    private String courseName;
    private Student students;
    private Professor teacher;

    public Course(String courseName, Professor teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
        teacher.setCoursesGiven(this);
    }

    public void printfInfo(){
        System.out.println("Course name is " + courseName);
        System.out.println("Professor who teaches this course is " + teacher.getName());
        System.out.println("Student of this course : " + students.getName());
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public Professor getTeacher() {
        return teacher;
    }

    public void setTeacher(Professor teacher) {
        this.teacher = teacher;
    }
}
