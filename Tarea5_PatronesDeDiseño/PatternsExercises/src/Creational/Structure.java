/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational;

import java.util.Collection;

/**
 *
 * @author Alex Arguello
 */
public abstract class Structure<T> {

    private Collection<T> collection;

    public Structure(Collection<T> collection) {
        this.collection = collection;
    }

    public Collection<T> getCollection() {
        return collection;
    }

    public void setCollection(Collection<T> collection) {
        this.collection = collection;
    }

    public abstract void add(T element);

    public abstract void remove();

    public abstract String printContent();
}
