package Exercise1;

import java.util.Comparator;

/**
 * Class called StatusComparator, it works to compare the purchase status
 * description
 *
 * @Version 1, 5 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class StatusComparator implements Comparator<Purchase> {

    @Override
    public int compare(Purchase o1, Purchase o2) {
        return o1.getStatus().getDescription().compareTo(o2.getStatus().getDescription());
    }
}
