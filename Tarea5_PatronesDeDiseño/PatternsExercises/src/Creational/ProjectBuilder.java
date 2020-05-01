package Creational;

import java.util.Collections;
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
public class ProjectBuilder implements AbstractBuilder {

    public static final int NAME_REQUIRED = 1;
    public static final int ATTENDANT_REQUIERED = 2;
    public static final int TIME_IN_WEEKS_REQUIRED = 4;
    public static final int ADVANCE_DATES_REQUIRED = 8;
    private int requiredElements;
    private Project project;

    @Override
    public void buildProject() {
        project = new Project();
    }

    @Override
    public void buildName(String name) {
        if (name != null) {
            project.setName(name);
        }
    }

    @Override
    public void buildAttendant(Employee attendant) {
        if (attendant != null && attendant.getId() != 0) {
            project.setAttendant(attendant);
        }
    }

    @Override
    public void buildTimeInWeeks(int timeInWeeks) {
        if (timeInWeeks > 0) {
            project.setTimeInWeeks(timeInWeeks);
        }
    }

    @Override
    public void buildAdvanceDates(ArrayList<Date> advanceDates) {
        if (advanceDates != null) {
            if (advanceDates.size() > 0) {
                Collections.sort(advanceDates);
                project.setAdvanceDates(advanceDates);
            }
        }
    }

    @Override
    public Project getProject() throws InformationRequiredException {
        requiredElements = 0;
        if (project.getAttendant() == null) {
            requiredElements += ATTENDANT_REQUIERED;
        }
        if (project.getAdvanceDates() == null) {
            requiredElements += ADVANCE_DATES_REQUIRED;
        }
        if (project.getTimeInWeeks() == 0) {
            requiredElements += TIME_IN_WEEKS_REQUIRED;
        }
        if (requiredElements > 0) {
            throw new InformationRequiredException(requiredElements);
        }
        return project;
    }

}
