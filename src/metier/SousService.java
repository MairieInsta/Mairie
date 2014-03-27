/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

/**
 *
 * @author Mehdi
 */
public class SousService {
    private int id;
    private int idService;
    private String nom;

    public SousService(int idService, String nom) {
        this.idService = idService;
        this.nom = nom;
    }

    public SousService(int id, int idService, String nom) {
        this.id = id;
        this.idService = idService;
        this.nom = nom;
    }
    
    

    public SousService(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    
    
    public String toString() {
        return nom;
    }
    
    
}
