package Structural;

import java.util.ArrayList;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To develop a flexible way to create hierarchical tree structures of arbitrary
 * complexity, while enabling every element in the structure to operate with a
 * uniform interface
 */
public class Department implements AbstractEmployee {

    private String name;
    private String inCharge;
    private final ArrayList<AbstractEmployee> employees;
    private Indentation indentation;
    private int quantityOfEmployees;

    public Department(String name, String inCharge, Indentation indentation) {
        this.name = name;
        this.inCharge = inCharge;
        this.employees = new ArrayList<>();
        this.indentation = indentation;
        this.quantityOfEmployees = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInCharge() {
        return inCharge;
    }

    public void setInCharge(String inCharge) {
        this.inCharge = inCharge;
    }

    public Indentation getIndentation() {
        return indentation;
    }

    public void setIndentation(Indentation indentation) {
        this.indentation = indentation;
    }

    @Override
    public String list() {
        String text = indentation.getSbIndent() + "Department name: " + name + ", "
                + "In Charge: " + inCharge + ", Quantity of employees: " + quantityOfEmployees + "\n";
        indentation.increaseIndentation();
        for (AbstractEmployee employee : employees) {
            text += employee.list();
        }
        indentation.decreaseIndentation();
        return text;
    }

    /**
     * Method that add an employee in this department
     *
     * @param employee, contains the employee
     * @return if the employee could be added
     */
    public boolean addAbstractEmployee(AbstractEmployee employee) {
        if (employee instanceof Employee) {
            quantityOfEmployees++;
        }
        return employees.add(employee);
    }

    /**
     * Method that remove an employee in this department
     *
     * @param employee, contains the employee
     * @return if the employee could be removed
     */
    public boolean removeAbstractEmployee(AbstractEmployee employee) {
        if (employee instanceof Employee) {
            quantityOfEmployees--;
        }
        return employees.remove(employee);
    }
}
