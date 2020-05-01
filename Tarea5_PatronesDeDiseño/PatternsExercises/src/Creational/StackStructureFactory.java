/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational;

import java.util.Collection;
import java.util.Stack;

/**
 *
 * @author Alex Arguello
 */
public class StackStructureFactory implements StructuresFactoryInterface{
    
     @Override
    public Structure createStructure(Collection collection) throws StructureException {
        if(collection instanceof Stack){
        return new StackStructure((Stack) collection);
        }
        throw new StructureException("The Structure is not a Stack");
    }
}
