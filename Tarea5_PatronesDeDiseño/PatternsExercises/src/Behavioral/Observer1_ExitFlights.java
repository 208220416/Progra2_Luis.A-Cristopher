package Behavioral;

import javax.swing.JOptionPane;
import java.util.Iterator;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way for a component to flexibly broadcast messages to interested
 * receivers.
 */
public class Observer1_ExitFlights implements AirportChangeObserver {

    private Airport airport;

    public Observer1_ExitFlights() {
        airport = new Airport();
    }

    @Override
    public void arrivalFlightAdded(Flight flight) {
    }

    @Override
    public void exitFlightAdded(Flight flight) {
        airport.addFligth(flight);
    }

    @Override
    public void flightAdded(Flight flight) {
    }

    /**
     * Method that create one JOptionPane that contains all the elements of
     * flight list in this observer
     *
     * @param title the title of the JOptionPane
     */
    public void getInformation(String title) {
        String text = "";
        Iterator iterator = airport.getFlightList().iterator();
        while (iterator.hasNext()) {
            text += iterator.next().toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, text, title, JOptionPane.INFORMATION_MESSAGE);
    }

}
