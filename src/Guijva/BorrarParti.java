/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guijva;

import App.*;
import Models.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author uriigrao
 */
public class BorrarParti extends javax.swing.JDialog {

    User user;

    /**
     * Creates new form BorrarParti
     *
     * @param parent
     * @param modal
     * @param user
     */
    public BorrarParti(java.awt.Frame parent, boolean modal, User user) {
        super(parent, modal);
        initComponents();
        this.user = user;
        verPartituras();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonDelete = new javax.swing.JButton();
        bClose = new javax.swing.JButton();
        deleteSelect = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonDelete.setText("Borrar");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        bClose.setText("close");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        deleteSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "parti1", "parti2", "etcs..." }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(deleteSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                        .addComponent(buttonDelete)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete))
                .addGap(18, 18, 18)
                .addComponent(bClose)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCloseActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        String codeNamePartitura = (String) deleteSelect.getSelectedItem();
        String[] parti = codeNamePartitura.split(" ");
        String codePartitura = parti[0];
        String titlePartitura = parti[1];

        user.deletePartitura(codePartitura);
        JOptionPane.showMessageDialog(this, "Partitura Borrada Correctamente");
        dispose();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JComboBox<String> deleteSelect;
    // End of variables declaration//GEN-END:variables

    private void verPartituras() {
        ArrayList<String> listaPartis = Functions.getAllpartisName(user);
        deleteSelect.setModel(new DefaultComboBoxModel(listaPartis.toArray()));
    }
}
