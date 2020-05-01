package Behavioral;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way for a component to flexibly broadcast messages to interested
 * receivers.
 */
public abstract class Flight {
    
    private String flihgtNumber;
    private String eirline;
    private int portNumber;

    public Flight(String flihgtNumber, String eirline, int portNumber) {
        this.flihgtNumber = flihgtNumber;
        this.eirline = eirline;
        this.portNumber = portNumber;
    }

    public String getFlihgtNumber() {
        return flihgtNumber;
    }

    public void setFlihgtNumber(String flihgtNumber) {
        this.flihgtNumber = flihgtNumber;
    }

    public String getEirline() {
        return eirline;
    }

    public void setEirline(String eirline) {
        this.eirline = eirline;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    @Override
    public String toString() {
        return "Flight{" + "flihgtNumber=" + flihgtNumber + ", eirline=" + eirline + ", portNumber=" + portNumber + '}';
    }        
    
}
