/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.BD;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

/**
 *
 * @author 1gbd10
 */
public class PersonaBD {
    
    private ObjectContainer bd;
    
    
    public PersonaBD(){
        bd = Db4o.openFile("BaseDatos");
    }
    public void alta(){
        
    }
}
