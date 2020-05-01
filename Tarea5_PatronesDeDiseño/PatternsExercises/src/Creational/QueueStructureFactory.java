package Creational;

import java.util.Collection;
import java.util.Queue;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a standard method to create an object, apart from a constructor,
 * but the decision of what kind of an object to create is left to subclasses.
 *
 */
public class QueueStructureFactory implements StructuresFactoryInterface {

    @Override
    public Structure createStructure(Collection collection) throws StructureException {
        if (collection instanceof Queue) {
            return new QueueStructure((Queue) collection);
        }
        throw new StructureException("The Structure is not a Queue");
    }
}
