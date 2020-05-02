package Structural;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way to flexibly add or remove component functionality without
 * changing its external appearance or function.
 */
public class FingerPrintReader extends LaptopDecorator {

    private final int PRICE = 12000;
    private final String BASIC_DESCRIPTION = "Fingerprint reader";
    private final String DETAILED_DESCRIPTION = "Fingerprint reader biometric scanner with SDK";

    public FingerPrintReader(Sellable sellable) {
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
