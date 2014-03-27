/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.List;

/**
 *
 * @author Mehdi
 */
public interface IDao<T> {
    
    public Bdd bdd = new Bdd(); 
    public void insert(T objet);
    public void delete(T objet);
    public List<T> selectAll();
    public void update(T objet);
    
    
}

