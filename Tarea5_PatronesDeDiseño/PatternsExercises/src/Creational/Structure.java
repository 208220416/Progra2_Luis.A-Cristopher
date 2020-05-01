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
public abstract class Structure<T> {

    private Collection<T> collection;

    public Structure(Collection<T> collection) {
        this.collection = collection;
    }

    public Collection<T> getCollection() {
        return collection;
    }

    public void setCollection(Collection<T> collection) {
        this.collection = collection;
    }

    /**
     * Method that add a element in the structure
     *
     * @param element, contains the element added
     */
    public abstract void add(T element);

    /**
     * Method that remove an element
     */
    public abstract void remove();

    /**
     * Method that print the elements contained in the structure
     *
     * @return the elements
     */
    public abstract String printContent();
}
