package Exercise1;

/**
 * Class called Main, it works to try the methods of the program purchases
 *
 * @Version 1, 67 de Mayo del 2020.
 * @Autores Cristopher Daniel Monge Rodriguez y Luis Antonio Arguello Cubero.
 */
public class Main {

    public static ProcessingPurchasesList processingPurchasesList = ProcessingPurchasesList.getInstance();
    public static DeliveredPurchasesList deliveredPurchasesList = DeliveredPurchasesList.getInstance();
    public static Observable observable = new Observable();

    public static void main(String[] args) {

        Sellable sellable;
        Shipment shipment;
        Observer client;
        Observer wareHouseStaff;
        ShipmentsBy shipmentsBy = new ShipmentsBy();;
        System.out.println("This program used dolars\n");

        System.out.print("\tPurchase 1");
        client = new Client("34133422", "Paco@gmail.com");
        Purchase purchase1 = new Purchase((Client) client);
        purchase1.addProduct(new Product("Me1", 1, 11));
        purchase1.addProduct(new Product("Pi2", 2, 11));
        purchase1.addProduct(new Product("Sa3", 3, 11));
        purchase1.addProduct(new Product("Pa4", 4, 11));
        processingPurchasesList.addPurchase(purchase1);
        System.out.println(purchase1.toString());
        sellable = new Shipment(10);
        sellable = new ExtraFragileWrap(sellable);
        sellable = new GiftWrap(sellable);
        System.out.println("\tShipment 1 without transportation cost");
        System.out.println("   Shipment 1:\nAdditional Components: " + sellable.getAdditionalConditions()
                + "\nCost: " + sellable.getPurchaseCost());;
        shipmentsBy.setCalculating(new ShipmentsByPlane());
        System.out.println("\tShipment 1 cost of transportation plane of the purchase 1 without additional components\n" + shipmentsBy.calculateShipmentsBy(purchase1));
        shipmentsBy.setCalculating(new ShipmentsByShip());
        System.out.println("\tShipment 1 cost of transportation ship of the purchase 1 without additional components\n" + shipmentsBy.calculateShipmentsBy(purchase1));
        System.out.println("Adding this client to observers...");
        observable.addObserver(client);

        System.out.print("\n\tPurchase 2");
        client = new Client("54456776", "MARCO@gmail.com");
        Purchase purchase2 = new Purchase((Client) client);
        purchase2.addProduct(new Product("Ar1", 1, 22));
        purchase2.addProduct(new Product("Fr2", 2, 22));
        purchase2.addProduct(new Product("Az", 3, 22));
        purchase2.addProduct(new Product("Pa4", 4, 22));
        processingPurchasesList.addPurchase(purchase2);
        System.out.println(purchase2.toString());
        sellable = new Shipment(10);
        sellable = new ExtraFragileWrap(sellable);
        sellable = new GiftWrap(sellable);
        System.out.println("\tShipment 2 without transportation cost");
        System.out.println("   Shipment 2:\nAdditional Components: " + sellable.getAdditionalConditions()
                + "\nCost: " + sellable.getPurchaseCost());;
        shipmentsBy.setCalculating(new ShipmentsByPlane());
        System.out.println("\tShipment 2 cost of transportation plane of the purchase 2 without additional components\n" + shipmentsBy.calculateShipmentsBy(purchase2));
        shipmentsBy.setCalculating(new ShipmentsByShip());
        System.out.println("\tShipment 2 cost of transportation ship of the purchase 2 without additional components\n" + shipmentsBy.calculateShipmentsBy(purchase2));
        System.out.println("Adding this client to observers...");
        observable.addObserver(client);

        System.out.print("\n\tPurchase 3");
        client = new Client("6735345", "SamuelUchiha@gmail.com");
        Purchase purchase3 = new Purchase((Client) client);
        purchase3.addProduct(new Product("Ma1", 1, 33));//mismo producto
        purchase3.addProduct(new Product("Ma1", 1, 33));//mismo producto
        purchase3.addProduct(new Product("Fi2", 2, 33));
        purchase3.addProduct(new Product("Al", 3, 33));
        purchase3.addProduct(new Product("Pa4", 4, 33));
        processingPurchasesList.addPurchase(purchase3);
        System.out.println(purchase3.toString());
        sellable = new Shipment(10);
        sellable = new ExtraFragileWrap(sellable);
        sellable = new GiftWrap(sellable);
        sellable = new DiscountCard(3423424, 30, sellable);
        System.out.println("\tShipment 3 without transportation cost");
        System.out.println("   Shipment 3:\nAdditional Components: " + sellable.getAdditionalConditions()
                + "\nCost: " + sellable.getPurchaseCost());;
        shipmentsBy.setCalculating(new ShipmentsByPlane());
        System.out.println("\tShipment 3 cost of transportation plane of the purchase 3 without additional components\n" + shipmentsBy.calculateShipmentsBy(purchase3));
        shipmentsBy.setCalculating(new ShipmentsByShip());
        System.out.println("\tShipment 3 cost of transportation ship of the purchase 3 without additional components\n" + shipmentsBy.calculateShipmentsBy(purchase3));
        System.out.println("Adding this client to observers...");
        observable.addObserver(client);

        System.out.print("\n\tPurchase 4");
        client = new Client("241341324", "LightYagami@gmail.com");
        Purchase purchase4 = new Purchase((Client) client);
        purchase4.addProduct(new Product("Mo1", 1, 44));
        purchase4.addProduct(new Product("Sa2", 2, 44));
        purchase4.addProduct(new Product("At3", 3, 44));
        purchase4.addProduct(new Product("Pa4", 4, 44));
        processingPurchasesList.addPurchase(purchase4);
        System.out.println(purchase3.toString());
        sellable = new Shipment(10);
        sellable = new ExtraFragileWrap(sellable);
        sellable = new GiftWrap(sellable);
        sellable = new DiscountCard(3423424, 50, sellable);
        System.out.println("\tShipment 4 without transportation cost");
        System.out.println("   Shipment 4:\nAdditional Components: " + sellable.getAdditionalConditions()
                + "\nCost: " + sellable.getPurchaseCost());;
        shipmentsBy.setCalculating(new ShipmentsByPlane());
        System.out.println("\tShipment 4 cost of transportation plane of the purchase 4 without additional components\n" + shipmentsBy.calculateShipmentsBy(purchase4));
        shipmentsBy.setCalculating(new ShipmentsByShip());
        System.out.println("\tShipment 4 cost of transportation ship of the purchase 4 without additional components\n" + shipmentsBy.calculateShipmentsBy(purchase4));
        System.out.println("Adding this client to observers...");
        observable.addObserver(client);

        purchase1.removeProduct("Pa4");
        purchase2.removeProduct("Pa4");
        purchase4.removeProduct("Pa4");
        System.out.print("\n\tThe list of purchase without after deleting the code Pa4 in the purchases with consecutive of 1, 2, 4 ="
                + "\n\n" + processingPurchasesList.toString());

        System.out.println("\n\tThe list of purchases without delivered sorted by code =\n" + processingPurchasesList.purchaseSortedByCode());

        processingPurchasesList.updateStatus(2);
        processingPurchasesList.updateStatus(4);
        processingPurchasesList.updateStatus(4);
        processingPurchasesList.updateStatus(3);
        processingPurchasesList.updateStatus(3);
        processingPurchasesList.updateStatus(3);
        System.out.println("\tIn the purchase with consecutive 2,the status was update one time");
        System.out.println("\tIn the purchase with consecutive 4,the status was update two times");
        System.out.println("\tIn the purchase with consecutive 3,the status was update three time\n");
        System.out.print("\tThe list of purchases without delivered sorted by status =\n\n" + processingPurchasesList.purchaseSortedByStatus());

        System.out.println("\tThe list of purchases delivered =\n\n " + deliveredPurchasesList.toString() + "\n");

        processingPurchasesList.updateStatus(2);
        processingPurchasesList.updateStatus(2);
        processingPurchasesList.updateStatus(2);
        processingPurchasesList.updateStatus(4);
        processingPurchasesList.updateStatus(4);
        processingPurchasesList.updateStatus(3);
        System.out.println("\tThe purchase with the consecutive 2 was delivered");
        System.out.println("\tThe purchase with the consecutive 4 was delivered");
        System.out.println("\tThe purchase with the consecutive 3 was delivered\n");
        System.out.print("\tThe list of purchases delivered =\n\n" + deliveredPurchasesList.toString());

        System.out.print("\tThe list of purchases without delivered =\n\n" + processingPurchasesList.toString());

        System.out.print("\tThe list of purchases delivered sorted by status date =\n\n" + deliveredPurchasesList.purchaseSortedByStatusDate());

        System.out.println("\nAdding a ware house staff to observers...\n");
        wareHouseStaff = new WareHouseStaff();
        observable.addObserver(wareHouseStaff);

        System.out.print("\tPurchase 5\n");
        client = new Client("333422", "Auron@gmail.com");
        Purchase purchase5 = new Purchase((Client) client);
        purchase5.addProduct(new Product("Me1", 1, 11));
        purchase5.addProduct(new Product("Pi2", 2, 11));
        processingPurchasesList.addPurchase(purchase5);
        System.out.println(purchase5.toString());
        System.out.println("Adding this client to observers...");
        observable.addObserver(client);

        System.out.print("\tPurchase 6");
        client = new Client("333422", "Rubiuz@gmail.com");
        Purchase purchase6 = new Purchase((Client) client);
        purchase6.addProduct(new Product("Me1", 1, 11));
        purchase6.addProduct(new Product("Pi2", 2, 11));
        processingPurchasesList.addPurchase(purchase6);
        System.out.println(purchase6.toString());
        System.out.println("Adding this client to observers...");
        observable.addObserver(client);

        System.out.println("\nUpdating status of purchase 6...\n");
        processingPurchasesList.updateStatus(6);
        System.out.println("\nUpdating status of purchase 6...\n");
        processingPurchasesList.updateStatus(6);
        System.out.println("\nUpdating status of purchase 5...\n");
        processingPurchasesList.updateStatus(5);

        System.out.println("  Observer: Ware house staff\nInformation:\n" + wareHouseStaff.showInformation());
        System.out.println("\n  Observer: Client 6:\n" + purchase6.getClient().toString()
                + "\nInformation:\n" + client.showInformation());

        System.out.println("\nUpdating status of purchase 6...\n");
        processingPurchasesList.updateStatus(6);
        System.out.println("\nUpdating status of purchase 6...\n");
        processingPurchasesList.updateStatus(6);

        System.out.println("  Observer: Ware house staff\nInformation:\n" + wareHouseStaff.showInformation());
        System.out.println("\n  Observer: Client 6:\n" + purchase6.getClient().toString()
                + "\nInformation:\n" + client.showInformation());
    }

}
