package Exercise1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class called Observable, it works to manage the list of observers
 *
 * @Version 1, 5 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Observable {

    private ArrayList<Observer> observers;

    public Observable() {
        observers = new ArrayList<>();
    }

    /**
     * Method that add an observer to observer list
     *
     * @param observer, contains the observer added
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Method tha remove an observer to observer list
     *
     * @param observer, contains the observer removed
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Method that update the information of the observers
     *
     * @param purchase, contains the purchase updated
     */
    public void updateInformation(Purchase purchase) {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            iterator.next().updateInformation(purchase);
        }
    }
}
