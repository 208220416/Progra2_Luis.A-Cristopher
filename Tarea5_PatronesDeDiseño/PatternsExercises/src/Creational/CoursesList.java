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
public class CoursesList implements CloneInterface {

    private List<Course> coursesList;

    public CoursesList() {
        this.coursesList = new ArrayList<>();
    }

    public CoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }

    /**
     * Method that add a course
     *
     * @param course that contains the course
     * @return course added
     */
    public Course addCourse(Course course) {
        coursesList.add(course);
        return course;
    }

    /**
     * Method size that return the quantity of elements
     *
     * @return quantity of elements
     */
    public int size() {
        return coursesList.size();
    }

    @Override
    public String toString() {
        String text = "";
        Iterator<Course> iterator = coursesList.iterator();
        while (iterator.hasNext()) {
            text += iterator.next().toString() + "\n";
        }
        return text;
    }

    @Override
    public Object cloneMethod() {
        Iterator<Course> iterator = coursesList.iterator();
        List temList = new ArrayList();
        while (iterator.hasNext()) {
            temList.add(iterator.next().cloneMethod());
        }
        return new CoursesList(temList);
    }

}
