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
            String query = "INSERT INTO `intervenients_entities`(`name_int`, `adress_int`, `total_debInt`, `nif_int`, `nib_pay`, `contact_int`, `num_law`) VALUES ('"+Name.getText()+"','"+Adress.getText()+"',,'"+Integer.valueOf(Nif.getText())+"','"+Integer.valueOf(IBAN.getText())+"','"+Integer.valueOf(Contact.getText())+"','"+system.getlawsuit().getNum_law()+"')";    
            
            try {           
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);    
               
                pst.execute();
         
                   
       }
       catch(Exception e){
   JOptionPane.showMessageDialog(null,e);}}
            else{
                String query = "INSERT INTO `creditor`(`nif_cre`, `name_cre`, `address_cre`, `contact_cre`, `num_law`, `nib_pay`, `total_deb`) VALUES ('"+Name.getText()+"','"+Adress.getText()+"',,'"+Integer.valueOf(Nif.getText())+"','"+Integer.valueOf(IBAN.getText())+"','"+Integer.valueOf(Contact.getText())+"','"+system.getlawsuit().getNum_law()+"')";    
            
            try {           
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);    
               
                pst.execute();
         
                   
       }
       catch(Exception e){
   JOptionPane.showMessageDialog(null,e);}
            }}
   

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
        Name2 = new javax.swing.JTextField();
        Name3 = new javax.swing.JTextField();
        Name4 = new javax.swing.JTextField();
        Name5 = new javax.swing.JTextField();
        Name6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Name7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Name8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel2.setBackground(new java.awt.Color(255, 255, 255));
        JPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entidade Interveniente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
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
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome de entidade:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NIF de Entidade:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contacto:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("IBAN:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Morada:");

        Name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name2ActionPerformed(evt);
            }
        });

        Name3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name3ActionPerformed(evt);
            }
        });

        Name4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name4ActionPerformed(evt);
            }
        });

        Name5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name5ActionPerformed(evt);
            }
        });

        Name6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name6ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nome:");

        Name7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name7ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Morada:");

        Name8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name8ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Mandatário");

        javax.swing.GroupLayout JPanel2Layout = new javax.swing.GroupLayout(JPanel2);
        JPanel2.setLayout(JPanel2Layout);
        JPanel2Layout.setHorizontalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel2Layout.createSequentialGroup()
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel2Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Name7, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(Name8)))
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Name2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(Name4)
                            .addComponent(Name6)
                            .addComponent(Name5)
                            .addComponent(Name3))))
                .addContainerGap(214, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(331, 331, 331))
            .addGroup(JPanel2Layout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addComponent(Save)
                .addGap(119, 119, 119)
                .addComponent(Cancel)
                .addGap(224, 224, 224))
        );
        JPanel2Layout.setVerticalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Name6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(24, 24, 24)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel2Layout.createSequentialGroup()
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cancel)
                            .addComponent(Save))
                        .addGap(28, 28, 28))))
        );

        getContentPane().add(JPanel2);
        JPanel2.setBounds(10, 0, 790, 460);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\yfcv.PNG")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 810, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        add_entity();
    }//GEN-LAST:event_SaveActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void Name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name2ActionPerformed

    private void Name3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name3ActionPerformed

    private void Name4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name4ActionPerformed

    private void Name5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name5ActionPerformed

    private void Name6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name6ActionPerformed

    private void Name7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name7ActionPerformed

    private void Name8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name8ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JPanel JPanel2;
    private javax.swing.JTextField Name2;
    private javax.swing.JTextField Name3;
    private javax.swing.JTextField Name4;
    private javax.swing.JTextField Name5;
    private javax.swing.JTextField Name6;
    private javax.swing.JTextField Name7;
    private javax.swing.JTextField Name8;
    private javax.swing.JButton Save;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
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
    // End of variables declaration//GEN-END:variables
}
