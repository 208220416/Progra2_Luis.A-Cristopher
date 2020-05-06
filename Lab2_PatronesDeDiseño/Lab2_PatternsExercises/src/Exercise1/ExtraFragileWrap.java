package Exercise1;

/**
 * Class that works to create a extra fragile wrap
 *
 * @Version 1, 6 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class ExtraFragileWrap extends ShipmentDecorator {

    private final int INCREASE_IN_ADDITIONAL_COST_IN_PERCENTAGE = 1;
    private final String DESCRIPTION = "Extra fragile wrap";

    public ExtraFragileWrap(Sellable sellable) {
        super(sellable);
    }

    @Override
    public String getAdditionalConditions() {
        return getSellable().getAdditionalConditions() + "(" + DESCRIPTION + ")";
    }

    @Override
    public double getPurchaseCost() {
        return getSellable().getPurchaseCost() + INCREASE_IN_ADDITIONAL_COST_IN_PERCENTAGE / 100;
    }

}
