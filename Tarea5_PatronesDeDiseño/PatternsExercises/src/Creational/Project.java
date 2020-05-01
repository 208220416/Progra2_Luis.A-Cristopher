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
public class Project {

    private String name;
    private Employee attendant;
    private int timeInWeeks;
    private ArrayList<Date> advanceDates;

    public Project() {
    }

    /**
     * Method tha add a date to the advanceDates list
     *
     * @param date the date added
     */
    public void addAdvanceDates(Date date) {
        advanceDates.add(date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getAttendant() {
        return attendant;
    }

    public void setAttendant(Employee attendant) {
        this.attendant = attendant;
    }

    public int getTimeInWeeks() {
        return timeInWeeks;
    }

    public void setTimeInWeeks(int timeInWeeks) {
        this.timeInWeeks = timeInWeeks;
    }

    public ArrayList<Date> getAdvanceDates() {
        return advanceDates;
    }

    public void setAdvanceDates(ArrayList<Date> advanceDates) {
        this.advanceDates = advanceDates;
    }

    @Override
    public String toString() {
        return "Name=" + name
                + "\nAttendant=" + attendant
                + "\nTimeInWeeks=" + timeInWeeks
                + "\nAdvanceDates=" + advanceDates + '}';
    }
}
