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
public class Scheduler {

    /**
     * Method that create a project using the abstract builder
     *
     * @param abstractBuilder
     * @param name
     * @param attendant
     * @param timeInWeeks
     * @param advanceDates
     * @return
     * @throws InformationRequiredException
     */
    public Project createProject(AbstractBuilder abstractBuilder, String name,
            Employee attendant, int timeInWeeks, ArrayList<Date> advanceDates) throws InformationRequiredException {
        if (abstractBuilder == null) {
            abstractBuilder = new ProjectBuilder();
        }
        abstractBuilder.buildProject();
        abstractBuilder.buildName(name);
        abstractBuilder.buildAttendant(attendant);
        abstractBuilder.buildTimeInWeeks(timeInWeeks);
        abstractBuilder.buildAdvanceDates(advanceDates);
        return abstractBuilder.getProject();
    }
}
