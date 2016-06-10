/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import BackEnd.DBClass;
import BackEnd.Lawsuit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import BackEnd.System1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import BackEnd.Client;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
        
// import meus:
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class AccessLawsuit extends javax.swing.JFrame {

            private System1 system;
  PreparedStatement pst = null;
  ResultSet rs = null;
    private Object textField;
  
    public AccessLawsuit(System1 system) {
        initComponents();
        this.system= system;
        
        
          DefaultTableModel dm= (DefaultTableModel)table.getModel();
          
             dm.setColumnCount(0);
       dm.setRowCount(0);
              dm.addColumn("NºProcesso");
         dm.addColumn("Nome de empresa");
    dm.addColumn("Nif");
         dm.addColumn("Data");

        
        try{
      Connection c = DBClass.getConnection();
        String sql = "select * from lawsuit a, client c where a.nif_cli=c.nif_cli";
         pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
         while (rs.next()){
              String num_law= rs.getString("num_law");
             String name_cli= rs.getString("name_cli");
              String nif_cli= rs.getString("nif_cli");
//               String date_beg= rs.getString("date_beg");

               dm.addRow(new String[]{num_law,name_cli,nif_cli});
        
         }
   
    }
            catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} 
    
    }
    
  
  public DefaultTableModel list_lawsuit(){
              
         DefaultTableModel dm= (DefaultTableModel)table.getModel();
             dm.setColumnCount(0);
       dm.setRowCount(0);
              dm.addColumn("NºProcesso");
         dm.addColumn("Nome de empresa");
    dm.addColumn("Nif");
         dm.addColumn("Data");

        if("NIF".equals(filter.getSelectedItem())){
            //--------------------------------------------------
           
                try{
      Connection c = DBClass.getConnection();
        String sql = "select * from lawsuit a, client c where a.nif_cli=c.nif_cli and a.nif_cli='"+Integer.valueOf(Filter.getText())+"'";
         pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
         while (rs.next()){
              String num_law= rs.getString("num_law");
             String name_cli= rs.getString("name_cli");
              String nif_cli= rs.getString("nif_cli");
 String date_beg= rs.getString("date_beg");

               dm.addRow(new String[]{num_law,name_cli,nif_cli,date_beg});


           
          
                     
         }
         
           return dm;
   
    }
            catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} 
        return null;
        
      
            
            //-----------------------------------------
  
        
    } else  if("Nome de empresa".equals(filter.getSelectedItem())){
                 try{
      Connection c = DBClass.getConnection();
        String sql = "select * from lawsuit a, client c where a.nif_cli=c.nif_cli and c.name_cli='"+Filter.getText()+"'";
         pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
         while (rs.next()){
              String num_law= rs.getString("num_law");
             String name_cli= rs.getString("name_cli");
 String date_beg= rs.getString("date_beg");
              String nif_cli= rs.getString("nif_cli");

               dm.addRow(new String[]{num_law,name_cli,nif_cli,date_beg});
                     
         }
         
           return dm;
   
    }
            catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} 
                 
        
    return null; }
    
    else if("Data Registo".equals(filter.getSelectedItem())){
                 try{
      Connection c = DBClass.getConnection();
        String sql = "select * from lawsuit a, client c where a.nif_cli=c.nif_cli and a.date_beg='"+Filter.getText()+"'";
         pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
         while (rs.next()){
              String num_law= rs.getString("num_law");
             String name_cli= rs.getString("name_cli");
             String date_beg= rs.getString("date_beg");
                           String nif_cli= rs.getString("nif_cli");


               dm.addRow(new String[]{num_law,name_cli,nif_cli,date_beg});   
                     
         }
         
           return dm;
   
    }
            catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} 
                 
            
     return null;} 

    else if("Número de Processo".equals(filter.getSelectedItem())){
                 try{
      Connection c = DBClass.getConnection();
        String sql = "select * from lawsuit a, client c where a.nif_cli=c.nif_cli and a.num_law='"+Filter.getText()+"'";
         pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
         while (rs.next()){
              String num_law= rs.getString("num_law");
             String name_cli= rs.getString("name_cli");
             String date_beg= rs.getString("date_beg");
                           String nif_cli= rs.getString("nif_cli");


               dm.addRow(new String[]{num_law,name_cli,nif_cli,date_beg});   
                     
         }
         
           return dm;
   
    }
            catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} 
                 
            }
     return null;}    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Filter = new javax.swing.JTextField();
        filter = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPanel.setBackground(new java.awt.Color(255, 255, 255));
        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acesso Processos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        JPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel.setOpaque(false);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Filter.setText("digite a sua pesquisa neste campo...");
        Filter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FilterFocusGained(evt);
            }
        });
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });

        filter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar(Pré-def.)", "NIF", "Nome Empresa", "Data Registo", "Número Processo" }));
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
        ){public boolean isCellEditable(int row, int column){return false;}}
    );
    jScrollPane1.setViewportView(table);

    jButton4.setText("Pesquisar");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });

    jLabel1.setText("Pesquisar por:");

    javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
    JPanel.setLayout(JPanelLayout);
    JPanelLayout.setHorizontalGroup(
        JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
            .addContainerGap(46, Short.MAX_VALUE)
            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)
                    .addComponent(jButton2)
                    .addGap(262, 262, 262))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(JPanelLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Filter)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43))))
    );
    JPanelLayout.setVerticalGroup(
        JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(JPanelLayout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2)))
    );

    getContentPane().add(JPanel, java.awt.BorderLayout.CENTER);
    getContentPane().add(jLabel5, java.awt.BorderLayout.PAGE_START);

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        list_lawsuit();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int row= table.getSelectedRow();
        String table_click =(table.getModel().getValueAt(row, 0).toString());
        String table_click1 =(table.getModel().getValueAt(row, 2).toString());

        // Lawsuit(int num_law, Date date_beg, Date date_end, Date date_ass, String name_judge, int nif_cli, String state_pro, int num_emp, String pro_category) {
            //Client(String name_cli, int nif_cli, int contact_cli, int nif_mand, String name_mand, String address_cli, int contact_mand, String email_cli) {

                Lawsuit l = new Lawsuit(Integer.valueOf(table_click),null,null,null,null,0,null,0,null,null,null);
                Client c = new Client(null,Integer.valueOf(table_click1),0,0,null,null,0,null);

                system.setLawsuit(l);
                system.setClient(c);
                system.getlawsuit().select_law();
                system.getClient().select_cli();

                LawsuitMenu lm = new LawsuitMenu(system);
                lm.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FilterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FilterFocusGained
             Filter.addMouseListener(new MouseAdapter() { // codigo para clicar e desaparecer texto
    @Override
    public void mouseClicked(MouseEvent e) {
        Filter.setText("");
    }
});
    }//GEN-LAST:event_FilterFocusGained

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
      
    }//GEN-LAST:event_FilterActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Filter;
    private javax.swing.JPanel JPanel;
    private javax.swing.JComboBox<String> filter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
