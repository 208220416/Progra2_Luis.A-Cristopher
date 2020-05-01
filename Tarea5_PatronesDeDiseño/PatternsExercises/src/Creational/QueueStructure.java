package Creational;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 *
 * @author Alex Arguello
 */
public class QueueStructure<T> extends Structure {

    private Queue<T> queue;

    public QueueStructure(Queue<T> queue) {
        super(queue);
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
