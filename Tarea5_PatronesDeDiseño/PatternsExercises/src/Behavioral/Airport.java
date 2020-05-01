package Behavioral;

import java.util.ArrayList;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way for a component to flexibly broadcast messages to interested
 * receivers.
 */
public class Airport {

    private ArrayList<Flight> flightList;

    public Airport() {
        flightList = new ArrayList<>();
    }

    /**
     * Method that add one flight in the flight list
     *
     * @param flight the flight added
     */
    public void addFligth(Flight flight) {
        flightList.add(flight);
    }

    /**
     * Method that remove the last flight in the flight list
     */
    public void removeFligth() {
        flightList.remove(flightList.size() - 1);
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

}
