package Creational;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To make dinamic creation easier by defining classes whose objects can create
 * duplicates of themselves
 *
 */
public class Student implements CloneInterface {

    private int id;
    private String studentId;
    private String fullName;
    private int scholarship;

    public Student(int id, String studentId, String fullName, int scholarship) {
        this.id = id;
        this.studentId = studentId;
        this.fullName = fullName;
        this.scholarship = scholarship;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", studentId=" + studentId + ", fullName=" + fullName + ", scholarship=" + scholarship + '}';
    }

    @Override
    public Object cloneMethod() {
        return new Student(id, studentId, fullName, scholarship);
    }

}
