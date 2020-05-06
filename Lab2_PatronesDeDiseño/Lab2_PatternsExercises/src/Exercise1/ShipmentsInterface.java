package Exercise1;

/**
 * Interface that works to calculate the cost of the shipment
 *
 * @Version 1, 6 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public interface ShipmentsInterface {

    /**
     * Method that calcule the cost of the shipment
     *
     * @param purchase the purchase shipment
     * @return the cost of the shipment
     */
    public double calculateCost(Purchase purchase);

}
