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
public class Entity extends javax.swing.JFrame {
private System system;
     PreparedStatement pst = null;
    public Entity(System system) {
        initComponents();
        this.system = system;
    }

   public void add_entity(){
           // if("Credor".equals(Type.getSelectedItem())){
            String query = "INSERT INTO `intervenients_entities`(`name_int`, `adress_int`, `total_debInt`, `nif_int`, `nib_pay`, `contact_int`, `num_law`) "
                    + "VALUES ('"+name_int.getText()+"','"+address_int.getText()+"',,'"+Integer.valueOf(nif_int.getText())+"','"+Integer.valueOf(iban.getText())+"','"+Integer.valueOf(contact_int.getText())+"','"+system.getlawsuit().getNum_law()+"')";    
            
            try {           
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);    
               
                pst.execute();
         
                   
       }
       catch(Exception e){
   JOptionPane.showMessageDialog(null,e);}}
           /* else{
                String query = "INSERT INTO `creditor`(`nif_cre`, `name_cre`, `address_cre`, `contact_cre`, `num_law`, `nib_pay`, `total_deb`) VALUES ('"+Name.getText()+"','"+Adress.getText()+"',,'"+Integer.valueOf(Nif.getText())+"','"+Integer.valueOf(IBAN.getText())+"','"+Integer.valueOf(Contact.getText())+"','"+system.getlawsuit().getNum_law()+"')";    
            
            try {           
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);    
               
                pst.execute();
         
                   
       }
       catch(Exception e){
   JOptionPane.showMessageDialog(null,e);}
            }}*/
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        JPanel1 = new javax.swing.JPanel();
        patrimony = new javax.swing.JButton();
        entityes = new javax.swing.JButton();
        complaint = new javax.swing.JButton();
        JPanel2 = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        name_int = new javax.swing.JTextField();
        iban = new javax.swing.JTextField();
        nif_int = new javax.swing.JTextField();
        address_int = new javax.swing.JTextField();
        contact_int = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        address_mand = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        name_mand = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel1.setBackground(new java.awt.Color(255, 255, 255));
        JPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Páginas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        JPanel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel1.setOpaque(false);

        patrimony.setBackground(new java.awt.Color(255, 255, 255));
        patrimony.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        patrimony.setText("Registar Património");
        patrimony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patrimonyActionPerformed(evt);
            }
        });

        entityes.setBackground(new java.awt.Color(255, 255, 255));
        entityes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        entityes.setText("Registar entidades intervenientes");
        entityes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entityesActionPerformed(evt);
            }
        });

        complaint.setBackground(new java.awt.Color(255, 255, 255));
        complaint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        complaint.setText("Registar reclamações de crédito");
        complaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complaintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(patrimony)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(entityes)
                .addGap(31, 31, 31)
                .addComponent(complaint)
                .addContainerGap())
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(complaint)
                    .addComponent(entityes)
                    .addComponent(patrimony))
                .addContainerGap())
        );

        getContentPane().add(JPanel1);
        JPanel1.setBounds(10, 370, 790, 80);

        JPanel2.setBackground(new java.awt.Color(255, 255, 255));
        JPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entidade Interveniente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        JPanel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel2.setOpaque(false);

        Save.setBackground(new java.awt.Color(255, 255, 255));
        Save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Save.setText("Guardar");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(255, 255, 255));
        Cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cancel.setText("Cancelar");
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

        name_int.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_intActionPerformed(evt);
            }
        });

        iban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibanActionPerformed(evt);
            }
        });

        nif_int.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nif_intActionPerformed(evt);
            }
        });

        address_int.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_intActionPerformed(evt);
            }
        });

        contact_int.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_intActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nome:");

        address_mand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_mandActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Morada:");

        name_mand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_mandActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addComponent(name_int, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address_int, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact_int, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iban, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_mand, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address_mand, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addComponent(nif_int, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(137, 137, 137))))
            .addGroup(JPanel2Layout.createSequentialGroup()
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(Cancel))
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Save)))
                .addGap(77, 77, 77))
        );
        JPanel2Layout.setVerticalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name_int, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel2Layout.createSequentialGroup()
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nif_int, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(contact_int, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address_int, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iban, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Save)
                            .addComponent(Cancel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel2Layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_mand, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address_mand, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(118, 118, 118)))
                .addContainerGap())
        );

        getContentPane().add(JPanel2);
        JPanel2.setBounds(10, 10, 790, 360);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 810, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patrimonyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patrimonyActionPerformed
        Patrimony p = new Patrimony(system);
        p.setVisible(true);
    }//GEN-LAST:event_patrimonyActionPerformed

    private void entityesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entityesActionPerformed
        Entity e=new Entity(system);
        e.setVisible(true);
    }//GEN-LAST:event_entityesActionPerformed

    private void complaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complaintActionPerformed
        Complaint c = new Complaint(system);
        c.setVisible(true);
    }//GEN-LAST:event_complaintActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
       system.getIntervening().addIntervenients();
        //add_entity();
    }//GEN-LAST:event_SaveActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void name_intActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_intActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_intActionPerformed

    private void ibanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ibanActionPerformed

    private void nif_intActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nif_intActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nif_intActionPerformed

    private void address_intActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_intActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_intActionPerformed

    private void contact_intActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_intActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_intActionPerformed

    private void address_mandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_mandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_mandActionPerformed

    private void name_mandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_mandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_mandActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JPanel JPanel1;
    private javax.swing.JPanel JPanel2;
    private javax.swing.JButton Save;
    private javax.swing.JTextField address_int;
    private javax.swing.JTextField address_mand;
    private javax.swing.JButton complaint;
    private javax.swing.JTextField contact_int;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JButton entityes;
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
    private javax.swing.JTextField name_int;
    private javax.swing.JTextField name_mand;
    private javax.swing.JTextField nif_int;
    private javax.swing.JButton patrimony;
    // End of variables declaration//GEN-END:variables
}
