
package Creational;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a standard method to create an object, apart from a constructor,
 * but the decision of what kind of an object to create is left to subclasses.
 *
 */
public class StackStructure<T> extends Structure {

    private Stack<T> stack;

    public StackStructure(Stack<T> stack) {
        super(stack);
        this.stack = stack;
    }

    @Override
    public void add(Object element) {
        stack.add((T) element);
    }

    @Override
    public void remove() {
        stack.pop();
    }

    @Override
    public String printContent() {
        Iterator iterator = stack.iterator();
        String text = "";
        while (iterator.hasNext()) {
            text += iterator.next() + "\n";
        }
        return text;
    }
}
