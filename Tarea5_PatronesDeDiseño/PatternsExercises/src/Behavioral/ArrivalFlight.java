package Behavioral;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way for a component to flexibly broadcast messages to interested
 * receivers.
 */
public class ArrivalFlight extends Flight {

    private String CountryOfOrigin;
    private int landingTime;

    public ArrivalFlight(String CountryOfOrigin, int landingTime, String flihgtNumber, String eirline, int portNumber) {
        super(flihgtNumber, eirline, portNumber);
        this.CountryOfOrigin = CountryOfOrigin;
        this.landingTime = landingTime;
    }

    public String getCountryOfOrigin() {
        return CountryOfOrigin;
    }

    public void setCountryOfOrigin(String CountryOfOrigin) {
        this.CountryOfOrigin = CountryOfOrigin;
    }

    public int getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(int landingTime) {
        this.landingTime = landingTime;
    }

    @Override
    public String toString() {
        return super.toString() + "ArrivalFlight{" + "CountryOfOrigin=" + CountryOfOrigin + ", landingTime=" + landingTime + '}';
    }

}
