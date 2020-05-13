package Creational;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To have only one instance of this class in the system, while allowing other
 * classes to get access to this instance
 */
public class MainSingleton {

    public static void main(String[] args) {

        ConcreteQueue concreteQueue1 = ConcreteQueue.getInstance();
        System.out.println("\tCreate first concrete queue:");
        System.out.println("Is empty: " + concreteQueue1.isEmpty());
        System.out.println("Enqueue: " + concreteQueue1.enqueue(1));
        System.out.println("Enqueue: " + concreteQueue1.enqueue(2));
        System.out.println("Enqueue: " + concreteQueue1.enqueue(3));
        System.out.println("Enqueue: " + concreteQueue1.enqueue(4));
        System.out.println("Peek: " + concreteQueue1.peek());
        System.out.println("Dequeue: " + concreteQueue1.dequeue());
        System.out.println("Dequeue: " + concreteQueue1.dequeue());
        System.out.println("Peek: " + concreteQueue1.peek());
        System.out.println("Is empty: " + concreteQueue1.isEmpty());

        ConcreteQueue concreteQueue2 = ConcreteQueue.getInstance();
        System.out.println("\n\tCreate second concrete queue:");
        System.out.println("Is empty: " + concreteQueue2.isEmpty());
        System.out.println("Peek: " + concreteQueue2.peek());
    }
}
