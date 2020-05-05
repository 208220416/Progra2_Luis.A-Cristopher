package Exercise1;

/**
 * Interface that works to create observers
 *
 * @Version 1, 5 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public interface Observer {

    /**
     * Method that update the information that contains the observer
     *
     * @param purchase conains the information added
     */
    public void updateInformation(Purchase purchase);

    /**
     * Method that return the information that contains the observer
     *
     * @return the information that contains the observer
     */
    public String showInformation();

}
