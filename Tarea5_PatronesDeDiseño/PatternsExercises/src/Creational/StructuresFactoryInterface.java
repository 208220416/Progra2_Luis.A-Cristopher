package Creational;

import java.util.Collection;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a standard method to create an object, apart from a constructor,
 * but the decision of what kind of an object to create is left to subclasses.
 *
 */
public interface StructuresFactoryInterface {

    /**
     * Method that create a structure, with structure indicated in the parameter
     *
     * @param collection, contains the structure
     * @return the structure
     * @throws StructureException
     */
    public Structure createStructure(Collection collection) throws StructureException;

}
