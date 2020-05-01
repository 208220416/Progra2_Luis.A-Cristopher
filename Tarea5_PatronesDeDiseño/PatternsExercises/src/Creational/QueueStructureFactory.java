
package Creational;

import java.util.Collection;
import java.util.Queue;

/**
 *
 * @author Alex Arguello
 */
public class QueueStructureFactory implements StructuresFactoryInterface{

    @Override
    public Structure createStructure(Collection collection) throws StructureException {
        if(collection instanceof Queue){
        return new QueueStructure((Queue) collection);
        }
        throw new StructureException("The Structure is not a Queue");
    }
    
    
}
