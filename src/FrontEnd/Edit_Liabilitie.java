/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.DBClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import BackEnd.System;

/**
 *
 * @author Asus
 */
public class Edit_Liabilitie extends javax.swing.JFrame {
private System system;
   PreparedStatement pst = null;
    public Edit_Liabilitie(System system) {
        initComponents();
        this.system = system;
    }

    public void add_debt(){
    //Assets a = new Assets(name_pro,  id_pro,  price_pro,  purchase_state,  description,  category,  district,  price_min,  price_max,  num_law,  adress,  postal_code){

            
           
    /*
            String query = "insert into `debts` (`total_debts`, `name_cre`, `name_process`) values('"+Integer.valueOf(NameText2.getText())+"','"+NameText.getText()+"','"+NameText1.getText()+"')";    
            try {            
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);       
                                                         
                pst.executeUpdate();
         /*  if(pst.next()){
           JOptionPane.showMessageDialog(null, "correct");}
           else{
           JOptionPane.showMessageDialog(null, "incorrect");
           
           }  
                   
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,e);}*/ }
    
    public DefaultTableModel list_debt(){
              
         DefaultTableModel dm= (DefaultTableModel)table.getModel();
             dm.setColumnCount(0);
       dm.setRowCount(0);
       dm.addColumn("Total");
         dm.addColumn("Nome de Creditor");
         dm.addColumn("Nome de Processo");
         
         
        
        try{
        Connection c = DBClass.getConnection();
        String sql = "select * from debts";
         pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
         while (rs.next()){
             String name= rs.getString(1);
             String id= rs.getString(2);
               String preco= rs.getString(3);
    
               
               dm.addRow(new String[]{name,id,preco});
          
                     
         }
         
           return dm;
   
    }
            catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} 
        return null;
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JPanel = new javax.swing.JPanel();
        register = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        type1 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        type3 = new javax.swing.JLabel();
        NameText4 = new javax.swing.JTextField();
        NameText7 = new javax.swing.JTextField();
        NameText8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        type5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        image = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(null);

        JPanel.setBackground(new java.awt.Color(255, 255, 255));
        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Passivos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        JPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel.setOpaque(false);

        register.setBackground(new java.awt.Color(255, 255, 255));
        register.setText("Editar");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        type1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        type1.setForeground(new java.awt.Color(255, 255, 255));
        type1.setText("Referência:");

        type2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        type2.setForeground(new java.awt.Color(255, 255, 255));
        type2.setText("Descrição:");

        type3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        type3.setForeground(new java.awt.Color(255, 255, 255));
        type3.setText("NIF:");

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

        type5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        type5.setForeground(new java.awt.Color(255, 255, 255));
        type5.setText("Valor:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(type3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameText4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(type2)
                            .addComponent(type5)
                            .addComponent(type1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameText7, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(NameText8, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(type3))
                            .addComponent(NameText4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameText8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type1))
                        .addGap(27, 27, 27)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameText7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type5))
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(type2))
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(JPanel);
        JPanel.setBounds(10, 0, 790, 530);

        image.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\yfcv.PNG")); // NOI18N
        getContentPane().add(image);
        image.setBounds(0, -40, 920, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        add_debt();

        list_debt();

    }//GEN-LAST:event_registerActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JTextField NameText4;
    private javax.swing.JTextField NameText7;
    private javax.swing.JTextField NameText8;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton register;
    private javax.swing.JTable table;
    private javax.swing.JLabel type1;
    private javax.swing.JLabel type2;
    private javax.swing.JLabel type3;
    private javax.swing.JLabel type5;
    // End of variables declaration//GEN-END:variables
}
