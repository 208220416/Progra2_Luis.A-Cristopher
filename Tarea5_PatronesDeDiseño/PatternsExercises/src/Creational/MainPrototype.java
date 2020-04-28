package Creational;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To make dinamic creation easier by defining classes whose objects can create
 * duplicates of themselves
 *
 */
public class MainPrototype {

    public static void main(String[] args) {
        CoursesList coursesList1 = new CoursesList();
        System.out.println("\tCreate CoursesList 1: ");
        Course course1 = new Course("Computing", "IE2000", 4, new Professor(2087332, "Luis Alberto Gonzales Porras", "Master"));
        System.out.println("Added Course: " + coursesList1.addCourse(course1));
        Course course2 = new Course("Science", "IA4000", 3, new Professor(2123456, "Carlos Duran Ramirez", "Master"));
        System.out.println("Added Course: " + coursesList1.addCourse(course2));
        Course course3 = new Course("Art", "SD1000", 2, new Professor(254321345, "Ana Quesada Herrera", "Master"));
        System.out.println("Added Course: " + coursesList1.addCourse(course3));
        System.out.println("CoursesList 1 size: " + coursesList1.size());

        CoursesList coursesList2 = new CoursesList();
        System.out.println("\n\tCreate CoursesList 2: ");
        System.out.println("CoursesList 2 size: " + coursesList2.size());
        System.out.println("Copying the courses of list 1 to list 2");
        coursesList2 = (CoursesList) coursesList1.cloneMethod();
        System.out.print("The list of courses 2 contains:\n" + coursesList2.toString());
        System.out.println("CoursesList 2 size: " + coursesList2.size());
    }

}
