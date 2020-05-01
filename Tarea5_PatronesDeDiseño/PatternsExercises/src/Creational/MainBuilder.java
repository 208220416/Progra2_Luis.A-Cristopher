package Creational;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To simplify complex object creation by defining a class whose purpose is to
 * build instances of another class.
 *
 */
public class MainBuilder {

    public static void main(String[] args) {
        System.out.println("\tFirst example for the Builder pattern");
        Project project1;
        ArrayList<Date> arrayList1 = new ArrayList<>();
        arrayList1.add(new Date());
        arrayList1.add(new Date());
        arrayList1.add(new Date());
        System.out.println("Creating a ProjectBuilder for the example.");
        AbstractBuilder abstractBuilder1 = new ProjectBuilder();
        System.out.println("Creating a Scheduler for the example.");
        Scheduler scheduler1 = new Scheduler();
        try {
            System.out.println("Creating a new Project with a ProjectBuilder");
            project1 = scheduler1.createProject(abstractBuilder1, "Project1",
                    new Employee("Juan Carlos Monge Rodriguez", 32425424), 5, arrayList1);
            System.out.println("Successfully created a Project.");
            System.out.println("Project information:");
            System.out.println(project1.toString() + "\n");
        } catch (InformationRequiredException exc) {
            printExceptions(exc);
        }

        System.out.println("\tSecond example for the Builder pattern");
        Project project2;
        ArrayList<Date> arrayList2 = new ArrayList<>();
        System.out.println("Creating a ProjectBuilder for the example.");
        AbstractBuilder abstractBuilder2 = new ProjectBuilder();
        System.out.println("Creating a Scheduler for the example.");
        Scheduler scheduler2 = new Scheduler();
        try {
            System.out.println("Creating a new Project with a ProjectBuilder");
            project2 = scheduler1.createProject(abstractBuilder1, "Project1",
                    new Employee("Ricardo Samuel Monge Rodriguez", 0), 0, arrayList2);
            System.out.println("Successfully created a Project.");
            System.out.println("Project information:");
            System.out.println(project2.toString() + "\n");
        } catch (InformationRequiredException exc) {
            printExceptions(exc);
        }
    }

    public static void printExceptions(InformationRequiredException exc) {
        int statusCode = exc.getInformationRequired();
        System.out.println("Unable to create Project: additional information is required");
        if ((statusCode & InformationRequiredException.ATTENDANT_REQUIERED) > 0) {
            System.out.println(" A attendant with id is required for this project to be complete.");
        }
        if ((statusCode & InformationRequiredException.TIME_IN_WEEKS_REQUIRED) > 0) {
            System.out.println(" A time in weeks higher that 0 is required for this project to be complete.");
        }
        if ((statusCode & InformationRequiredException.ADVANCE_DATES_REQUIRED) > 0) {
            System.out.println(" A advance date is required for this project to be complete.");
        }
    }
}
