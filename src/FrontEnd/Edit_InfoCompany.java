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
        //teste bitbucket
        if(email.getText() != ""){
            ButtonSave.setEnabled(false);
        }else if(email.getText().equals("")){
            ButtonSave.setEnabled(true);
        }
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

    public void saveInfo(){
    
        String query = "INSERT INTO `online_information`( `email_company`, `phone_company`, `address_company`"
                + ", `description_comp`, `postal_code_company`, `fax_company`, `telephone_company`, `conditions`)" 
                + "VALUES ('"+
                email.getText()+"','"+
                tele.getText()+"','"+
                address.getText()+"','"+
                desc.getText()+"','"+
                postal.getText()+"','"+
                fax.getText()+"','"+
                telep.getText()+"','"+
                cond.getText()+"')";
      
            try {           
                Connection c = DBClass.getConnection();
                pst = c.prepareStatement(query);    
                pst.execute();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }   
  }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JPanel = new javax.swing.JPanel();
        ButtonCancel = new javax.swing.JButton();
        ButtonEdit = new javax.swing.JButton();
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
        type11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cond = new javax.swing.JTextArea();
        ButtonSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(810, 510));

        JPanel.setBackground(new java.awt.Color(255, 255, 255));
        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informação da empresa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
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

        ButtonEdit.setBackground(new java.awt.Color(255, 255, 255));
        ButtonEdit.setText("Editar");
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
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

        type11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type11.setForeground(new java.awt.Color(255, 255, 255));
        type11.setText("Condições:");

        cond.setColumns(20);
        cond.setRows(5);
        jScrollPane2.setViewportView(cond);

        ButtonSave.setText("Gravar");
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(type11)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(type9)
                            .addComponent(type7)
                            .addComponent(type8))
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fax, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(ButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(type6)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPanelLayout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(type10))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(type5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(type4, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(telep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tele)
                            .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postal, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type4))
                .addGap(18, 18, 18)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(type7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fax, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type9))
                .addGap(18, 18, 18)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(type11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(765, Short.MAX_VALUE))
        );

        getContentPane().add(JPanel, java.awt.BorderLayout.CENTER);

        jLabel5.setMinimumSize(new java.awt.Dimension(910, 600));
        getContentPane().add(jLabel5, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
       dispose();
    }//GEN-LAST:event_ButtonCancelActionPerformed

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
    edit_info();
    dispose();
    }//GEN-LAST:event_ButtonEditActionPerformed

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

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        saveInfo();
        dispose();
    }//GEN-LAST:event_ButtonSaveActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonEdit;
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
    private javax.swing.JLabel type10;
    private javax.swing.JLabel type11;
    private javax.swing.JLabel type4;
    private javax.swing.JLabel type5;
    private javax.swing.JLabel type6;
    private javax.swing.JLabel type7;
    private javax.swing.JLabel type8;
    private javax.swing.JLabel type9;
    // End of variables declaration//GEN-END:variables
}
