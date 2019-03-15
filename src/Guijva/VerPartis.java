/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guijva;

import Models.*;
import static App.App.partituras;
import java.util.*;

/**
 *
 * @author uriigrao
 */
public class VerPartis extends javax.swing.JDialog {

    ArrayList<Partituras> partis;
    int cont;
    User user;

    /**
     * Creates new form Ver
     *
     * @param parent
     * @param modal
     * @param user
     */
    public VerPartis(java.awt.Frame parent, boolean modal, User user) {
        super(parent, modal);
        initComponents();
        this.user = user;
        this.partis = new ArrayList<>();
        this.bBack.setVisible(false);
        this.cont = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        bClose2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bClose = new javax.swing.JButton();
        lCode = new javax.swing.JLabel();
        bFiltrado = new javax.swing.JButton();
        fIntrumentos = new javax.swing.JComboBox<>();
        fDificultat = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        lTitle = new javax.swing.JLabel();
        textArtista = new javax.swing.JLabel();
        lTitle1 = new javax.swing.JLabel();
        lTitle2 = new javax.swing.JLabel();
        textCode = new javax.swing.JLabel();
        textinstrumento = new javax.swing.JLabel();
        textTitle = new javax.swing.JLabel();
        lTitle3 = new javax.swing.JLabel();
        textGenero = new javax.swing.JLabel();
        lTitle4 = new javax.swing.JLabel();
        textDificultad = new javax.swing.JLabel();
        lTitle5 = new javax.swing.JLabel();
        textImpreso = new javax.swing.JLabel();
        bNext = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        lTitle6 = new javax.swing.JLabel();
        lTitle7 = new javax.swing.JLabel();

        bClose2.setText("Next");
        bClose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClose2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("TODAS LAS PARTITURAS");

        bClose.setText("Close");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        lCode.setText("Code:");

        bFiltrado.setText("Filtrar");
        bFiltrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiltradoActionPerformed(evt);
            }
        });

        fIntrumentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "piano", "guitarra", "bajo", "bateria", "flauta" }));

        fDificultat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Facil", "Medio", "Dificil" }));

        lTitle.setText("Title:");

        lTitle1.setText("Instrumento:");

        lTitle2.setText("Artista:");

        lTitle3.setText("Genero:");

        lTitle4.setText("Nivel D:");

        lTitle5.setText("Impreso:");

        bNext.setText("Next");
        bNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNextActionPerformed(evt);
            }
        });

        bBack.setText("Back");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        lTitle6.setText("Instrumento:");

        lTitle7.setText("Nivel D:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(bBack)
                .addGap(191, 191, 191)
                .addComponent(bClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bNext)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTitle5)
                            .addComponent(lTitle7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(textImpreso, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(textDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lTitle2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textArtista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lTitle3)
                            .addGap(41, 41, 41)
                            .addComponent(textGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lTitle1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textinstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lCode)
                                .addComponent(lTitle))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 182, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lTitle6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fIntrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(lTitle4)
                .addGap(18, 18, 18)
                .addComponent(fDificultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bFiltrado)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fIntrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fDificultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFiltrado)
                    .addComponent(lTitle6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTitle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textinstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTitle7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textImpreso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bClose)
                    .addComponent(bNext)
                    .addComponent(bBack))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCloseActionPerformed

    private void bFiltradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiltradoActionPerformed
        this.cont = 0;
        String instrumentoFilter = (String) fIntrumentos.getSelectedItem();
        String nivelFilter = (String) fDificultat.getSelectedItem();
        System.out.println(nivelFilter);
        System.out.println(instrumentoFilter);
        if (instrumentoFilter.equals("None") && nivelFilter.equals("None")) {
            this.partis = partituras;
        } else if (instrumentoFilter.equals("None") && !nivelFilter.equals("None")) {
            caseOfLevel(nivelFilter);
        } else if (nivelFilter.equals("None") && !instrumentoFilter.equals("None")) {
            caseOfInstrument(instrumentoFilter);
        } else {
            caseAll(instrumentoFilter, nivelFilter);
        }
        verPartituras();
    }//GEN-LAST:event_bFiltradoActionPerformed

    private void bNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNextActionPerformed
        if (this.cont == this.partis.size()) {
            this.bNext.setVisible(false);
        } else {
            this.bBack.setVisible(true);
            this.cont++;
            verPartituras();
        }
    }//GEN-LAST:event_bNextActionPerformed

    private void bClose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClose2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bClose2ActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        if (cont == 0) {
            this.bBack.setVisible(false);
        } else {
            this.cont--;
            this.bNext.setVisible(true);
            verPartituras();
        }
    }//GEN-LAST:event_bBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bClose;
    private javax.swing.JButton bClose2;
    private javax.swing.JButton bFiltrado;
    private javax.swing.JButton bNext;
    private javax.swing.JComboBox<String> fDificultat;
    private javax.swing.JComboBox<String> fIntrumentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lCode;
    private javax.swing.JLabel lTitle;
    private javax.swing.JLabel lTitle1;
    private javax.swing.JLabel lTitle2;
    private javax.swing.JLabel lTitle3;
    private javax.swing.JLabel lTitle4;
    private javax.swing.JLabel lTitle5;
    private javax.swing.JLabel lTitle6;
    private javax.swing.JLabel lTitle7;
    private javax.swing.JLabel textArtista;
    private javax.swing.JLabel textCode;
    private javax.swing.JLabel textDificultad;
    private javax.swing.JLabel textGenero;
    private javax.swing.JLabel textImpreso;
    private javax.swing.JLabel textTitle;
    private javax.swing.JLabel textinstrumento;
    // End of variables declaration//GEN-END:variables

    private void verPartituras() {
        textCode.setText(partis.get(this.cont).getCodigo());
        textTitle.setText(partis.get(this.cont).getTitle());
        textArtista.setText(partis.get(this.cont).getArtista());
        textinstrumento.setText(partis.get(this.cont).getInstrumento());
        textGenero.setText(partis.get(this.cont).getGenero());
        textDificultad.setText(partis.get(this.cont).getDificultad());
        if (partis.get(this.cont).isImpresa()) {
            textImpreso.setText("True");
        } else {
            textImpreso.setText("False");
        }
    }

    private void caseOfLevel(String level) {
        for (Partituras partitura : partituras) {
            if (partitura.getDificultad().equals(level)) {
                this.partis.add(partitura);
            }
        }
    }

    private void caseOfInstrument(String instrument) {
        for (Partituras partitura : partituras) {
            if (partitura.getInstrumento().equals(instrument)) {
                this.partis.add(partitura);
            }
        }
    }

    private void caseAll(String instrument, String level) {
        for (Partituras partitura : partituras) {
            if (partitura.getInstrumento().equals(instrument) && partitura.getDificultad().equals(level)) {
                this.partis.add(partitura);
            }
        }
    }
}