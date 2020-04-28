package Creational;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To have only one instance of this class in the system, while allowing other
 * classes to get access to this instance
 */
public class ConcreteQueue<T> implements QueueInterface<T>{

    public ConcreteQueue() {
    }

    @Override
    public T enqueue(T element) {
        Singleton.getInstance().offer(element);
        return element;
    }

    @Override
    public T dequeue() {
        return (T) Singleton.getInstance().remove();        
    }

    @Override
    public T peek() {
        return (T) Singleton.getInstance().peek();
    }

    @Override
    public boolean isEmpty() {        
        return Singleton.getInstance().isEmpty();
    }      
    
}
