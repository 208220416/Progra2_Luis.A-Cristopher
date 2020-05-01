/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;


/**
 *
 * @author Alex Arguello
 */
public class StackStructure<T> extends Structure {
    
     private Stack<T> stack;

    public StackStructure(Collection collection) {
        super(collection);
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
