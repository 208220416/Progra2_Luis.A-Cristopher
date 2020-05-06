package Exercise1;

/**
 * Class that works to create a gift wrap
 *
 * @Version 1, 6 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class GiftWrap extends ShipmentDecorator {

    private final int PRICE = 5;
    private final String DESCRIPTION = "Gift wrap";

    public GiftWrap(Sellable sellable) {
        super(sellable);
    }

    @Override
    public String getAdditionalConditions() {
        return getSellable().getAdditionalConditions() + "(" + DESCRIPTION + ")";
    }

    @Override
    public double getPurchaseCost() {
        return getSellable().getPurchaseCost() + PRICE;
    }

}
