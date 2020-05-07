package Exercise1;

/**
 * Class that works to create an object shipment
 *
 * @Version 1, 6 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Shipment implements Sellable {

    private String additionalConditions;
    private double purchaseCost;

    public Shipment() {
        this.purchaseCost = 0;
        this.additionalConditions = "";
    }

    public Shipment(double purchaseCost) {
        this.purchaseCost = purchaseCost;
        this.additionalConditions = "";
    }

    @Override
    public String getAdditionalConditions() {
        return additionalConditions;
    }

    public void setAdditionalConditions(String additionalConditions) {
        this.additionalConditions = additionalConditions;
    }

    @Override
    public double getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(double purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    @Override
    public String toString() {
        return "   Shipment:\nAdditionalConditions:\n" + additionalConditions + "\nPurchaseCost:\n" + purchaseCost + "\n";
    }

}
