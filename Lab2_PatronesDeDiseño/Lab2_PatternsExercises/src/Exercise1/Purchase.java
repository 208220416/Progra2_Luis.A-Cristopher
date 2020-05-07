package Exercise1;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TreeMap;
import java.util.Iterator;

/**
 * Class called Purchase, it works to create the purchase
 *
 * @Version 1, 5 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Purchase implements Comparable<Purchase> {

    private int consecutive;
    private GregorianCalendar applicationDate;    
    private TreeMap<String, Product> productList;
    private Status status;
    private Client client;

    public Purchase(Client client) {
        productList = new TreeMap<>();
        this.client = client;
    }

    public int getConsecutive() {
        return consecutive;
    }

    public void setConsecutive(int consecutive) {
        this.consecutive = consecutive;
    }

    public GregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(GregorianCalendar applicationDate) {
        this.applicationDate = applicationDate;
    }    

    public TreeMap<String, Product> getProductList() {
        return productList;
    }

    public void setProductList(TreeMap<String, Product> productList) {
        this.productList = productList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    /**
     * getDateInSimpleDateFormat method, it works to get date in the simple date
     * format
     *
     * @return dateFormatted
     */
    public String getDateInSimpleDateFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy – mm:ss:S");
        String dateFormatted = simpleDateFormat.format(applicationDate.getTime());
        return dateFormatted;
    }

    /**
     * addProduct method, it works to add a product into the purchase
     *
     * @param product, that contains the product
     */
    public void addProduct(Product product) {
        if (productList.containsKey(product.getCode())) {
            Product productTemp = productList.get(product.getCode());
            productTemp.setQuantity(productTemp.getQuantity() + product.getQuantity());
        } else {
            productList.put(product.getCode(), product);
        }
    }

    /**
     * removeProduct method, it works to remove a product from the purchase
     *
     * @param code, that contains the code
     * @return the deleted product.
     */
    public Product removeProduct(String code) {
        Iterator<String> iterator = productList.keySet().iterator();
        String productTemp = null;
        while (iterator.hasNext()) {
            productTemp = iterator.next();
            if (productList.get(productTemp).getCode() == code) {
                productList.remove(productTemp);
                return productList.get(productTemp);
            }
        }
        return null;
    }

    /**
     * calculateTotalWeigth, it works to calcultate the total weigth ot the
     * purchase
     *
     * @return total weigth
     */
    public double calculateTotalWeigth() {
        Iterator<Product> iterator = productList.values().iterator();
        double totalWeigth = 0;
        while (iterator.hasNext()) {
            totalWeigth += iterator.next().getWeight();
        }
        return totalWeigth;
    }

    @Override
    public String toString() {
        String resultado = "";
        Iterator<Product> iteratorValues = productList.values().iterator();
        Product productTemp = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy – mm:ss:S");
        String dateFormatted = simpleDateFormat.format(applicationDate.getTime());
        resultado = "Purchase:\n" + "Consecutive = " + consecutive + "\nDate of the purchase = " + dateFormatted
                + "\n" + status.toString() + "\n" + client.toString() + "\n";
        while (iteratorValues.hasNext()) {
            productTemp = iteratorValues.next();
            resultado += productTemp + " - PesoGeneral: " + productTemp.calculateGeneralWeight() + "\n";
        }
        resultado += "Total weigth = " + calculateTotalWeigth();
        if ("".equals(resultado)) {
            resultado = "null";
        }
        return resultado;
    }

    @Override
    public int compareTo(Purchase p) {
        return status.getDate().compareTo(p.getStatus().getDate());
    }
}
