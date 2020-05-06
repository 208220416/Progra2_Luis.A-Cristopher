package Exercise1;

/**
 * Class that works to create an object shipment
 *
 * @Version 1, 6 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Shipment implements Sellable {

    private Purchase purchase;
    private String additionalConditions;
    private double purchaseCost;

    public Shipment(Purchase purchase, double purchaseCost) {
        this.purchase = purchase;
        this.purchaseCost = purchaseCost;
        this.additionalConditions = "";
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
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
        return "Shipment{" + "purchase=" + purchase + ", additionalConditions=" + additionalConditions + ", purchaseCost=" + purchaseCost + '}';
    }

}
