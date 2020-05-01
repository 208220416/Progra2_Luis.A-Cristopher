/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational;

import java.util.ArrayList;
import java.util.Collection;


/**
 *
 * @author Alex Arguello
 */
public class ArrayListStructureFactory implements StructuresFactoryInterface{
    
     @Override
    public Structure createStructure(Collection collection) throws StructureException {
        if(collection instanceof ArrayList){
        return new ArrayListStructure((ArrayList) collection);
        }
        throw new StructureException("The Structure is not an ArrayList");
    }
    
}
