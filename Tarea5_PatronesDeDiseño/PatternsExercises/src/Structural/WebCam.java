package Structural;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way to flexibly add or remove component functionality without
 * changing its external appearance or function.
 */
public class WebCam extends LaptopDecorator {

    private final int PRICE = 20000;
    private final String BASIC_DESCRIPTION = "Web Cam";
    private final String DETAILED_DESCRIPTION = "Auswm 1080p full HD";

    public WebCam(Sellable sellable) {
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
