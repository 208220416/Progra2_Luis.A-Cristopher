package Creational;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To simplify complex object creation by defining a class whose purpose is to
 * build instances of another class.
 *
 */
public class Employee {

    private String fullName;
    private int id;

    public Employee() {
    }

    public Employee(String fullName, int id) {
        this.fullName = fullName;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "fullName=" + fullName + ", id=" + id + '}';
    }
}
