package Behavioral;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way for a component to flexibly broadcast messages to interested
 * receivers.
 */
public class MainExercise1 {

    public static void main(String[] args) {
        AiportChangeObservable observers = new AiportChangeObservable();
        Airport airport1 = new Airport();
        airport1.addFligth(new ArrivalFlight("EEUU", 4, "B85", "Avianca", 10));
        airport1.addFligth(new ArrivalFlight("EEUU", 5, "A33", "Avianca", 22));
        airport1.addFligth(new ExitFlight("Argentina", 2, "C55", "Iberia", 5));
        airport1.addFligth(new ExitFlight("Argentina", 7, "C33", "Iberia", 8));
        airport1.addFligth(new ExitFlight("Argentina", 1, "C22", "Iberia", 33));        
        Observer1_ExitFlights observer1 = new Observer1_ExitFlights();
        Observer2_AllFlights observer2 = new Observer2_AllFlights();
        Observer3_ArrivalFlights observer3 = new Observer3_ArrivalFlights();
        observers.addAiportChangeObserver(observer1);
        observers.addAiportChangeObserver(observer2);
        observers.addAiportChangeObserver(observer3);
        observers.addAllFlights(airport1);
        observers.addArrivalFlights(airport1);
        observers.addExitFlights(airport1);
        observer1.getInformation("Observer 1 (Exit flights)");
        observer2.getInformation("Observer 2 (All flights)");
        observer3.getInformation("Observer 3 (Arrival flights)");
    }

}
