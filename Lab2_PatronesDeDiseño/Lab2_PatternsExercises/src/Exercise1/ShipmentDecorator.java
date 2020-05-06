package Exercise1;

/**
 * Class that works to decorate a shipment
 *
 * @Version 1, 6 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public abstract class ShipmentDecorator implements Sellable{

    private final Sellable sellable;

    public ShipmentDecorator(Sellable sellable) {
        this.sellable = sellable;
    }

    public Sellable getSellable() {
        return sellable;
    }
}
