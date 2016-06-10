 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.DBClass;
import BackEnd.Debt;
import BackEnd.Lawsuit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import BackEnd.System1;

/**
 *
 * @author Asus
 */
public final class Add_Debt extends javax.swing.JFrame {
private System1 system;
   PreparedStatement pst = null;
    public Add_Debt(System1 system) {
        initComponents();
        this.system = system;
        list_debt();
        nif();
        
        
    }

    public void add_debt(){
  
        float value_debts = Float.parseFloat(Value.getText());
        int nif_int = Integer.valueOf(NIF.getSelectedItem().toString());
        //int pay_ref = Integer.valueOf(Ref.getText());
        String description_debt = Desc.getText();
        Lawsuit l = system.getlawsuit();
        Debt d = new Debt(value_debts, description_debt,nif_int,l );
        system.setDebt(d);
        system.getDebt().add_debt();
    
    
    }
    
    public void nif(){
                 

            String query = "SELECT  `nif_int` FROM `intervenients_entities` where `num_law` = '"+system.getlawsuit().getNum_law()+"' ";
           try {           
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);    
               
                ResultSet rs = pst.executeQuery();
                    if(rs.next()){
               
                       NIF.addItem(rs.getString("nif_int"));
                 
                    }
         
                   
       }
       catch(Exception e){
   }
    }
    
    public DefaultTableModel list_debt(){
              
         DefaultTableModel dm= (DefaultTableModel)table.getModel();
             dm.setColumnCount(0);
       dm.setRowCount(0);
       dm.addColumn("Valor");
         dm.addColumn("NIF");
         dm.addColumn("Referência");
         dm.addColumn("Descrição");
         
         
        
        try{
        Connection c = DBClass.getConnection();
        String sql = "select * from debt where num_law='"+system.getlawsuit().getNum_law()+"'";
         pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
         while (rs.next()){
             String value= rs.getString(1);
             String nif= rs.getString(3);
               String ref= rs.getString(4);
               String desc = rs.getString(5);
               
               
               dm.addRow(new String[]{value,nif,ref,desc});
          
                     
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
        type2 = new javax.swing.JLabel();
        type3 = new javax.swing.JLabel();
        Value = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        type5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Desc = new javax.swing.JTextArea();
        NIF = new javax.swing.JComboBox<String>();
        image = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPanel.setBackground(new java.awt.Color(255, 255, 255));
        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dívidas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        JPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel.setOpaque(false);

        register.setBackground(new java.awt.Color(255, 255, 255));
        register.setText("Guardar");
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

        type2.setBackground(new java.awt.Color(0, 0, 0));
        type2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type2.setText("Descrição:");

        type3.setBackground(new java.awt.Color(0, 0, 0));
        type3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        type5.setBackground(new java.awt.Color(0, 0, 0));
        type5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type5.setText("Valor:");

        Desc.setColumns(20);
        Desc.setRows(5);
        jScrollPane2.setViewportView(Desc);

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(type3))
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(type5))
                            .addComponent(type2))
                        .addGap(4, 4, 4)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NIF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Value)
                            .addComponent(jScrollPane2))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(type3)
                        .addGap(9, 9, 9)
                        .addComponent(type5)
                        .addGap(16, 16, 16)
                        .addComponent(type2))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel)
                    .addComponent(register)))
        );

        getContentPane().add(JPanel, java.awt.BorderLayout.CENTER);
        getContentPane().add(image, java.awt.BorderLayout.PAGE_START);

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
    private javax.swing.JTextArea Desc;
    private javax.swing.JPanel JPanel;
    private javax.swing.JComboBox<String> NIF;
    private javax.swing.JTextField Value;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton register;
    private javax.swing.JTable table;
    private javax.swing.JLabel type2;
    private javax.swing.JLabel type3;
    private javax.swing.JLabel type5;
    // End of variables declaration//GEN-END:variables
}
