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
public class Service {
    private int id;
    private String service;

    public Service(String service) {
        this.service = service;
    }

    public Service(int id, String service) {
        this.id = id;
        this.service = service;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return service;
    }
    
    
}
