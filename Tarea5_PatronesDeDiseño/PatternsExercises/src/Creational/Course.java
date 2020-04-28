package Creational;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To make dinamic creation easier by defining classes whose objects can create
 * duplicates of themselves
 *
 */
public class Course implements CloneInterface {

    private String name;
    private String initials;
    private int creditNumbers;
    private Professor professor;
    private List<Student> studentList;

    public Course(String name, String initials, int creditNumbers, Professor professor, ArrayList<Student> studentList) {
        this.name = name;
        this.initials = initials;
        this.creditNumbers = creditNumbers;
        this.professor = professor;
        this.studentList = studentList;
    }

    public Course(String name, String initials, int creditNumbers, Professor professor) {
        this.name = name;
        this.initials = initials;
        this.creditNumbers = creditNumbers;
        this.professor = professor;
        studentList = new ArrayList<>();
    }

    /**
     * Method that add a student
     *
     * @param student that contains the student
     * @return student added
     */
    public Student addStudent(Student student) {
        studentList.add(student);
        return student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getCreditNumbers() {
        return creditNumbers;
    }

    public void setCreditNumbers(int creditNumbers) {
        this.creditNumbers = creditNumbers;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", initials=" + initials + ", creditNumbers=" + creditNumbers + ", professor=" + professor + ", studentList=" + studentList + '}';
    }

    @Override
    public Object cloneMethod() {
        Iterator<Student> iterator = studentList.iterator();
        List<Student> tempList = new ArrayList<>();

        while (iterator.hasNext()) {
            tempList.add((Student) iterator.next().cloneMethod());
        }
        return new Course(name, initials, creditNumbers, (Professor) professor.cloneMethod(), (ArrayList<Student>) tempList);
    }

}
