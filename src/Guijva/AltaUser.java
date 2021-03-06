package Guijva;

import javax.swing.*;
import App.*;
import Models.*;
import Utils.*;
import Persistence.*;

/**
 * Jdialo para dar de alta a usuarios solo lo ve admin.
 *
 * @author uriigrao
 */
public class AltaUser extends javax.swing.JDialog {

    /**
     * Creates new form AltaUser
     *
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
        bClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("UserName");

        textPasss.setText("Password");

        buttonAdd.setText("Add User");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUser(evt);
            }
        });

        bClose.setText("Close");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textPasss, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(textPass, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bClose)
                        .addGap(17, 17, 17))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd)
                    .addComponent(bClose))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Funcion del boton registrar Usuarios. Dando los mensajes adecuados
     *
     * @param evt
     */
    private void registrarUser(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUser
        String userName = textUserName.getText();
        String pass = textPass.getText();

        if (!userName.equals("") && !pass.equals("")) {
            boolean result = App.users.containsKey(userName);

            if (result) {
                JOptionPane.showMessageDialog(this, "Este userName ya esta en uso", "Error Nick", JOptionPane.ERROR_MESSAGE);
            } else {
                User user = new User(userName, pass);
                App.users.put(userName, user);
                try {
                    InputOutputFile.saveUser(user);
                } catch (MiExcepcion mex) {
                    JOptionPane.showMessageDialog(this, mex.getMessage(), "Error Alta", JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(this, "Usuario Creado Correctamente");
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error algun Campo esta Vacio", "Error Alta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registrarUser
    /**
     * Funcion del boton cerrar pestaña.
     *
     * @param evt
     */
    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textPass;
    private javax.swing.JLabel textPasss;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables
}
