package Exercise1;

/**
 * Interface that works to update the information of the purchase
 *
 * @Version 1, 6 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public interface Sellable {

    /**
     * Method that get the additional conditions of the shipment
     *
     * @return the additional conditions
     */
    public String getAdditionalConditions();

    /**
     * Method that get the cost of the purchase
     *
     * @return the cost of the purchase
     */
    public double getPurchaseCost();

}
