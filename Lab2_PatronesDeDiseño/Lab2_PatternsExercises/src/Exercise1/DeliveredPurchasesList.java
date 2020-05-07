package Exercise1;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Class called DeliveredPurchasesList, it works to create a purchases list that
 * had been delivered
 *
 * @Version 1, 6 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class DeliveredPurchasesList {

    private static DeliveredPurchasesList instance = new DeliveredPurchasesList();
    TreeSet<Purchase> deliveredPurchaseList;

    private DeliveredPurchasesList() {
        deliveredPurchaseList = new TreeSet<>();
    }

    public static DeliveredPurchasesList getInstance() {
        return instance;
    }

    /**
     * addPurchase method, it works to add the purchases
     *
     * @param purchase, that is the add purchase
     */
    public void addPurchase(Purchase purchase) {
        deliveredPurchaseList.add(purchase);
    }

    /**
     * purchaseSortedByStatusDate method, it works to sort the purchase by
     * status date
     *
     * @return text, that contains the purchase sort
     */
    public String purchaseSortedByStatusDate() {
        String text = "";
        Iterator<Purchase> iterator = deliveredPurchaseList.iterator();
        while (iterator.hasNext()) {
            text += iterator.next() + "\n\n";
        }
        return text;
    }

    @Override
    public String toString() {
        String text = "";
        Iterator<Purchase> iterator = deliveredPurchaseList.iterator();
        while (iterator.hasNext()) {
            text += iterator.next() + "\n\n";
        }
        if ("".equals(text)) {
            text = "null";
        }
        return text;
    }
}
