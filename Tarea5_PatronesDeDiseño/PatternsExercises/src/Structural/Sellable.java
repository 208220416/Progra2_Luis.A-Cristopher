package Structural;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way to flexibly add or remove component functionality without
 * changing its external appearance or function.
 */
public interface Sellable {

    /**
     * Method that obtain the description
     *
     * @return the descrption
     */
    public String getDescription();

    /**
     * Method that obtain the price
     *
     * @return the price
     */
    public int getPrice();

}
