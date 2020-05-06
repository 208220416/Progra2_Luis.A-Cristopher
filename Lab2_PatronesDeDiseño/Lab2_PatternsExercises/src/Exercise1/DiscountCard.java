package Exercise1;

/**
 * Class that works to create a discount card
 *
 * @Version 1, 6 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class DiscountCard extends ShipmentDecorator {

    private int cardCode;
    private final String DESCRIPTION = "Discount card";
    private int discountPercentage;

    public DiscountCard(int cardCode, int discountPercentage, Sellable sellable) {
        super(sellable);
        this.cardCode = cardCode;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String getAdditionalConditions() {
        return getSellable().getAdditionalConditions() + "(" + DESCRIPTION + ", Card code: " + cardCode + ")";
    }

    @Override
    public double getPurchaseCost() {
        return getSellable().getPurchaseCost() * discountPercentage / 100;
    }

}
