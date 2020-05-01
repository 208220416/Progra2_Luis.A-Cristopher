package Creational;

import java.util.Iterator;
import java.util.Queue;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a standard method to create an object, apart from a constructor,
 * but the decision of what kind of an object to create is left to subclasses.
 *
 */
public class QueueStructure<T> extends Structure {

    private Queue<T> queue;

    public QueueStructure(Queue<T> queue) {
        super(queue);
        this.queue = queue;
    }

    @Override
    public void add(Object element) {
        queue.add((T) element);
    }

    @Override
    public void remove() {
        queue.remove();
    }

    @Override
    public String printContent() {
        Iterator iterator = queue.iterator();
        String text = "";
        while (iterator.hasNext()) {
            text += iterator.next() + "\n";
        }
        return text;
    }

}
