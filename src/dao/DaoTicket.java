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
import metier.Ticket;

/**
 *
 * @author Mehdi
 */
public class DaoTicket implements IDao<Ticket> {

     @Override
     public void insert(Ticket objet) {
        try {
            Connection cnx = bdd.seConnecter();
            
            String sql = "Insert into ticket (id_sous_service,id_usager,id_personnel,date_creation,etat_demande,description_demande,titre_demande,date_debut_traitement,date_fin_traitement,priorite) Values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setInt(1,objet.getSousService().getId());
            stat.setInt(2, objet.getUsager().getId());
            stat.setInt(3, 0);
            stat.setString(4, objet.getDateCreation());
            stat.setString(5, objet.getEtatDemande());
            stat.setString(6, objet.getDescriptionDemande());
            stat.setString(7, objet.getTitreDemande());
            stat.setString(8, objet.getDateDebutTraitement());
            stat.setString(9, objet.getDateEstimee());
            stat.setString(10, objet.getPriorite());
            
            stat.executeUpdate();
            
            bdd.seDeconnecter(cnx);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoTicket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public void delete(Ticket objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Ticket> selectAll() {
        List<Ticket> l = new ArrayList();
        Connection cnx = null;
        try {
            cnx = bdd.seConnecter();

            String sql = "select * from ticket";
            Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                DaoSousService dao = new DaoSousService();
                DaoUsager daoUsager = new DaoUsager();
                DaoPersonnel daoP = new DaoPersonnel();
                
                Ticket e = new Ticket(res.getInt("id_ticket"),
                                  dao.selectById(res.getInt("id_sous_service")),
                                  daoUsager.selectById(res.getInt("id_usager")),
                                  daoP.selectById(res.getInt("id_personnel")),
                                  res.getString("date_creation"),
                                  res.getString("etat_demande"),
                                  res.getString("description_demande"),
                                  res.getString("titre_demande"),
                                  res.getString("date_debut_traitement"),
                                  res.getString("date_fin_traitement"),
                                  res.getString("priorite"));
                l.add(e);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoTicket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoTicket.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            bdd.seDeconnecter(cnx);
        }
        return l;
    }
    
    
    public Ticket selectByName(String titre) {
        Ticket ticket= null;
        Connection cnx = null;
        try {
            cnx = bdd.seConnecter();

            String sql = "select * from ticket where titre_demande= ?";
            PreparedStatement stat = cnx.prepareStatement(sql);
            stat.setString(1, titre);
            ResultSet res = stat.executeQuery();
            
            while (res.next()) {
                DaoSousService dao = new DaoSousService();
                DaoUsager daoUsager = new DaoUsager();
                DaoPersonnel daoP = new DaoPersonnel();
                
                
                    ticket = new Ticket(res.getInt("id_ticket"),
                                  dao.selectById(res.getInt("id_sous_service")),
                                  daoUsager.selectById(res.getInt("id_usager")),
                                  daoP.selectById(res.getInt("id_personnel")),
                                  res.getString("date_creation"),
                                  res.getString("etat_demande"),
                                  res.getString("description_demande"),
                                  res.getString("titre_demande"),
                                  res.getString("date_debut_traitement"),
                                  res.getString("date_fin_traitement"),
                                  res.getString("priorite"));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoTicket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoTicket.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            bdd.seDeconnecter(cnx);
        }
        return ticket;
    }

    @Override
    public void update(Ticket objet) {

          try {
         
            Connection con=bdd.seConnecter();
            String sql = "Update  ticket  set id_personnel=? where id_ticket="+objet.getId();
            
            PreparedStatement stat = con.prepareStatement(sql);
            
            stat.setInt(1,objet.getPersonnel().getId());
  
            stat.executeUpdate();
            bdd.seDeconnecter(con);
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoTicket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
  
    
  
    

