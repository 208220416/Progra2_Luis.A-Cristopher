package Exercise1;

/**
 * Class that works to create shipments
 *
 * @Version 1, 6 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class ShipmentsBy {

    private ShipmentsInterface calculating = null;

    public ShipmentsInterface getCalculating() {
        return calculating;
    }

    public void setCalculating(ShipmentsInterface calculating) {
        this.calculating = calculating;
    }

    /**
     * Method that calculate the cost of the shipment
     *
     * @param purchase the purchase send in the shipment
     * @return the cost of the shipment if don't exist a shipment, return 0.
     */
    public double calculateShipmentsBy(Purchase purchase) {
        if (calculating != null) {
            return calculating.calculateCost(purchase);
        }
        return 0;
    }
}
