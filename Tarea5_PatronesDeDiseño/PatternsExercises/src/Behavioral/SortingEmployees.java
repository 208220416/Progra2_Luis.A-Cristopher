package Behavioral;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a group of classes that represent a set of possible behaviors.
 * These behaviors can then be flexibly plugged into an application, changing
 * the functionality on the fly
 */
public class SortingEmployees {

    private SortInterface sorter = null;

    public SortInterface getSorter() {
        return sorter;
    }

    public void setSorter(SortInterface sorter) {
        this.sorter = sorter;
    }

    /**
     * Method that sort the employees depending of the instance of the
     * sortInterface
     *
     * @param list, contain the employees
     */
    public void sortEmployees(Employee[] list) {
        sorter.sort(list);
    }

}
