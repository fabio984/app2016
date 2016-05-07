/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;
import BackEnd.Client;

import BackEnd.DBClass;
import BackEnd.Lawsuit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import BackEnd.System;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class Consult_pat extends javax.swing.JFrame {
 
    private System system;
      PreparedStatement pst = null;
      ResultSet rs = null;
      public int num_law;
    public Consult_pat(System system) {
        initComponents();
        this.system = system;
       /*    this.setResizable(false);
        this.setLocationRelativeTo(null);*/
    }
      /*public void add_l(){

           // String query = "INSERT INTO `lawsuit`(`date_beg`, `name_judge`, `nif_cli`, `state_pro`, `num_adm`, `pro_category`)"
                    
           
         java.sql.Date date_beg = new java.sql.Date(Date_begin.getDate().getTime()); 
            
           String name_judge = Name_J.getText();
           int nif_cli = Integer.valueOf(Nif_Cli.getText());
           String state_pro = "o";
           String pro_category = Category.getText();
           Date date_end = null;
           Date date_ass = null;
          int num_emp = system.getUser().getNum_emp();
       
           try{
               
          
          String query = "SELECT `num_law` FROM `lawsuit` ORDER BY `num_law` DESC LIMIT 1";
           Connection c = DBClass.getConnection();
         ResultSet rs = pst.executeQuery();
                       while (rs.next()){
           this.num_law = Integer.valueOf(rs.getString(1)) + 1;
            
                       }}
                  catch(Exception e){
       JOptionPane.showMessageDialog(null,e);}

           
           
                     Lawsuit l = new Lawsuit(num_law, date_beg, date_end, date_ass, name_judge, nif_cli, state_pro, num_emp, pro_category); 
                     
                     system.setLawsuit(l);

           system.getlawsuit().add_lawsuit();
      }
      
         public void add_cl(){

          int nif_cli = Integer.valueOf(Nif_Cli.getText());
         String name_cli = Name_Cli.getText();
         String adress_cli = Adress_Cli.getText();
          int contact_cli = Integer.valueOf(Contact_Cli.getText());
          int nif_mand = Integer.valueOf(Nif_Mand.getText());
         String name_mand =Name_Mand.getText();
       int contact_mand = Integer.valueOf(Contact_Mand.getText());
         String email_cli = Email_Cli.getText();
        
         
         Client c = new Client(name_cli, nif_cli, contact_cli, nif_mand, name_mand, adress_cli, contact_mand, email_cli);
         
      system.setClient(c);

          system.getClient().add_client();
         
      }*/
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel.setBackground(new java.awt.Color(255, 255, 255));
        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Património", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        JPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel.setOpaque(false);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Ativos");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Passivos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(211, 211, 211))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addContainerGap(536, Short.MAX_VALUE)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(533, 533, 533))))
            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanelLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(674, Short.MAX_VALUE)))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel31)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanelLayout.createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(145, Short.MAX_VALUE)))
        );

        getContentPane().add(JPanel);
        JPanel.setBounds(10, 10, 1160, 460);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\12842488_1375781709114375_619237141_o.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1520, 880);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   


    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
