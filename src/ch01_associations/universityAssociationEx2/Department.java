package ch01_associations.universityAssociationEx2;

import java.util.ArrayList;
import java.util.List;

/*
2. Benzer şekilde üniversitede profesörler bölümlerin altında hizmet verirler. Bu ilişkiyi modelleyin ve ilişkinin türünü belirleyin.
 */

public class Department {

    private String name;
    private List<Professor> professors = new ArrayList<>();
//    private Professor[] professors;
    private Professor manager;

    public Department(String name, Professor manager) {
        this.name = name;
        this.manager = manager;
        manager.setMenagedDepartment(this);
        addProfessor(manager);
    }
    public void addProfessor(Professor p){
        professors.add(p);
        p.setDepartment(this);
    }

    public void printInfo(){
        System.out.println("Department name : " + getName());
        System.out.println("Manager name : " + manager.getName());
        System.out.println("Professors : ");
        for(Professor p : professors){
            System.out.println(p.getName());
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getManager() {
        return manager;
    }

    public void setManager(Professor manager) {
        this.manager = manager;
    }
}
