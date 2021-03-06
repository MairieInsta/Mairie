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
import metier.Service;
import metier.SousService;

/**
 *
 * @author Mehdi
 */
public class DaoSousService implements IDao<SousService> {

        public void insert(SousService objet) {
                try {
            Connection cnx= bdd.seConnecter();
            
            String sql = "Insert into sous_service (ID_SERVICE,TITRE)Values (?,?)";
            
            PreparedStatement stat = cnx.prepareStatement(sql);
            
            stat.setInt(1,objet.getIdService());
            stat.setString(2,objet.getNom());
            
            stat.executeUpdate();
            bdd.seDeconnecter(cnx);
            
        } catch (SQLException ex) {
            Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoSousService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   public SousService selectById(int id) {
          SousService s=null;
        try {
        
            Connection con=bdd.seConnecter();
            String requete="select * from sous_service where id_sous_service="+id;
            Statement stat=con.createStatement();
            ResultSet res=stat.executeQuery(requete);
            while(res.next()){
            s=new SousService(res.getInt("ID_SOUS_SERVICE"),res.getInt("ID_SERVICE"),res.getString("TITRE"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoService.class.getName()).log(Level.SEVERE, null, ex);
        }
         return s;
    } 
    

        public SousService selectByName(String name) {
          SousService s=null;
            Connection con = null;
        try {
        
            con=bdd.seConnecter();
            String sql="select * from sous_service where TITRE=?";
            
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setString(1,name);
            ResultSet res=stat.executeQuery();
            while(res.next()){
            s=new SousService(res.getInt("ID_SOUS_SERVICE"),
                              res.getInt("ID_SERVICE"),
                                res.getString("TITRE"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoSousService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoSousService.class.getName()).log(Level.SEVERE, null, ex);
        }
         return s;
    } 
    
             public List<SousService> selectAllSousServices(int idService) {
        List<SousService> l = new ArrayList();
        Connection cnx = null;
        try {
            cnx = bdd.seConnecter();

            String sql = "select * from sous_service where ID_SERVICE="+idService;
            Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                SousService sousService = new SousService(res.getInt("ID_SOUS_SERVICE"),
                                                        res.getInt("ID_SERVICE"),
                                                res.getString("TITRE"));
                l.add(sousService);
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
    
    
    @Override
    public void delete(SousService objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SousService> selectAll() {
        List<SousService> l = new ArrayList();
        Connection cnx = null;
        try {
            cnx = bdd.seConnecter();

            String sql = "select * from sous_service";
            Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                SousService service = new SousService(res.getInt("ID_SOUS_SERVICE"),
                                    res.getInt("ID_SERVICE"),
                                  res.getString("TITRE"));
                l.add(service);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoSousService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoSousService.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            bdd.seDeconnecter(cnx);
        }
        return l;
    }

    @Override
    public void update(SousService objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }





    
}
