/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.DBClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import BackEnd.System;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Asus
 */
public class AddEntity extends javax.swing.JFrame {
    private System system;
    PreparedStatement pst = null;
        public AddEntity(System system) {
            initComponents();
            this.system = system;
        }
            public void add_entity(){
                if("Credor".equals(Type.getSelectedItem())){
                    String query = "INSERT INTO `intervenients_entities`(`name_int`, `adress_int`, `total_debInt`, `nif_int`, `nib_pay`, `contact_int`, `num_law`) VALUES ('"+Name.getText()+"','"+adress1.getText()+"','"+adress2.getText()+"','"+adress3.getText()+"','"+adress4.getText()+"','"+adress5.getText()+"','"+Integer.valueOf(nif.getText())+"','"+Integer.valueOf(iban.getText())+"','"+Integer.valueOf(Contact.getText())+"','"+system.getlawsuit().getNum_law()+"')";    
                        try {           
                        Connection c = DBClass.getConnection();
                        pst = c.prepareStatement(query);    
                        pst.execute();
                        }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                }
            else{
                String query = "INSERT INTO `creditor`(`nif_cre`, `name_cre`, `address_cre`, `contact_cre`, `num_law`, `nib_pay`, `total_deb`) VALUES ('"+Name.getText()+"','"+Adress.getText()+"',,'"+Integer.valueOf(Nif.getText())+"','"+Integer.valueOf(IBAN.getText())+"','"+Integer.valueOf(Contact.getText())+"','"+system.getlawsuit().getNum_law()+"')";    
                    try{           
                        Connection c = DBClass.getConnection();
                        pst = c.prepareStatement(query);    
                        pst.execute();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
            }
}
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        JPanel2 = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        iban = new javax.swing.JTextField();
        nif = new javax.swing.JTextField();
        adress1 = new javax.swing.JTextField();
        Contact = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Name7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Name8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        adress2 = new javax.swing.JTextField();
        adress3 = new javax.swing.JTextField();
        adress4 = new javax.swing.JTextField();
        adress5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel2.setBackground(new java.awt.Color(255, 255, 255));
        JPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entidade Interveniente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        JPanel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel2.setOpaque(false);

        Save.setBackground(new java.awt.Color(255, 255, 255));
        Save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Save.setText("Guardar");
        Save.setOpaque(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(255, 255, 255));
        Cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cancel.setText("Cancelar");
        Cancel.setOpaque(false);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nome da Entidade");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("NIF");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Contacto");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("IBAN");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Morada");

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        iban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibanActionPerformed(evt);
            }
        });

        nif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nifActionPerformed(evt);
            }
        });

        adress1.setText("(lugar, rua, bairro, estrada...)");
        adress1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adress1FocusGained(evt);
            }
        });
        adress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adress1ActionPerformed(evt);
            }
        });

        Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Nome");

        Name7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name7ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Morada");

        Name8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name8ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("                             Mandatário");

        adress2.setText("(nº porta)");
        adress2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adress2FocusGained(evt);
            }
        });

        adress3.setText("(andar)");
        adress3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adress3FocusGained(evt);
            }
        });

        adress4.setText("(código postal)");
        adress4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adress4FocusGained(evt);
            }
        });
        adress4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adress4ActionPerformed(evt);
            }
        });

        adress5.setText("(cidade)");
        adress5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adress5FocusGained(evt);
            }
        });
        adress5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adress5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel2Layout = new javax.swing.GroupLayout(JPanel2);
        JPanel2.setLayout(JPanel2Layout);
        JPanel2Layout.setHorizontalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adress1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nif, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanel2Layout.createSequentialGroup()
                                .addComponent(adress2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adress3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel2Layout.createSequentialGroup()
                                .addComponent(adress4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adress5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(iban, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel2Layout.createSequentialGroup()
                                .addComponent(Cancel)
                                .addGap(18, 18, 18)
                                .addComponent(Save))
                            .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Name8)
                                .addComponent(Name7, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        JPanel2Layout.setVerticalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Name))
                .addGap(5, 5, 5)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(nif, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adress1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adress3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adress4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adress5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(iban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(9, 9, 9)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Name7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(35, 35, 35)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(Save))
                .addGap(57, 57, 57))
        );

        getContentPane().add(JPanel2, java.awt.BorderLayout.CENTER);
        getContentPane().add(jLabel5, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        add_entity();
    }//GEN-LAST:event_SaveActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void ibanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ibanActionPerformed

    private void nifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nifActionPerformed

    private void adress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adress1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adress1ActionPerformed

    private void ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactActionPerformed

    private void Name7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name7ActionPerformed

    private void Name8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name8ActionPerformed

    private void adress1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adress1FocusGained
        adress1.addMouseListener(new MouseAdapter() { // codigo para clicar e desaparecer texto
        @Override
            public void mouseClicked(MouseEvent e) {
                adress1.setText("");
            }
        });
    }//GEN-LAST:event_adress1FocusGained

    private void adress4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adress4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adress4ActionPerformed

    private void adress2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adress2FocusGained
                adress2.addMouseListener(new MouseAdapter() { // codigo para clicar e desaparecer texto
        @Override
            public void mouseClicked(MouseEvent e) {
                adress2.setText("");
            }
        });        
    }//GEN-LAST:event_adress2FocusGained

    private void adress3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adress3FocusGained
                adress3.addMouseListener(new MouseAdapter() { // codigo para clicar e desaparecer texto
        @Override
            public void mouseClicked(MouseEvent e) {
                adress3.setText("");
            }
        });        
    }//GEN-LAST:event_adress3FocusGained

    private void adress4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adress4FocusGained
                adress4.addMouseListener(new MouseAdapter() { // codigo para clicar e desaparecer texto
        @Override
            public void mouseClicked(MouseEvent e) {
                adress4.setText("");
            }
        });        
    }//GEN-LAST:event_adress4FocusGained

    private void adress5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adress5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adress5ActionPerformed

    private void adress5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adress5FocusGained
                adress5.addMouseListener(new MouseAdapter() { // codigo para clicar e desaparecer texto
        @Override
            public void mouseClicked(MouseEvent e) {
                adress5.setText("");
            }
        });     
    }//GEN-LAST:event_adress5FocusGained

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField Contact;
    private javax.swing.JPanel JPanel2;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Name7;
    private javax.swing.JTextField Name8;
    private javax.swing.JButton Save;
    private javax.swing.JTextField adress1;
    private javax.swing.JTextField adress2;
    private javax.swing.JTextField adress3;
    private javax.swing.JTextField adress4;
    private javax.swing.JTextField adress5;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JTextField iban;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nif;
    // End of variables declaration//GEN-END:variables
}
