package Creational;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To simplify complex object creation by defining a class whose purpose is to
 * build instances of another class.
 *
 */
public class InformationRequiredException extends Exception {

    public static final int NAME_REQUIRED = 1;
    public static final int ATTENDANT_REQUIERED = 2;
    public static final int TIME_IN_WEEKS_REQUIRED = 4;
    public static final int ADVANCE_DATES_REQUIRED = 8;
    private static final String MESSAGE = "Appointment cannot be created because further information is required";
    private int informationRequired;

    public InformationRequiredException(int itemsRequires) {
        super(MESSAGE);
        informationRequired = itemsRequires;
    }

    public int getInformationRequired() {
        return informationRequired;
    }

}
