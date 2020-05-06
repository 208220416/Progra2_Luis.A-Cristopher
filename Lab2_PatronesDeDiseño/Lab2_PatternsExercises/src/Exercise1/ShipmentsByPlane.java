package Exercise1;

/**
 * Class that works to create shipments by plane
 *
 * @Version 1, 6 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class ShipmentsByPlane implements ShipmentsInterface {

    private static final int COST_PER_KILOGRAM = 30;

    @Override
    public double calculateCost(Purchase purchase) {
        return purchase.calculateTotalWeigth() * COST_PER_KILOGRAM;
    }

}
