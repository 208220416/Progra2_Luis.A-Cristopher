package Creational;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To make dinamic creation easier by defining classes whose objects can create
 * duplicates of themselves
 *
 */
public class Professor implements CloneInterface {

    private int id;
    private String fullName;
    private String academicDegree;

    public Professor(int id, String fullName, String academicDegree) {
        this.id = id;
        this.fullName = fullName;
        this.academicDegree = academicDegree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", fullName=" + fullName + ", academicDegree=" + academicDegree + '}';
    }

    @Override
    public Object cloneMethod() {
        return new Professor(id, fullName, academicDegree);
    }

}
