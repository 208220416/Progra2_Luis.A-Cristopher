package Structural;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To develop a flexible way to create hierarchical tree structures of arbitrary
 * complexity, while enabling every element in the structure to operate with a
 * uniform interface
 */
public class MainExcercise2 {

    public static void main(String[] args) throws InterruptedException {
        Indentation indentation = new Indentation();
        
        Department department1 = new Department("Sales", "Jaime Monge", indentation);
        Department department2 = new Department("Economy", "Miguel Garcia", indentation);
        Department department3 = new Department("Production", "Arnold Perez", indentation);
        
        Employee employee1 = new Employee("Luis C", indentation);
        Employee employee2 = new Employee("Julian P", indentation);
        Employee employee3 = new Employee("Pablo Q", indentation);
        Employee employee4 = new Employee("Daniel R", indentation);
        Employee employee5 = new Employee("Ana S", indentation);

        department1.addAbstractEmployee(employee1);
        department1.addAbstractEmployee(employee2);
        department2.addAbstractEmployee(employee3);
        department2.addAbstractEmployee(employee4);
        department3.addAbstractEmployee(employee5);
        
        department2.addAbstractEmployee(department1);
        department1.addAbstractEmployee(department3);
        
        System.err.println("Department of Economy:");
        Thread.sleep(1000);
        System.out.println(department2.list());
        Thread.sleep(1000);
        System.out.println("Removing the employee " + employee2.getName() + " of the department of Sales\n");
        department1.removeAbstractEmployee(employee2);
        Thread.sleep(1000);
        System.err.println("Department of Sales:");
        Thread.sleep(1000);
        System.out.println(department1.list());

    }
}
