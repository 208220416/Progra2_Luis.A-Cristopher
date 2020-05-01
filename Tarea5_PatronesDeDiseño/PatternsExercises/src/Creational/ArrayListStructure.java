/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alex Arguello
 */
public class ArrayListStructure<T> extends Structure {

    private ArrayList arrayList;

    public ArrayListStructure(ArrayList<T> arrayList) {
        super(arrayList);
        this.arrayList = arrayList;
        
    }

    @Override
    public void add(Object element) {
        super.getCollection().add((T) element);
    }

    @Override
    public void remove() {
        if (super.getCollection().isEmpty() == false) {
            arrayList.remove(arrayList.size()-1);
        }
       
        }
    

    @Override
    public String printContent() {
        Iterator iterator = super.getCollection().iterator();
        String text = "";
        while (iterator.hasNext()) {
            text += iterator.next() + "\n";
        }
        return text;
    }

}
