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
public class Singleton {
    
    private static Queue<Object> instance = new PriorityQueue<>();
                        
    private Singleton() {
    }
    
    /**
     * Method that return the instance
     * 
     * @return the instance
     */
    public static Queue<Object> getInstance(){
        return instance;
    }
    
}
