package Structural;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way to flexibly add or remove component functionality without
 * changing its external appearance or function.
 */
public abstract class LaptopDecorator implements Sellable {

    private final Sellable sellable;

    public LaptopDecorator(Sellable sellable) {
        this.sellable = sellable;
    }

    public Sellable getSellable() {
        return sellable;
    }

}
