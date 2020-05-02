package Structural;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way to flexibly add or remove component functionality without
 * changing its external appearance or function.
 */
public class DVD_Burner extends LaptopDecorator {

    private final int PRICE = 10000;
    private final String BASIC_DESCRIPTION = "DVD burner";
    private final String DETAILED_DESCRIPTION = "HP Gh24nsc0 24x Cd Dvd";

    public DVD_Burner(Sellable sellable) {
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
