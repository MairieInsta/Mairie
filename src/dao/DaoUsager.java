/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import static dao.IDao.bdd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Personnel;
import metier.Service;
import metier.Usager;

/**
 *
 * @author s.trari
 */
public class DaoUsager implements IDao<Usager>{

    @Override
    public void insert(Usager objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public void insertFromList(List l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Usager objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usager> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Usager objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public ResultSet selectRetunRes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

           public Usager selectByEmail(String email) {
        Usager s = null;
        Connection cnx = null;
        try {
            cnx = bdd.seConnecter();

            String sql = "select * from usager where MAIL_USAGER= ?";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, email);
            ResultSet res = stat.executeQuery();
            
            while (res.next()) {
                s = new Usager(res.getInt("ID_USAGER"),
                               res.getString("NOM_USAGER"),
                               res.getString("PRENOM_USAGER"),
                               res.getString("DATE_DE_NAISSANCE"),
                               res.getString("LIEU_DE_NAISSANCE"),
                               res.getString("ADRESSE"),
                               res.getInt("CODE_POSTAL"),
                               res.getString("VILLE"),
                               res.getString("MAIL_USAGER"),
                               res.getString("NATIONALITE"));
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
       
      public Usager selectById(int id) {
        Usager s = null;
        Connection cnx = null;
        try {
            cnx = bdd.seConnecter();

            String sql = "select * from usager where ID_USAGER= ?";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setInt(1, id);
            ResultSet res = stat.executeQuery();
            
            while (res.next()) {
                s = new Usager(res.getInt("ID_USAGER"),
                               res.getString("NOM_USAGER"),
                               res.getString("PRENOM_USAGER"),
                               res.getString("DATE_DE_NAISSANCE"),
                               res.getString("LIEU_DE_NAISSANCE"),
                               res.getString("ADRESSE"),
                               res.getInt("CODE_POSTAL"),
                               res.getString("VILLE"),
                               res.getString("MAIL_USAGER"),
                               res.getString("NATIONALITE"));
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
    
}
