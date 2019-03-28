/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guijva;

import App.Functions;
import Models.*;
import java.util.*;
import javax.swing.*;
import Persistence.InputOutputFile;
import Utils.MiExcepcion;

/**
 *
 * @author uriigrao
 */
public class Modificar extends javax.swing.JDialog {

    User user;
    boolean isSelected;

    /**
     * Creates new form ModificarPartitura
     *
     * @param parent
     * @param modal
     * @param user
     */
    public Modificar(java.awt.Frame parent, boolean modal, User user) {
        super(parent, modal);
        initComponents();
        this.user = user;
        verPartituras();
        isSelected = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxInstru = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxNivel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        radioImpreso = new javax.swing.JRadioButton();
        bUpdate = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        deleteSelect = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        selectedPartitura = new javax.swing.JButton();
        boxGen = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        boxInstru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "piano", "batería", "guitarra", "flauta", "bajo" }));

        jLabel8.setText("Instrumento");

        jLabel5.setText("Genero Musical");

        boxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Normal", "Dificil" }));

        jLabel7.setText("nivel de dificultad ");

        radioImpreso.setText("Impreso?");

        bUpdate.setText("Modificar");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        buttonClose.setText("Close");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setText("MODIFICAR PARTITURA");

        deleteSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("PARTITURA:");

        selectedPartitura.setText("Select");
        selectedPartitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedPartituraActionPerformed(evt);
            }
        });

        boxGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "rock", "pop", "jazz" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bUpdate)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxInstru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radioImpreso)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(boxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonClose)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(deleteSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectedPartitura)
                .addGap(40, 40, 40))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(selectedPartitura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxInstru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(boxGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(boxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioImpreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUpdate)
                    .addComponent(buttonClose))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        Modificar.this.dispose();
    }//GEN-LAST:event_buttonCloseActionPerformed
    /**
     * Funcion que te deja elegir entre tus partituras y la puedes modificar
     *
     * @param evt
     */
    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        String instrumento = (String) boxInstru.getSelectedItem();
        String genMusical = (String) boxGen.getSelectedItem();
        String nDificultat = (String) boxNivel.getSelectedItem();
        boolean impreso = radioImpreso.isSelected();

        String codeNamePartitura = (String) deleteSelect.getSelectedItem();
        String[] parti = codeNamePartitura.split(",");
        String codePartitura = parti[0];

        Map<String, Partituras> partiturasUser = this.user.getPartituras();
        Partituras partitura = partiturasUser.get(codePartitura);

        partitura.setInstrumento(instrumento);
        partitura.setGenero(genMusical);
        partitura.setDificultad(nDificultat);
        partitura.setImpresa(impreso);

        try {
            InputOutputFile.deletePartitura(user, codePartitura);
            InputOutputFile.saveParti(user, partitura);
            JOptionPane.showMessageDialog(this, "Modificado Correctamente");
            dispose();
        } catch (MiExcepcion mx) {
            JOptionPane.showMessageDialog(this, "Error algun Campo esta Vacio", "Error Modificar", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void selectedPartituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedPartituraActionPerformed
        isSelected = true;
    }//GEN-LAST:event_selectedPartituraActionPerformed
    /**
     * Funcion para ver las partituras en el select.
     */
    private void verPartituras() {
        ArrayList<String> listaPartis = Functions.getAllpartisName(user);
        deleteSelect.setModel(new DefaultComboBoxModel(listaPartis.toArray()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bUpdate;
    private javax.swing.JComboBox<String> boxGen;
    private javax.swing.JComboBox<String> boxInstru;
    private javax.swing.JComboBox<String> boxNivel;
    private javax.swing.JButton buttonClose;
    private javax.swing.JComboBox<String> deleteSelect;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radioImpreso;
    private javax.swing.JButton selectedPartitura;
    // End of variables declaration//GEN-END:variables
}
