package Behavioral;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way for a component to flexibly broadcast messages to interested
 * receivers.
 */
public class ExitFlight extends Flight {

    private String destinationCounty;
    private int departureTime;

    public ExitFlight(String destinationCounty, int departureTime, String flihgtNumber, String eirline, int portNumber) {
        super(flihgtNumber, eirline, portNumber);
        this.destinationCounty = destinationCounty;
        this.departureTime = departureTime;
    }

    public String getDestinationCounty() {
        return destinationCounty;
    }

    public void setDestinationCounty(String destinationCounty) {
        this.destinationCounty = destinationCounty;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return super.toString() + "ExitFlight{" + "destinationCounty=" + destinationCounty + ", departureTime=" + departureTime + '}';
    }

}
