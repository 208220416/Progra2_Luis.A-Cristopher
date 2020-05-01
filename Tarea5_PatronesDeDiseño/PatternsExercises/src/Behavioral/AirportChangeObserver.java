package Behavioral;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way for a component to flexibly broadcast messages to interested
 * receivers.
 */
public interface AirportChangeObserver {

    /**
     * Method that add one arrival flight
     *
     * @param flight the flight added
     */
    public void arrivalFlightAdded(Flight flight);

    /**
     * Method that add one exit flight
     *
     * @param flight the flight added
     */
    public void exitFlightAdded(Flight flight);

    /**
     * Method that add one arrival flight or exit flight
     *
     * @param flight the flight added
     */
    public void flightAdded(Flight flight);

}
