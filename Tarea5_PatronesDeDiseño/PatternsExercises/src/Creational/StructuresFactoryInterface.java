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
public interface StructuresFactoryInterface {

    public Structure createStructure(Collection collection) throws StructureException;

}
