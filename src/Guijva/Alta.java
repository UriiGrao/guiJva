package Guijva;

import Models.*;
import App.*;
import static Persistence.InputOutputFile.saveParti;
import Utils.*;
import javax.swing.*;

/**
 * El JDialog de Alta Partitura.
 *
 * @author uriigrao
 */
public class Alta extends javax.swing.JDialog {

    User user;

    /**
     * Creates new form AltaPartitura
     *
     * @param parent
     * @param modal
     * @param user
     */
    public Alta(java.awt.Frame parent, boolean modal, User user) {
        super(parent, modal);
        initComponents();
        this.user = user;
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
        textCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textArtista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        boxInstru = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        boxNivel = new javax.swing.JComboBox<>();
        radioImpreso = new javax.swing.JRadioButton();
        buttonClose = new javax.swing.JButton();
        buttonDarAlta = new javax.swing.JButton();
        boxGen = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel2.setText("Title");

        jLabel3.setText("Artista");

        jLabel4.setText("Instrumento");

        boxInstru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "piano", "bateria", "guitarra", "flauta", "bajo" }));

        jLabel5.setText("Genero Musical");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setText("ALTA DE PARTITURA");

        jLabel7.setText("nivel de dificultad ");

        boxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Normal", "Dificil" }));

        radioImpreso.setText("Impreso?");

        buttonClose.setText("Close");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeWindow(evt);
            }
        });

        buttonDarAlta.setText("Dar de Alta");
        buttonDarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaPartitura(evt);
            }
        });

        boxGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pop", "rock", "jazz" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxInstru, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxGen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioImpreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDarAlta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonClose)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(boxInstru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(boxGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(boxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(radioImpreso)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonClose)
                            .addComponent(buttonDarAlta))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeWindow(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeWindow
        this.dispose();
    }//GEN-LAST:event_closeWindow
    /**
     * Boton de crear partitura aqui miramos todos los datos si estan llenos y
     * miramos si la partitura se inserta o no. Si no damos un error.
     *
     * @param evt
     */
    private void altaPartitura(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaPartitura
        String code = textCode.getText();
        String title = textTitle.getText();
        String artista = textArtista.getText();
        String instrumento = (String) boxInstru.getSelectedItem();
        String genMusical = (String) boxGen.getSelectedItem();
        String nDificultat = (String) boxNivel.getSelectedItem();
        boolean impreso = radioImpreso.isSelected();

        if (!code.equals("") && !title.equals("") && !artista.equals("") && !instrumento.equals("")
                && !genMusical.equals("") && !nDificultat.equals("")) {
            Partituras partitura = new Partituras(code, title, artista, instrumento, genMusical, nDificultat, impreso);
            try {
                user.putPartitura(code, partitura);
                App.partituras.add(partitura);
                saveParti(user, partitura);
                JOptionPane.showMessageDialog(this, "Partitura Insertada Correctamente!");
                this.dispose();
            } catch (MiExcepcion mx) {
                JOptionPane.showMessageDialog(this, mx.getMessage(), "Error Alta", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error algun Campo esta Vacio", "Error Alta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_altaPartitura


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGen;
    private javax.swing.JComboBox<String> boxInstru;
    private javax.swing.JComboBox<String> boxNivel;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonDarAlta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton radioImpreso;
    private javax.swing.JTextField textArtista;
    private javax.swing.JTextField textCode;
    private javax.swing.JTextField textTitle;
    // End of variables declaration//GEN-END:variables
}
