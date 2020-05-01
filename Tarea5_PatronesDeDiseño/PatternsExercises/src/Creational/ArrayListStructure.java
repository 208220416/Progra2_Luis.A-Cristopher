package Creational;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Cristopher Monge Rodriguez B94986 y Luis Antonio Arguello Cubero
 * B90619
 *
 * To define a standard method to create an object, apart from a constructor,
 * but the decision of what kind of an object to create is left to subclasses.
 *
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
            arrayList.remove(arrayList.size() - 1);
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
