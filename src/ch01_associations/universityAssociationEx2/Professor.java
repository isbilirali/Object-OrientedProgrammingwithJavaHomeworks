package ch01_associations.universityAssociationEx2;

/*
2. Benzer şekilde üniversitede profesörler bölümlerin altında hizmet verirler. Bu ilişkiyi modelleyin ve ilişkinin türünü belirleyin.
 */

public class Professor {

    private String name;
    private Department department;
    private Department menagedDepartment; //Optional

    public Professor(String name, Department department) {
        this.name = name;
        this.department = department;
        department.addProfessor(this);
    }

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getMenagedDepartment() {
        return menagedDepartment;
    }

    public void setMenagedDepartment(Department menagedDepartment) {
        this.menagedDepartment = menagedDepartment;
    }
}
