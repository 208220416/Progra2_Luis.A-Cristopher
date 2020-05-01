package Creational;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a standard method to create an object, apart from a constructor,
 * but the decision of what kind of an object to create is left to subclasses.
 *
 */
public class ArrayListStructureFactory implements StructuresFactoryInterface {

    @Override
    public Structure createStructure(Collection collection) throws StructureException {
        if (collection instanceof ArrayList) {
            return new ArrayListStructure((ArrayList) collection);
        }
        throw new StructureException("The Structure is not an ArrayList");
    }
}
