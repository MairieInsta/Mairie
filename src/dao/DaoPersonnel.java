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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Personnel;
import metier.Usager;

/**
 *
 * @author Mehdi
 */
public class DaoPersonnel implements IDao<Personnel>{

    @Override
    public void insert(Personnel objet) {
        try {
            Connection cnx = bdd.seConnecter();
            
            String sql = "Insert into users (id_service,nom,prenom,date_de_naissance,email,password,code_postal,adresse,ville,statut) Values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setInt(1,objet.getIdService());
            stat.setString(2, objet.getNom());
            stat.setString(3, objet.getPrenom());
            stat.setString(4, objet.getDateNais());
            stat.setString(5, objet.getEmail());
            stat.setString(6, objet.getPassword());
            stat.setString(7, objet.getAdresse());
            stat.setString(8, objet.getCodePostale());
            stat.setString(9, objet.getVille());
            stat.setString(10, objet.getStatut());
            
            stat.executeUpdate();
            
            bdd.seDeconnecter(cnx);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Personnel objet) {
        try {
         
            Connection con=bdd.seConnecter();
            String sql = "Delete from users where id_user=? ";
            
            PreparedStatement stat = con.prepareStatement(sql);
            
            stat.setInt(1,objet.getId());
          
           
     
            stat.executeUpdate();
            bdd.seDeconnecter(con);
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void update(Personnel objet) {
          try {
         
            Connection con=bdd.seConnecter();
            String sql = "Update  users  set nom=?,prenom=?,date_de_naissance=?,email=?,adresse=?,code_postal=?,ville=? where id_user="+objet.getId();
            
            PreparedStatement stat = con.prepareStatement(sql);
            
            stat.setString(1,objet.getNom());
            stat.setString(2, objet.getPrenom());
            stat.setString(3, objet.getDateNais());
            stat.setString(4, objet.getEmail());
            stat.setString(5, objet.getAdresse());
            stat.setString(6, objet.getCodePostale());
            stat.setString(7, objet.getVille());
           
         
            
            stat.executeUpdate();
            bdd.seDeconnecter(con);
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        public Personnel selectById(int id) {
                Personnel p = null;
        Connection cnx = null;
        try {
            cnx = bdd.seConnecter();

            String sql = "select * from usager where ID_USAGER= ?";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setInt(1, id);
            ResultSet res = stat.executeQuery();
            
            while (res.next()) {
                p = new Personnel(res.getInt("ID_PERSONNEL"),
                               res.getInt("ID_SERVICE"),
                               res.getString("NOM"),
                               res.getString("PRENOM"),
                               res.getString("DATE_DE_NAISSANCE"),
                               res.getString("EMAIL"),
                               res.getString("PASSWORD"),
                               res.getString("ADRESSE"),
                               res.getString("CODE_POSTAL"),
                               res.getString("VILLE"),
                               res.getString("STATUT"));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            bdd.seDeconnecter(cnx);
        }
        return p;
    }

    @Override
    public List<Personnel> selectAll() {
    
         List<Personnel> l = new ArrayList();
       Connection cnx = null;
        try {
            cnx= bdd.seConnecter();

            String sql = "select * from users";
            Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                Personnel p = new Personnel(res.getInt("id_user"),
                            res.getInt("id_service"),
                            res.getString("nom"), 
                            res.getString("prenom"),
                            res.getString("date_de_naissance"),
                            res.getString("email"),
                            res.getString("password"),
                            res.getString("adresse"),
                            res.getString("code_postal"),
                            res.getString("ville"),
                            res.getString("statut"));
                l.add(p);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonnel.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            bdd.seDeconnecter(cnx);
        }
        
        return l;
    
}
    
}
