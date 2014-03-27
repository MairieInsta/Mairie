/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Mehdi
 */

/**
 *
 * @author Mehdi
 */
public class Bdd {
    
    private Connection cnx;
    private String username = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/mairie";
    
        public Connection seConnecter() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, username, password);

        } catch (SQLException ex) {
            Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnx;
    }
        
        public void seDeconnecter(Connection connection){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        

}
