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
public interface AbstractBuilder {

    /**
     * Method that create a new instace of a Project
     */
    public void buildProject();

    /**
     * Method that assign a name to the instance of Project
     *
     * @param name contains the name of the Project
     */
    public void buildName(String name);

    /**
     * Method that assign a attendant to the instance of Project
     *
     * @param attendant contains the attendant of the Project
     */
    public void buildAttendant(Employee attendant);

    /**
     * Method that assign a time in weeks to the instance of Project
     *
     * @param timeInWeeks contains the time in weeks of the project
     */
    public void buildTimeInWeeks(int timeInWeeks);

    /**
     * Method that assign a advance dates to the instance of Project
     *
     * @param advanceDates contains the time in advance dates of the project
     */
    public void buildAdvanceDates(ArrayList<Date> advanceDates);

    /**
     * Method that obtains the project
     */
    public Project getProject() throws InformationRequiredException;

}
