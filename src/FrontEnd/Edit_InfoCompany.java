/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.DBClass;
import BackEnd.Online;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import BackEnd.System1;

        public class Edit_InfoCompany extends javax.swing.JFrame {

            private System1 system;
  PreparedStatement pst = null;
  ResultSet rs = null;
  
    public Edit_InfoCompany(System1 system) {
        initComponents();
        this.system= system;
        //this.setResizable(false);
        this.setLocationRelativeTo(null);
        try{
            String sql= "SELECT * FROM `online_information`";
            Connection c = DBClass.getConnection();
            pst = c.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
           if(rs.next()){
              email.setText(rs.getString("email_company"));
              tele.setText(rs.getString("phone_company"));
              address.setText(rs.getString("address_company"));
              desc.setText(rs.getString("description_comp"));
              postal.setText(rs.getString("postal_code_company"));
              fax.setText(rs.getString("fax_company"));
              telep.setText(rs.getString("telephone_company"));
              cond.setText(rs.getString("conditions"));
           }
            
            
        }
          catch(Exception e){
       JOptionPane.showMessageDialog(null,e);}
    }
 
    
    public void edit_info(){
    String email_company = email.getText();
    int phone_company = Integer.valueOf(tele.getText());
    String address_company = address.getText();
    String description_comp = desc.getText();
    String postal_code_company = postal.getText();
    int fax_company = Integer.valueOf(fax.getText());
    int telephone_company = Integer.valueOf(telep.getText());
    String conditions = cond.getText();
    
    Online o = new Online( email_company,  phone_company,  address_company,  description_comp,  postal_code_company,  fax_company,  telephone_company,  conditions);
    system.setOnline(o);
    system.getOnline().edit_online_info();
    
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JPanel = new javax.swing.JPanel();
        ButtonCancel = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        type4 = new javax.swing.JLabel();
        telep = new javax.swing.JTextField();
        type5 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        type6 = new javax.swing.JLabel();
        type7 = new javax.swing.JLabel();
        postal = new javax.swing.JTextField();
        type8 = new javax.swing.JLabel();
        fax = new javax.swing.JTextField();
        type9 = new javax.swing.JLabel();
        tele = new javax.swing.JTextField();
        type10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        type11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cond = new javax.swing.JTextArea();
        type13 = new javax.swing.JLabel();
        telep1 = new javax.swing.JTextField();
        type14 = new javax.swing.JLabel();
        telep2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(810, 510));

        JPanel.setBackground(new java.awt.Color(255, 255, 255));
        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inforamção da empresa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        JPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel.setMinimumSize(new java.awt.Dimension(890, 610));
        JPanel.setOpaque(false);

        ButtonCancel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonCancel.setText("Cancelar");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        ButtonSave.setBackground(new java.awt.Color(255, 255, 255));
        ButtonSave.setText("Gravar");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        type4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type4.setForeground(new java.awt.Color(255, 255, 255));
        type4.setText("Email:");

        telep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telepActionPerformed(evt);
            }
        });

        type5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type5.setForeground(new java.awt.Color(255, 255, 255));
        type5.setText("Telefone:");

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        type6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type6.setForeground(new java.awt.Color(255, 255, 255));
        type6.setText("Morada:");

        type7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type7.setForeground(new java.awt.Color(255, 255, 255));
        type7.setText("Descrição:");

        postal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postalActionPerformed(evt);
            }
        });

        type8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type8.setForeground(new java.awt.Color(255, 255, 255));
        type8.setText("Código Postal:");

        fax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faxActionPerformed(evt);
            }
        });

        type9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type9.setForeground(new java.awt.Color(255, 255, 255));
        type9.setText("Fax:");

        tele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleActionPerformed(evt);
            }
        });

        type10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type10.setForeground(new java.awt.Color(255, 255, 255));
        type10.setText("Telemóvel:");

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        type11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type11.setForeground(new java.awt.Color(255, 255, 255));
        type11.setText("Condições:");

        cond.setColumns(20);
        cond.setRows(5);
        jScrollPane2.setViewportView(cond);

        type13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type13.setForeground(new java.awt.Color(255, 255, 255));
        type13.setText("Link:");

        telep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telep1ActionPerformed(evt);
            }
        });

        type14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type14.setForeground(new java.awt.Color(255, 255, 255));
        type14.setText("Nome de Link:");

        telep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telep2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241)
                .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(type6)
                            .addComponent(type7))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address)
                            .addComponent(jScrollPane1))
                        .addGap(28, 28, 28))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(type5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(type4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(type10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(323, 553, Short.MAX_VALUE))
                            .addComponent(tele)
                            .addComponent(telep))
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(type8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postal))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(type9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(type11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(type13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(type14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telep2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                            .addComponent(fax, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telep1))))
                .addGap(25, 25, 25))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type4))
                .addGap(18, 18, 18)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type5))
                .addGap(18, 18, 18)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type10))
                .addGap(10, 10, 10)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type6)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(type7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(type8)
                    .addComponent(postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fax, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type9))
                .addGap(18, 18, 18)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 725, Short.MAX_VALUE)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type13))
                .addGap(25, 25, 25)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(JPanel, java.awt.BorderLayout.CENTER);
        JPanel.getAccessibleContext().setAccessibleName("Informação da empresa"); // NOI18N

        jLabel5.setMinimumSize(new java.awt.Dimension(910, 600));
        getContentPane().add(jLabel5, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
       dispose();
    }//GEN-LAST:event_ButtonCancelActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
    edit_info();
    dispose();
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void telepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telepActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void postalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postalActionPerformed

    private void faxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faxActionPerformed

    private void teleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleActionPerformed

    private void telep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telep1ActionPerformed

    private void telep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telep2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telep2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JPanel JPanel;
    private javax.swing.JTextField address;
    private javax.swing.JTextArea cond;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fax;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField postal;
    private javax.swing.JTextField tele;
    private javax.swing.JTextField telep;
    private javax.swing.JTextField telep1;
    private javax.swing.JTextField telep2;
    private javax.swing.JLabel type10;
    private javax.swing.JLabel type11;
    private javax.swing.JLabel type13;
    private javax.swing.JLabel type14;
    private javax.swing.JLabel type4;
    private javax.swing.JLabel type5;
    private javax.swing.JLabel type6;
    private javax.swing.JLabel type7;
    private javax.swing.JLabel type8;
    private javax.swing.JLabel type9;
    // End of variables declaration//GEN-END:variables
}
