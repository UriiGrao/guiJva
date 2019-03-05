/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guijva;

import App.*;
import Models.*;

/**
 *
 * @author uriigrao
 */
public class Menu extends javax.swing.JFrame {

    User user;

    /**
     * Creates new form Menu
     *
     * @param nameUser
     */
    public Menu(String nameUser) {
        initComponents();
        veriryAdmin(nameUser);
        user = App.users.get(nameUser);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAltaParti = new javax.swing.JButton();
        buttonModiParti = new javax.swing.JButton();
        buttonBorrarParti = new javax.swing.JButton();
        buttonVerParti = new javax.swing.JButton();
        buttonAllParti = new javax.swing.JButton();
        buttonDarAltaUser = new javax.swing.JButton();
        buttonBorrarUser = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonAltaParti.setText("Dar de Alta Partitura");
        buttonAltaParti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAltaPartiActionPerformed(evt);
            }
        });

        buttonModiParti.setText("Modificar Partitura");
        buttonModiParti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModiPartiActionPerformed(evt);
            }
        });

        buttonBorrarParti.setText("Borrar Partitura");
        buttonBorrarParti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarPartiActionPerformed(evt);
            }
        });

        buttonVerParti.setText("Ver Partituras");
        buttonVerParti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerPartiActionPerformed(evt);
            }
        });

        buttonAllParti.setText("Totales");
        buttonAllParti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAllPartiActionPerformed(evt);
            }
        });

        buttonDarAltaUser.setText("Dar Alta Usuario");
        buttonDarAltaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDarAltaUserActionPerformed(evt);
            }
        });

        buttonBorrarUser.setText("Borrar Usuario");
        buttonBorrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarUserActionPerformed(evt);
            }
        });

        buttonExit.setText("Log Out");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonAllParti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonVerParti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonBorrarParti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonModiParti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAltaParti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(buttonExit)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonBorrarUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDarAltaUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(buttonAltaParti)
                .addGap(35, 35, 35)
                .addComponent(buttonModiParti)
                .addGap(35, 35, 35)
                .addComponent(buttonBorrarParti)
                .addGap(35, 35, 35)
                .addComponent(buttonVerParti)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAllParti)
                    .addComponent(buttonDarAltaUser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBorrarUser)
                    .addComponent(buttonExit))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAltaPartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAltaPartiActionPerformed
        Alta pestaa = new Alta(null, true, user);
        pestaa.setLocationRelativeTo(null);
        pestaa.setVisible(true);
    }//GEN-LAST:event_buttonAltaPartiActionPerformed

    private void buttonModiPartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModiPartiActionPerformed
        Modificar pestaa = new Modificar(null, true);
        pestaa.setLocationRelativeTo(null);
        pestaa.setVisible(true);
    }//GEN-LAST:event_buttonModiPartiActionPerformed

    private void buttonBorrarPartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarPartiActionPerformed
        BorrarParti pestaa = new BorrarParti(null, true, user);
        pestaa.setLocationRelativeTo(null);
        pestaa.setVisible(true);
    }//GEN-LAST:event_buttonBorrarPartiActionPerformed

    private void buttonDarAltaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDarAltaUserActionPerformed
        AltaUser pestaa = new AltaUser(null, true);
        pestaa.setLocationRelativeTo(null);
        pestaa.setVisible(true);
    }//GEN-LAST:event_buttonDarAltaUserActionPerformed

    private void buttonVerPartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerPartiActionPerformed
        VerOneToOne pestaa = new VerOneToOne(null, true, user);
        pestaa.setLocationRelativeTo(null);
        pestaa.setVisible(true);
    }//GEN-LAST:event_buttonVerPartiActionPerformed

    private void buttonAllPartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAllPartiActionPerformed
        VerAll pestaa = new VerAll(null, true, user);
        pestaa.setLocationRelativeTo(null);
        pestaa.setVisible(true);
    }//GEN-LAST:event_buttonAllPartiActionPerformed

    private void buttonBorrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarUserActionPerformed
        BorrarUser pestaa = new BorrarUser(null, true);
        pestaa.setLocationRelativeTo(null);
        pestaa.setVisible(true);
    }//GEN-LAST:event_buttonBorrarUserActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAllParti;
    private javax.swing.JButton buttonAltaParti;
    private javax.swing.JButton buttonBorrarParti;
    private javax.swing.JButton buttonBorrarUser;
    private javax.swing.JButton buttonDarAltaUser;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonModiParti;
    private javax.swing.JButton buttonVerParti;
    // End of variables declaration//GEN-END:variables

    private void veriryAdmin(String nameUser) {
        if (!nameUser.equals("admin")) {
            buttonDarAltaUser.setVisible(false);
            buttonBorrarUser.setVisible(false);
        }
    }

}
