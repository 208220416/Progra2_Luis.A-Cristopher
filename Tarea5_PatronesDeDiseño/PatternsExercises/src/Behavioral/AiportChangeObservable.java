package Behavioral;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way for a component to flexibly broadcast messages to interested
 * receivers.
 */
public class AiportChangeObservable {

    ArrayList<AirportChangeObserver> observers = new ArrayList<>();

    /**
     * Method that add a observer to the observers list
     *
     * @param observer the observer added
     */
    public void addAiportChangeObserver(AirportChangeObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    /**
     * Method that remove a observer of the observers list
     *
     * @param observer the observer remove
     */
    public void removeAiportChangeObserver(AirportChangeObserver observer) {
        observers.remove(observer);
    }

    /**
     * Method that add to all the observers the arrival flights of the flights
     * list contains in the airport. This is addded only to observers that need
     * the arrival list.
     *
     * @param airport the airport added
     */
    public void addArrivalFlights(Airport airport) {
        Iterator observersIterador = observers.iterator();
        Iterator flights;
        Flight flightTemp;
        AirportChangeObserver airportChangeObserver;
        while (observersIterador.hasNext()) {
            airportChangeObserver = (AirportChangeObserver) observersIterador.next();
            flights = airport.getFlightList().iterator();
            while (flights.hasNext()) {
                flightTemp = (Flight) flights.next();
                if (flightTemp instanceof ArrivalFlight) {
                    airportChangeObserver.arrivalFlightAdded(flightTemp);
                }
            }
        }
    }

    /**
     * Method that add to all the observers the exit flights of the flights list
     * contains in the airport. This is addded only to observers that need the
     * exit list.
     *
     * @param airport the airport added
     */
    public void addExitFlights(Airport airport) {
        Iterator observersIterador = observers.iterator();
        Iterator flights;
        Flight flightTemp;
        AirportChangeObserver airportChangeObserver;
        while (observersIterador.hasNext()) {
            airportChangeObserver = (AirportChangeObserver) observersIterador.next();
            flights = airport.getFlightList().iterator();
            while (flights.hasNext()) {
                flightTemp = (Flight) flights.next();
                if (flightTemp instanceof ExitFlight) {
                    airportChangeObserver.exitFlightAdded(flightTemp);
                }
            }
        }
    }

    /**
     * Method that add to all the observers all the flights of the flights list
     * contains in the airport. This is addded only to observers that need the
     * all the flight list.
     *
     * @param airport the airport added
     */
    public void addAllFlights(Airport airport) {
        Iterator observersIterador = observers.iterator();
        Iterator flights;
        Flight flightTemp;
        AirportChangeObserver airportChangeObserver;
        while (observersIterador.hasNext()) {
            airportChangeObserver = (AirportChangeObserver) observersIterador.next();
            flights = airport.getFlightList().iterator();
            while (flights.hasNext()) {
                flightTemp = (Flight) flights.next();
                airportChangeObserver.flightAdded(flightTemp);
            }
        }
    }
}
