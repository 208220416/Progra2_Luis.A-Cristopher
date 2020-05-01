package Behavioral;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a group of classes that represent a set of possible behaviors.
 * These behaviors can then be flexibly plugged into an application, changing
 * the functionality on the fly
 */
public interface SortInterface {

    /**
     * Method that sort the employees
     *
     * @param list, contain the employees
     */
    public void sort(Employee[] list);

}
