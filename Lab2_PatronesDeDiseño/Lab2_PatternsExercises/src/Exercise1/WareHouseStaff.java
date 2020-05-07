package Exercise1;

import java.util.TreeMap;
import java.util.Iterator;

/**
 * This class is a observer
 *
 * @Version 1, 5 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class WareHouseStaff implements Observer {

    TreeMap<Integer, StatusEnum> packageList;

    public WareHouseStaff() {
        packageList = new TreeMap<>();
    }

    @Override
    public void updateInformation(Purchase purchase) {
        System.err.println("Ware house staffs. Our information had been updated");
        if (purchase.getStatus().getDescription() != StatusEnum.DELIVERED) {
            if (packageList.containsKey(purchase.getConsecutive()) == true) {
                packageList.replace(purchase.getConsecutive(), purchase.getStatus().getDescription());
            } else {
                packageList.put(purchase.getConsecutive(), purchase.getStatus().getDescription());
            }
        } else {
            packageList.remove(purchase.getConsecutive());
        }
    }

    @Override
    public String showInformation() {
        Iterator<Integer> iteratorKeys = packageList.keySet().iterator();
        Iterator<StatusEnum> iteratorValues = packageList.values().iterator();
        String text = "";
        while (iteratorKeys.hasNext()) {
            text += "Consecutive: " + iteratorKeys.next() + ", Status: " + iteratorValues.next() + "\n";
        }
        return text;
    }

}
