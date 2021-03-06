/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swing;

import dao.DaoService;
import dao.DaoSousService;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import metier.Service;
import metier.SousService;

/**
 *
 * @author Mehdi
 */
public class ChoixService extends JInternalFrame {

    /**
     * Creates new form ChoixService
     */
    JDesktopPane d;
    CreationTicket c;
    public ChoixService(JDesktopPane d,CreationTicket c) {
        initComponents();
        this.d=d;
        this.c=c;
    }
    
    
    private String service;
    private String sousService; 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnObjetsAbandonnes = new javax.swing.JButton();
        btnDefautSignalisation = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        btnValider = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        btnObjetsAbandonnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ObjetsAbandonnés.png"))); // NOI18N
        btnObjetsAbandonnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjetsAbandonnesActionPerformed(evt);
            }
        });

        btnDefautSignalisation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/defautSignalisation.png"))); // NOI18N
        btnDefautSignalisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefautSignalisationActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Malpropreté.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mobilierUrbain.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/problemeArbre.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eclairage.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/geneCirculationPietons.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/problémeChantier.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/degradationSol.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTree1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jTree1.setForeground(new java.awt.Color(0, 0, 153));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnObjetsAbandonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDefautSignalisation, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnObjetsAbandonnes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDefautSignalisation)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10)
                            .addComponent(jButton9)
                            .addComponent(jButton4))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Objets abandonnés
    private void btnObjetsAbandonnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjetsAbandonnesActionPerformed
        // TODO add your handling code here:
        service = "Objets abandonnés";
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Objets abandonnés");
        
        DaoService daoService = new DaoService();
        Service s = daoService.selectByName(service);
        
        DaoSousService daoSS = new DaoSousService();
        List<SousService> l = new ArrayList();
        l = daoSS.selectAllSousServices(s.getId());
        
        for(SousService ss : l){
            DefaultMutableTreeNode noeud = new DefaultMutableTreeNode(ss);
            racine.add(noeud);
        }
        
        
        TreeModel model = new DefaultTreeModel(racine);
        this.jTree1.setModel(model);
        
        
    }//GEN-LAST:event_btnObjetsAbandonnesActionPerformed
    
//Default de Signalisation
    private void btnDefautSignalisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefautSignalisationActionPerformed
        // TODO add your handling code here:
        service = "Default de Signalisation";
         DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Default de Signalisation");
        
        DaoService daoService = new DaoService();
        Service s = daoService.selectByName(service);
        
        DaoSousService daoSS = new DaoSousService();
        List<SousService> l = new ArrayList();
        l = daoSS.selectAllSousServices(s.getId());
        
        for(SousService ss : l){
            DefaultMutableTreeNode noeud = new DefaultMutableTreeNode(ss);
            racine.add(noeud);
        }
        
        TreeModel model = new DefaultTreeModel(racine);
        this.jTree1.setModel(model);
    }//GEN-LAST:event_btnDefautSignalisationActionPerformed
    
//Malpropreté
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        service = "Malpropreté";
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Malpropreté");
        
        DaoService daoService = new DaoService();
        Service s = daoService.selectByName(service);
        
        DaoSousService daoSS = new DaoSousService();
        List<SousService> l = new ArrayList();
        l = daoSS.selectAllSousServices(s.getId());
        
        for(SousService ss : l){
            DefaultMutableTreeNode noeud = new DefaultMutableTreeNode(ss);
            racine.add(noeud);
        }
        
        TreeModel model = new DefaultTreeModel(racine);
        this.jTree1.setModel(model);
    }//GEN-LAST:event_jButton3ActionPerformed
    
//Problème sur arbres et végétaux
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        service = "Problème sur arbres et végétaux";
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Problème sur arbres et végétaux");
        
        DaoService daoService = new DaoService();
        Service s = daoService.selectByName(service);
        
        DaoSousService daoSS = new DaoSousService();
        List<SousService> l = new ArrayList();
        l = daoSS.selectAllSousServices(s.getId());
        
        for(SousService ss : l){
            DefaultMutableTreeNode noeud = new DefaultMutableTreeNode(ss);
            racine.add(noeud);
        }
        
        TreeModel model = new DefaultTreeModel(racine);
        this.jTree1.setModel(model);
    }//GEN-LAST:event_jButton5ActionPerformed
    
//"Défaut d'éclairage "
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        service ="Défaut d'éclairage ";
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Défaut d'éclairage ");
        
        DaoService daoService = new DaoService();
        Service s = daoService.selectByName(service);
        
        DaoSousService daoSS = new DaoSousService();
        List<SousService> l = new ArrayList();
        l = daoSS.selectAllSousServices(s.getId());
        
        for(SousService ss : l){
            DefaultMutableTreeNode noeud = new DefaultMutableTreeNode(ss);
            racine.add(noeud);
        }
        
        TreeModel model = new DefaultTreeModel(racine);
        this.jTree1.setModel(model);
    }//GEN-LAST:event_jButton6ActionPerformed
    
//"Gêne à la circulation des piétons "
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        service = "Gêne à la circulation des piétons ";
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Gêne à la circulation des piétons ");
        
        
        DaoService daoService = new DaoService();
        Service s = daoService.selectByName(service);
        
        DaoSousService daoSS = new DaoSousService();
        List<SousService> l = new ArrayList();
        l = daoSS.selectAllSousServices(s.getId());
        
        for(SousService ss : l){
            DefaultMutableTreeNode noeud = new DefaultMutableTreeNode(ss);
            racine.add(noeud);
        }
        
        TreeModel model = new DefaultTreeModel(racine);
        this.jTree1.setModel(model);
    }//GEN-LAST:event_jButton7ActionPerformed
    
//Problème sur un chantier 
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        service ="Problème sur un chantier ";
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Problème sur un chantier ");
        
        DaoService daoService = new DaoService();
        Service s = daoService.selectByName(service);
        
        DaoSousService daoSS = new DaoSousService();
        List<SousService> l = new ArrayList();
        l = daoSS.selectAllSousServices(s.getId());
        
        for(SousService ss : l){
            DefaultMutableTreeNode noeud = new DefaultMutableTreeNode(ss);
            racine.add(noeud);
        }
        
        TreeModel model = new DefaultTreeModel(racine);
        this.jTree1.setModel(model);
    }//GEN-LAST:event_jButton9ActionPerformed
    
//"Dégradation du sol 
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        service = "Dégradation du sol ";
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Dégradation du sol ");
        
        DaoService daoService = new DaoService();
        Service s = daoService.selectByName(service);
        
        DaoSousService daoSS = new DaoSousService();
        List<SousService> l = new ArrayList();
        l = daoSS.selectAllSousServices(s.getId());
        
        for(SousService ss : l){
            DefaultMutableTreeNode noeud = new DefaultMutableTreeNode(ss);
            racine.add(noeud);
        }
        
        TreeModel model = new DefaultTreeModel(racine);
        this.jTree1.setModel(model);
    }//GEN-LAST:event_jButton10ActionPerformed
    
//Mobilier urbain dégradé 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        service ="Mobilier urbain dégradé ";
        DefaultMutableTreeNode racine = new DefaultMutableTreeNode("Mobilier urbain dégradé ");
        
        DaoService daoService = new DaoService();
        Service s = daoService.selectByName(service);
        
        DaoSousService daoSS = new DaoSousService();
        List<SousService> l = new ArrayList();
        l = daoSS.selectAllSousServices(s.getId());
        
        for(SousService ss : l){
            DefaultMutableTreeNode noeud = new DefaultMutableTreeNode(ss);
            racine.add(noeud);
        }
        
        TreeModel model = new DefaultTreeModel(racine);
        this.jTree1.setModel(model);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        // TODO add your handling code here:
        sousService = jTree1.getLastSelectedPathComponent().toString();
        c.setService(service, sousService);
        System.out.println(sousService);
        dispose();
        
    }//GEN-LAST:event_btnValiderActionPerformed
    
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel");
                
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChoixService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoixService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoixService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoixService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ChoixService(d).setVisible(true);
            }
        });
    }
    
    
    //private DefaultMutableTreeNode racine;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDefautSignalisation;
    private javax.swing.JButton btnObjetsAbandonnes;
    private javax.swing.JButton btnValider;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
