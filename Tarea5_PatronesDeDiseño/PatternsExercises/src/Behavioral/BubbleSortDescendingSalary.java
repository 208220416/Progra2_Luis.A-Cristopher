package Behavioral;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a group of classes that represent a set of possible behaviors.
 * These behaviors can then be flexibly plugged into an application, changing
 * the functionality on the fly
 */
public class BubbleSortDescendingSalary implements SortInterface {

    @Override
    public void sort(Employee[] list) {
        Employee aux;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j].getSalary() < list[j + 1].getSalary()) {
                    aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                }
            }
        }
    }
}
