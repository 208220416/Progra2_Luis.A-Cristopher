package Exercise1;

/**
 * Class called Product, it works to create a product
 *
 * @Version 1, 5 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Product {

    private String code;
    private int quantity;
    private double weight;

    public Product(String code, int quantity, double weight) {
        this.code = code;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * calculateGeneralWeigth method, it works to calculate the general weight
     * of the product
     *
     * @return quantity * weigth
     */
    public double calculateGeneralWeight() {
        return quantity * weight;
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", quantity=" + quantity + ", weight=" + weight + '}';
    }
}
