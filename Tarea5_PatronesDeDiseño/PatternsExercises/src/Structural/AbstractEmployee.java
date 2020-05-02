package Structural;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To develop a flexible way to create hierarchical tree structures of arbitrary
 * complexity, while enabling every element in the structure to operate with a
 * uniform interface
 */
public interface AbstractEmployee {

    /**
     * Method that return an hierarchical tree structures with the department
     *
     * @return the tree of departments
     */
    public String list();

}
