package Structural;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way to flexibly add or remove component functionality without
 * changing its external appearance or function.
 */
public class SD_Reader extends LaptopDecorator {

    private final int PRICE = 15000;
    private final String BASIC_DESCRIPTION = "SD_Reader";
    private final String DETAILED_DESCRIPTION = "SANDISK ultra 64gb";

    public SD_Reader(Sellable sellable) {
        super(sellable);
    }

    @Override
    public String getDescription() {
        return super.getSellable().getDescription() + "\n" + BASIC_DESCRIPTION
                + " (" + DETAILED_DESCRIPTION + ")";
    }

    @Override
    public int getPrice() {
        return super.getSellable().getPrice() + PRICE;
    }
}
