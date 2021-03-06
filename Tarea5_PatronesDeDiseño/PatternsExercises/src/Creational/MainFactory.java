package Creational;

import java.util.ArrayList;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a standard method to create an object, apart from a constructor,
 * but the decision of what kind of an object to create is left to subclasses.
 *
 */
public class MainFactory {

    public static void main(String[] args) {
        StructuresFactoryInterface factory;
        try {
            System.out.println("Creating Structure ArrayList in a Queue...\n");
            factory = new QueueStructureFactory();
            Structure structure1 = factory.createStructure(new ArrayList());
            structure1.add(1);
            structure1.add(2);
            structure1.add(3);
            structure1.remove();
            System.out.println("\tQueue:\n" + structure1.printContent());
        } catch (StructureException ex) {
            System.err.println("ERROR: " + ex);
        }

        try {
            System.out.println("Creating Structure ArrayList in a Stack...\n");
            factory = new StackStructureFactory();
            Structure structure2 = factory.createStructure(new ArrayList());
            structure2.add(1);
            structure2.add(2);
            structure2.add(3);
            structure2.remove();
            System.out.println("\tQueue:\n" + structure2.printContent());
        } catch (StructureException ex) {
            System.err.println("ERROR: " + ex);
        }

        try {
            System.out.println("Creating Structure ArrayList in a ArrayList...\n");
            factory = new ArrayListStructureFactory();
            Structure structure3 = factory.createStructure(new ArrayList());
            structure3.add(1);
            structure3.add(2);
            structure3.add(3);
            structure3.remove();
            System.out.println("\tArrayList:\n" + structure3.printContent());
        } catch (StructureException ex) {
            System.err.println("ERROR: " + ex);
        }
    }

}
