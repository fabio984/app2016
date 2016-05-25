/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;
import BackEnd.DBClass;
import BackEnd.System1;


import BackEnd.Lawsuit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class Userpage extends javax.swing.JFrame {
private String type;
private int num_emp;
private System1 system;
    PreparedStatement pst = null;
  ResultSet rs = null;
  
     
    public Userpage(System1 system) {
        initComponents();
        this.type = type;
       // this.num_emp = num_emp;
        this.system = system;
            DefaultTableModel dm= (DefaultTableModel)table.getModel();
         dm.setColumnCount(0);
         dm.setRowCount(0);
         dm.addColumn("Numero de funcionário");
         dm.addColumn("Nome de funcionário");
         dm.addColumn("Contacto");
         dm.addColumn("Morada");    
         dm.addColumn("Descrição");
         dm.addColumn("Nif");

        
        try{
      Connection c = DBClass.getConnection();
        String sql = "select * from employe";
         pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
         while (rs.next()){
              String num_emp= rs.getString("num_emp");
             String name_emp= rs.getString("name_emp");
              String contact_emp= rs.getString("contact_emp");
                      String address_emp= rs.getString("address_emp");
             String description_emp= rs.getString("description_emp");
              String nif_company= rs.getString("nif_company");
//               String date_beg= rs.getString("date_beg");

               dm.addRow(new String[]{num_emp,name_emp,contact_emp, address_emp, description_emp,nif_company});
         // public Lawsuit(int num_law, Date date_beg, Date date_end, Date date_ass, String name_judge, int nif_cli, String state_pro, int num_adm, String pro_category) {

                     
         }
         
           
   
    }
            catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} 

    
    }

      /*  public DefaultTableModel list_emp(){
              
         DefaultTableModel dm= (DefaultTableModel)table.getModel();
         dm.setColumnCount(0);
         dm.setRowCount(0);
         dm.addColumn("Numero de funcionário");
         dm.addColumn("Nome de funcionário");
         dm.addColumn("Contacto");
         dm.addColumn("Morada");    
         dm.addColumn("Descrição");
         dm.addColumn("Nif");

        
        try{
      Connection c = DBClass.getConnection();
        String sql = "select * from employe";
         pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
         while (rs.next()){
              String num_emp= rs.getString("num_emp");
             String name_emp= rs.getString("name_emp");
              String contact_emp= rs.getString("contact_emp");
                      String address_emp= rs.getString("address_emp");
             String description_emp= rs.getString("description_emp");
              String nif_company= rs.getString("nif_company");
//               String date_beg= rs.getString("date_beg");

               dm.addRow(new String[]{num_emp,name_emp,contact_emp, address_emp, description_emp,nif_company});
         // public Lawsuit(int num_law, Date date_beg, Date date_end, Date date_ass, String name_judge, int nif_cli, String state_pro, int num_adm, String pro_category) {

                     
         }
         
           return dm;
   
    }
            catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} 
        return null;
    }*/
        
        

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jLabel7 = new javax.swing.JLabel();
        JPanel = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        admin = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        law = new javax.swing.JRadioButton();
        secr = new javax.swing.JRadioButton();
        pass = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPanel.setBackground(new java.awt.Color(255, 255, 255));
        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Utilizador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        JPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel.setOpaque(false);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Registar");
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("Cancelar");
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Utilizador:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");

        admin.setBackground(new java.awt.Color(0, 0, 0));
        admin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        admin.setForeground(new java.awt.Color(240, 240, 240));
        admin.setText("Administrador Judicial");
        admin.setOpaque(false);
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");

        law.setBackground(new java.awt.Color(0, 0, 0));
        law.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        law.setForeground(new java.awt.Color(240, 240, 240));
        law.setText("Advogado");
        law.setOpaque(false);

        secr.setBackground(new java.awt.Color(0, 0, 0));
        secr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        secr.setForeground(new java.awt.Color(240, 240, 240));
        secr.setText("Funcionário Administrativo");
        secr.setOpaque(false);

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(73, 73, 73)
                        .addComponent(jButton9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(law)
                    .addComponent(secr)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admin))
                .addGap(81, 81, 81))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 49, Short.MAX_VALUE)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(admin)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(secr)
                .addGap(18, 18, 18)
                .addComponent(law)
                .addGap(30, 30, 30)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton9))
                .addGap(87, 87, 87))
        );

        getContentPane().add(JPanel, java.awt.BorderLayout.CENTER);
        getContentPane().add(jLabel5, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       // add_user
       int row= table.getSelectedRow();
           int table_click =Integer.valueOf(table.getModel().getValueAt(row, 0).toString());
      
          
          
           
           
           /* try{
                 Connection c = system.getConnection();

           
           String sql= "select num_emp from employe where num_emp = '"+table_click+"'";
           pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         if(rs.next()){
             //Lawsuit l = new Lawsuit(num_law,  date_beg,  date_end,  date_ass,  name_judge,  nif_cli,  state_pro,  num_admin,  pro_category);
             num_emp = Integer.valueOf(rs.getString(1));
    
  
       
               
                          
         }}
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }*/
        if(admin.isSelected()){
             type = "a";
            
        }
        else if(secr.isSelected()){
             type = "s";
        }
        else if(law.isSelected()){
          type = "l"; 
        }
        
        String query = "insert into `user` (`type`,  `username`,  `password`, `num_emp`) values(?,?,?,?)";    
            try {            
       
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);       
          pst.setString(1, type);
          pst.setString(2, user.getText());
          pst.setString(3, pass.getText());
          pst.setString(4, Integer.toString(table_click));
          
                                                         
                pst.execute();

                   
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,e); }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JRadioButton admin;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton law;
    private javax.swing.JPasswordField pass;
    private javax.swing.JRadioButton secr;
    private javax.swing.JTable table;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
