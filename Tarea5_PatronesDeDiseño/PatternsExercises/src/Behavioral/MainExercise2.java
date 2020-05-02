package Behavioral;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a group of classes that represent a set of possible behaviors.
 * These behaviors can then be flexibly plugged into an application, changing
 * the functionality on the fly
 */
public class MainExercise2 {

    public static void main(String[] args) {
        EmployeesList employeesList = new EmployeesList();
        employeesList.addEmployee(new Employee(2087633, "Raul", "Jose", "Arias", "Zamora", 50000));
        employeesList.addEmployee(new Employee(20876422, "Jose", "Luis", "Quesada", "Rojas", 10000));
        employeesList.addEmployee(new Employee(2087632, "Luis", "Armando", "Soto", "Monge", 20000));
        employeesList.addEmployee(new Employee(208342, "Armando", "Julian", "Rodriguez", "Cubero", 30000));

        System.out.println("\tEmployee List:\n");
        System.out.println("Sort By Ascending Id:\n" + employeesList.sortByAscendingId());
        System.out.println("Sort By Ascending Last Name:\n" + employeesList.sortByAscendingLastName());
        System.out.println("Sort By Descending Salary:\n" + employeesList.sortByDescendingSalary());

    }

}
