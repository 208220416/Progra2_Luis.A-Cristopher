package Creational;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a standard method to create an object, apart from a constructor,
 * but the decision of what kind of an object to create is left to subclasses.
 *
 */
public class StructureException extends Exception {

    public StructureException(String message) {
        super(message);
    }

    public StructureException() {
    }
}
