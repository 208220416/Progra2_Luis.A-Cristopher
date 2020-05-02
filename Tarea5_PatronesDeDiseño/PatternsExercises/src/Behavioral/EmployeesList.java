package Behavioral;

import java.util.TreeMap;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a group of classes that represent a set of possible behaviors.
 * These behaviors can then be flexibly plugged into an application, changing
 * the functionality on the fly
 */
public class EmployeesList {

    private TreeMap<Integer, Employee> employeeList;
    private SortingEmployees sortingEmployees;

    public EmployeesList() {
        this.employeeList = new TreeMap<>();
        this.sortingEmployees = new SortingEmployees();
    }

    /**
     * Method that add an employee in the list
     *
     * @param employee,contains the employee added
     */
    public void addEmployee(Employee employee) {
        employeeList.put(employee.getId(), employee);

    }

    /**
     * Method that sort the employees by ascending id
     *
     * @return the employees sorted
     */
    public String sortByAscendingId() {
        String text = "";
        Employee[] arrayTemp = employeeList.values().toArray(new Employee[employeeList.size()]);
        sortingEmployees.setSorter(new BubbleSortAscendingId());
        sortingEmployees.sortEmployees(arrayTemp);
        for (int i = 0; i < arrayTemp.length; i++) {
            text += arrayTemp[i] + "\n";
        }
        return text;
    }

    /**
     * Method that sort the employees by ascending Last Name
     *
     * @return the employees sorted
     */
    public String sortByAscendingLastName() {
        String text = "";
        Employee[] arrayTemp = employeeList.values().toArray(new Employee[employeeList.size()]);
        sortingEmployees.setSorter(new BubbleSortAscendingLastName());
        sortingEmployees.sortEmployees(arrayTemp);
        for (int i = 0; i < arrayTemp.length; i++) {
            text += arrayTemp[i] + "\n";
        }
        return text;
    }

    /**
     * Method that sort the employees by descending salary
     *
     * @return the employees sorted
     */
    public String sortByDescendingSalary() {
        String text = "";
        Employee[] arrayTemp = employeeList.values().toArray(new Employee[employeeList.size()]);
        sortingEmployees.setSorter(new BubbleSortDescendingSalary());
        sortingEmployees.sortEmployees(arrayTemp);
        for (int i = 0; i < arrayTemp.length; i++) {
            text += arrayTemp[i] + "\n";
        }
        return text;
    }

}
