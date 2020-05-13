package Creational;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To have only one instance of this class in the system, while allowing other
 * classes to get access to this instance
 */
public class ConcreteQueue<T> implements QueueInterface<T> {

    private static ConcreteQueue instance = new ConcreteQueue();
    private Queue list;

    private ConcreteQueue() {
        list = new PriorityQueue();
    }

    @Override
    public T enqueue(T element) {
        list.offer(element);
        return element;
    }

    @Override
    public T dequeue() {
        return (T) list.remove();
    }

    @Override
    public T peek() {
        return (T) list.peek();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Method that return the instance
     *
     * @return the instance
     */
    public static ConcreteQueue getInstance() {
        return instance;
    }
}
