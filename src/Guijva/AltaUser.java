/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guijva;

import javax.swing.*;
import App.*;
import Models.*;
import Utils.*;
import Persistence.*;

/**
 *
 * @author uriigrao
 */
public class AltaUser extends javax.swing.JDialog {

    /**
     * Creates new form AltaUser
     * @param parent
     * @param modal
     */
    public AltaUser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textUserName = new javax.swing.JTextField();
        textPass = new javax.swing.JTextField();
        textPasss = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("UserName");

        textPasss.setText("Password");

        buttonAdd.setText("Add User");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUser(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textPasss, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(buttonAdd)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPasss)
                    .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonAdd)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarUser(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUser
        String userName = textUserName.getText();
        String pass = textPass.getText();

        if (!userName.equals("") && !pass.equals("")) {
            boolean result = App.users.containsKey(userName);

            if (result) {
                JOptionPane.showMessageDialog(this, "Este userName ya esta en uso", "Error Nick", JOptionPane.ERROR_MESSAGE);
            } else {
                User user = new User(userName, pass);
                dispose();
                App.users.put(userName, user);
                try {
                    InputOutputFile.saveUser(user);
                } catch (MiExcepcion mex) {
                    JOptionPane.showMessageDialog(this, mex.getMessage(), "Error Alta", JOptionPane.ERROR_MESSAGE);

                }
                JOptionPane.showMessageDialog(this, "Usuario Creado Correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error algun Campo esta Vacio", "Error Alta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registrarUser

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textPass;
    private javax.swing.JLabel textPasss;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables
}
