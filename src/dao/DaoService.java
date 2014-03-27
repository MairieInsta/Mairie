/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Service;

/**
 *
 * @author Mehdi
 */
public class DaoService implements IDao<Service> {

   
    public void insert(Service objet) {
                try {
            Connection cnx= bdd.seConnecter();
            
            String sql = "Insert into services (NOM_SERVICE)Values (?)";
            
            PreparedStatement stat = cnx.prepareStatement(sql);
            
            stat.setString(1,objet.getService());
            
            stat.executeUpdate();
            bdd.seDeconnecter(cnx);
            
        } catch (SQLException ex) {
            Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void delete(Service objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public List<Service> selectAll() {
        List<Service> l = new ArrayList();
        Connection cnx = null;
        try {
            cnx = bdd.seConnecter();

            String sql = "select * from services";
            Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                Service service = new Service(res.getInt("ID_SERVICE"),
                                  res.getString("NOM_SERVICE"));
                l.add(service);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoService.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            bdd.seDeconnecter(cnx);
        }
        return l;
    }
        
    public Service selectByName(String titre) {
        Service s = null;
        Connection cnx = null;
        try {
            cnx = bdd.seConnecter();

            String sql = "select * from services where NOM_SERVICE= ?";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, titre);
            ResultSet res = stat.executeQuery();
            
            while (res.next()) {
                s = new Service(res.getInt("ID_SERVICE"),
                                  res.getString("NOM_SERVICE"));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoService.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            bdd.seDeconnecter(cnx);
        }
        return s;
    }

    @Override
    public void update(Service objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
}
