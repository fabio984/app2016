/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;
import BackEnd.DBClass;
import BackEnd.Debt;
import BackEnd.Payment;
import BackEnd.Right;
import BackEnd.System1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Add_Payment extends javax.swing.JFrame {

private System1 system;
  PreparedStatement pst = null;
    ResultSet rs = null;
    public Add_Payment(System1 system) {
        initComponents();
        this.system = system;
        list_right();
        list_debt();
    }
    
     public void add_p(){
  

         java.sql.Date date = new java.sql.Date(Date_p.getDate().getTime()); 
         int pay_refer= Integer.valueOf(Ref.getText());
         double total_pay = Double.valueOf(Total.getText());
       //  t(double total_pay, Date date, int pay_refer)
        Payment p = new Payment(total_pay, date,pay_refer);
        system.setPayment(p);
        system.getPayment().add_payment();
    
    
    }

       public DefaultTableModel list_right(){
              
         DefaultTableModel dm= (DefaultTableModel)table1.getModel();
             dm.setColumnCount(0);
       dm.setRowCount(0);
       dm.addColumn("Data");
         dm.addColumn("Total");
         //dm.addColumn("N");
         dm.addColumn("Referência");
         
         
        
        try{
        Connection c = DBClass.getConnection();
        String sql = "select * from right where num_law='"+system.getlawsuit().getNum_law()+"'";
         pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
         while (rs.next()){
             String value= rs.getString(1);
             String nif= rs.getString(2);
               String ref= rs.getString(4);
              // String desc = rs.getString(5);
               
               
               dm.addRow(new String[]{value,nif,ref,});
          
                     
         }
         
           return dm;
   
    }
            catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} 
        return null;
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
        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        JPanel = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Ref = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Date_p = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPanel.setBackground(new java.awt.Color(255, 255, 255));
        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pagamentos ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total:");

        jButton1.setText("Anexar comprovativo");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Referência:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data:");

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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dívidas");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Direitos");

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addContainerGap(568, Short.MAX_VALUE))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ref, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Date_p, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addGap(208, 208, 208))
            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                    .addContainerGap(334, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(19, 19, 19)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(Ref, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Date_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(46, 46, 46)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)))
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton9))
                .addContainerGap())
            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanelLayout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(278, Short.MAX_VALUE)))
        );

        getContentPane().add(JPanel, java.awt.BorderLayout.CENTER);
        getContentPane().add(jLabel5, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
           system.getDebt().update_ref();
        
        list_right();
        list_debt();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
                int row= table.getSelectedRow();
        float value_debts =Float.parseFloat(table.getModel().getValueAt(row, 0).toString());
        int nif_int = Integer.valueOf(table.getModel().getValueAt(row, 1).toString());
        String description_debt = table.getModel().getValueAt(row, 3).toString();
        Debt a = new Debt(value_debts,description_debt,nif_int);

        system.setDebt(a);
        
        
    }//GEN-LAST:event_tableMouseClicked

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
            int row= table.getSelectedRow();
        float value_debts =Float.parseFloat(table.getModel().getValueAt(row, 0).toString());
        int nif_int = Integer.valueOf(table.getModel().getValueAt(row, 1).toString());
        String description_debt = table.getModel().getValueAt(row, 3).toString();
        Debt a = new Debt(value_debts,description_debt,nif_int);

        system.setDebt(a);
    }//GEN-LAST:event_table1MouseClicked

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date_p;
    private javax.swing.JPanel JPanel;
    private javax.swing.JTextField Ref;
    private javax.swing.JTextField Total;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
