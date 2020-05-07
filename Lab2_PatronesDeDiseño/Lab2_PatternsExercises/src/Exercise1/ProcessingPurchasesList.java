package Exercise1;

import java.util.TreeMap;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Class called ProcessingPurchasesList, it works to create a purchases list
 * that had not been delivered
 *
 * @Version 1, 6 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class ProcessingPurchasesList {

    private static ProcessingPurchasesList instance = new ProcessingPurchasesList();
    private TreeMap<Integer, Purchase> purchaseList;
    private static int consecutive;

    private ProcessingPurchasesList() {
        purchaseList = new TreeMap<>();
        consecutive = 0;
    }

    public static ProcessingPurchasesList getInstance() {
        return instance;
    }

    public int getConsecutive() {
        return consecutive;
    }

    /**
     * addPurchase method, it works to add the purchases
     *
     * @param purchase, that is the add purchase
     */
    public void addPurchase(Purchase purchase) {
        consecutive++;
        purchase.setConsecutive(consecutive);
        purchase.setApplicationDate(new GregorianCalendar());
        purchase.setStatus(new Status(StatusEnum.PROCESS_WAITING, new GregorianCalendar()));
        purchaseList.put(consecutive, purchase);
    }

    /**
     * updateStatus method, it works to update the status of purchase indicated
     * with the consecutive
     *
     * @param consecutive, that is the consecutive of the purchase
     */
    public void updateStatus(int consecutive) {
        if (purchaseList.get(consecutive) != null) {
            purchaseList.get(consecutive).setApplicationDate(new GregorianCalendar());
            purchaseList.get(consecutive).getStatus().updateStatus();
            Main.observable.updateInformation(purchaseList.get(consecutive));
            if (purchaseList.get(consecutive).getStatus().getDescription() == StatusEnum.DELIVERED) {
                Main.deliveredPurchasesList.addPurchase(purchaseList.get(consecutive));
                purchaseList.remove(consecutive);
            }
        }
    }

    /**
     * purchaseSortedByCode method, it works to sort the purchases by code
     *
     * @return text, that contains the purchase sort
     */
    public String purchaseSortedByCode() {
        String text = "";
        Iterator<Purchase> iterator = purchaseList.values().iterator();
        while (iterator.hasNext()) {
            text += iterator.next() + "\n\n";
        }
        return text;
    }

    /**
     * purchaseSortedByStatus method, it works to sort the purchases by status
     *
     * @return text, that contains the purchase sort
     */
    public String purchaseSortedByStatus() {
        String text = "";
        List<Purchase> lista = new ArrayList<>(purchaseList.values());
        Collections.sort(lista, new StatusComparator());
        Iterator<Purchase> iterator = lista.iterator();
        while (iterator.hasNext()) {
            text += iterator.next() + "\n\n";
        }
        return text;
    }

    @Override
    public String toString() {
        Iterator<Purchase> iteratorValues = purchaseList.values().iterator();
        String text = "";
        Integer keyTemp = null;
        while (iteratorValues.hasNext()) {
            text += iteratorValues.next() + "\n\n";
        }
        if ("".equals(text)) {
            text = "null";
        }
        return text;
    }

}
