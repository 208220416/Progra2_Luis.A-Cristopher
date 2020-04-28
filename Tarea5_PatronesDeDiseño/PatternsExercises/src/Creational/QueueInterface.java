package Creational;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To have only one instance of this class in the system, while allowing other
 * classes to get access to this instance
 */
public interface QueueInterface<T> {

    /**
     * Method that add elements in the back of the queue
     *
     * @param element contains the element
     * @return the element added
     */
    public T enqueue(T element);

    /**
     * Method that remove elements in the front of the queue
     *
     * @return the element removed
     */
    public T dequeue();

    /**
     * Method that return the front of the queue
     *
     * @return the head of the queue
     */
    public T peek();

    /**
     * Method that return if the queue is empty
     *
     * @return true or false
     */
    public boolean isEmpty();

}
