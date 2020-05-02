package Structural;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To provide a way to flexibly add or remove component functionality without
 * changing its external appearance or function.
 */
public class MainExcercise1 {

    public static void main(String[] args) {
        Sellable laptop1 = new Laptop("HP 403", 200000);
        laptop1 = new DVD_Burner(laptop1);
        laptop1 = new FingerPrintReader(laptop1);
        laptop1 = new SD_Reader(laptop1);
        laptop1 = new WebCam(laptop1);
        System.out.println("Laptop 1:" + laptop1.getDescription() + "\nPrice: " + laptop1.getPrice() + "\n");

        Sellable laptop2 = new Laptop("Acer 203 pro", 300000);
        laptop2 = new DVD_Burner(laptop2);;
        laptop2 = new SD_Reader(laptop2);
        System.out.println("Laptop 2:" + laptop2.getDescription() + "\nPrice: " + laptop2.getPrice());
    }

}
