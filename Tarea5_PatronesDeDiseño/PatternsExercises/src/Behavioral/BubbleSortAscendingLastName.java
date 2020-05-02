package Behavioral;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a group of classes that represent a set of possible behaviors.
 * These behaviors can then be flexibly plugged into an application, changing
 * the functionality on the fly
 */
public class BubbleSortAscendingLastName implements SortInterface {

    @Override
    public void sort(Employee[] list) {
        Employee aux;
        String persona1 = "";
        String persona2 = "";
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                persona1 = list[j].getFirstLastName() + " " + list[j].getSecondLastName()
                        + " " + list[j].getFirstName() + " " + list[j].getSecondName();
                persona2 = list[j + 1].getFirstLastName() + " " + list[j + 1].getSecondLastName()
                        + " " + list[j + 1].getFirstName() + " " + list[j + 1].getSecondName();
                if (persona1.compareTo(persona2) > 0) {
                    aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                }

            }
        }

    }

}
