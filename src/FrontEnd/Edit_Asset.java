
package FrontEnd;

import BackEnd.Asset;
import BackEnd.DBClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import BackEnd.System1;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Edit_Asset extends javax.swing.JFrame {
private System1 system;

PreparedStatement pst = null;
  ResultSet rs = null;
  private File file;
  
    public Edit_Asset(System1 system) {
        initComponents();
     this.system = system;
           /*  this.setResizable(false);
        this.setLocationRelativeTo(null);*/
           list_assets();
           


    }     
    
     public void update(){

   String name_pro = NameText.getText();          
   int id_pro =Integer.valueOf(IdText.getText());     
   float price_sale = Float.parseFloat(Price.getText());
int purchase_state = 0;
String category = State.getSelectedItem().toString();
String district = District.getText();

int num_law = system.getlawsuit().getNum_law();

String postal_code = Postal.getText();

String adress = eval.getText();
String description=Desc.getText();
String locality = Local.getText();
String image= file.getAbsolutePath();
float price_evaluation = Float.parseFloat(eval.getText());
String sub_category = sub.getSelectedItem().toString();
   Asset a= new Asset( name_pro,  id_pro, price_sale,  purchase_state,  description,  category,  district,  num_law,  adress,  postal_code,  image,  locality,  price_evaluation,  sub_category);
      system.setAssets(a);
      system.getAssets().update_asset();    }
      

    
    public DefaultTableModel list_assets(){
              
         DefaultTableModel dm= (DefaultTableModel)table.getModel();
             dm.setColumnCount(0);
       dm.setRowCount(0);
         dm.addColumn("Nome de Produto");
         dm.addColumn("Id");
         dm.addColumn("Preço");
         dm.addColumn("Estado");
         dm.addColumn("Descrição");
         dm.addColumn("Categoria");
         dm.addColumn("Distrito");
     
         dm.addColumn("Número de Processo");
         dm.addColumn("Morada");
         dm.addColumn("Código Postal");
         dm.addColumn("Imagem");
         dm.addColumn("Localidade");
         dm.addColumn("Preço avaliado");
        dm.addColumn("Sub Categoria");
        try{
            //int num_l = system.getlawsuit().getNum_law();
        Connection c = DBClass.getConnection();
        String sql = "select * from financial_asset where num_law = '"+system.getlawsuit().getNum_law()+"'";
       
         pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
     
         while (rs.next()){
             String name= rs.getString(1);
             String id= rs.getString(2);
               String preco= rs.getString(3);
               String estado= rs.getString(4);
               String descricao= rs.getString(5);
               String categoria= rs.getString(6);
               String distrito= rs.getString(7);
          
               String num= rs.getString(8);
               String adress= rs.getString(9);
               String postal= rs.getString(10);
               String image = rs.getString(11);
               String locality = rs.getString(12);
               String price_e = rs.getString(13);
               String sub = rs.getString(14);
               
               
               
               dm.addRow(new String[]{name,id,preco,estado,descricao,categoria,distrito,num,adress,postal,image,locality,price_e,sub});
          
                     
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
        fileChooser = new javax.swing.JFileChooser();
        JPanel = new javax.swing.JPanel();
        type = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        NameText = new javax.swing.JTextField();
        IdText = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        District = new javax.swing.JTextField();
        eval = new javax.swing.JTextField();
        Postal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        type1 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        type3 = new javax.swing.JLabel();
        type4 = new javax.swing.JLabel();
        type6 = new javax.swing.JLabel();
        type7 = new javax.swing.JLabel();
        type11 = new javax.swing.JLabel();
        type12 = new javax.swing.JLabel();
        State = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        Desc = new javax.swing.JTextArea();
        type8 = new javax.swing.JLabel();
        Local = new javax.swing.JTextField();
        imagel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        type5 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        type9 = new javax.swing.JLabel();
        Category = new javax.swing.JComboBox<>();
        sub = new javax.swing.JComboBox<>();
        image = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 550));

        JPanel.setBackground(new java.awt.Color(255, 255, 255));
        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ativos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        JPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel.setOpaque(false);

        type.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setText("Nome:");

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

        IdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextActionPerformed(evt);
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
    table.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(table);

    type1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    type1.setForeground(new java.awt.Color(255, 255, 255));
    type1.setText("Tipologia:");

    type2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    type2.setForeground(new java.awt.Color(255, 255, 255));
    type2.setText("Id:");

    type3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    type3.setForeground(new java.awt.Color(255, 255, 255));
    type3.setText("Preço:");

    type4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    type4.setForeground(new java.awt.Color(255, 255, 255));
    type4.setText("Estado:");

    type6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    type6.setForeground(new java.awt.Color(255, 255, 255));
    type6.setText("Descrição:");

    type7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    type7.setForeground(new java.awt.Color(255, 255, 255));
    type7.setText("Distrito:");

    type11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    type11.setForeground(new java.awt.Color(255, 255, 255));
    type11.setText("Código Postal:");

    type12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    type12.setForeground(new java.awt.Color(255, 255, 255));
    type12.setText("Morada:");

    State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em processo de venda", "Vendido", "Desaparecido", "Em averiguação" }));

    Desc.setColumns(20);
    Desc.setRows(5);
    jScrollPane3.setViewportView(Desc);

    type8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    type8.setForeground(new java.awt.Color(255, 255, 255));
    type8.setText("Localidade:");

    jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButton1.setText("Inserir Imagem");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    type5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    type5.setForeground(new java.awt.Color(255, 255, 255));
    type5.setText("Subcategoria:");

    type9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    type9.setForeground(new java.awt.Color(255, 255, 255));
    type9.setText("Avaliação de preço:");

    Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bem Ímovel", "Bem Móvel", "Outro" }));

    sub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apartamentos", "veículos" }));

    javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
    JPanel.setLayout(JPanelLayout);
    JPanelLayout.setHorizontalGroup(
        JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(JPanelLayout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(type)
                .addComponent(type2)
                .addComponent(type3)
                .addComponent(type4))
            .addGap(45, 45, 45)
            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanelLayout.createSequentialGroup()
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanelLayout.createSequentialGroup()
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPanelLayout.createSequentialGroup()
                                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(District, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JPanelLayout.createSequentialGroup()
                                            .addGap(138, 138, 138)
                                            .addComponent(type5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 20, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(type12, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(type11, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(type9, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGap(18, 18, 18)
                                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(eval, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                                .addComponent(Postal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                                .addComponent(Address, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                .addComponent(jScrollPane3))
                            .addGap(18, 18, 18))
                        .addGroup(JPanelLayout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPanelLayout.createSequentialGroup()
                    .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))))
        .addGroup(JPanelLayout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelLayout.createSequentialGroup()
                    .addGap(632, 632, 632)
                    .addComponent(imagel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelLayout.createSequentialGroup()
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(type7)
                        .addComponent(type8))
                    .addGap(18, 18, 18)
                    .addComponent(Local, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(cancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(register, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(type1)
                .addContainerGap(1049, Short.MAX_VALUE)))
        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(type6)
                .addContainerGap(1185, Short.MAX_VALUE)))
    );
    JPanelLayout.setVerticalGroup(
        JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(JPanelLayout.createSequentialGroup()
            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanelLayout.createSequentialGroup()
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanelLayout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPanelLayout.createSequentialGroup()
                                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(type)
                                        .addComponent(type12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(type11))
                                        .addComponent(type2)))
                                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(type3)
                                .addComponent(eval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(type9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(type4)
                                .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(JPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(30, 30, 30)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(District, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(type7)
                        .addComponent(type5)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(JPanelLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(26, 26, 26)
            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(type8))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imagel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(33, 33, 33)
            .addComponent(jButton1)
            .addGap(44, 44, 44)
            .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(35, 35, 35)
            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(213, 213, 213))
        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(type1)
                .addContainerGap(809, Short.MAX_VALUE)))
        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(type6)
                .addContainerGap(597, Short.MAX_VALUE)))
    );

    getContentPane().add(JPanel, java.awt.BorderLayout.CENTER);
    getContentPane().add(image, java.awt.BorderLayout.PAGE_START);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        update();
        list_assets();
    Postal.setText("");
 eval.setText("");
Desc.setText("");
 Local.setText("");
 sub.setSelectedIndex(0);
 

                //image.setIcon(new ImageIcon(ImageIO.read(system.getAssets().getImage())));
        
          NameText.setText("");          
   IdText.setText("");     
 Price.setText("");
Address.setText("");
Category.setSelectedIndex(0);
District.setText("");

       State.setSelectedIndex(0);
       
  imagel.setIcon(null);
   
    }//GEN-LAST:event_registerActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void IdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == fileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            try {
                // What to do with the file, e.g. display it in a TextArea
                BufferedImage img = ImageIO.read(file);
                ImageIcon icon=new ImageIcon(img);
                imagel.setIcon(icon);
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        
        int row= table.getSelectedRow();
        int id_pro =Integer.valueOf(table.getModel().getValueAt(row, 1).toString());
        Asset a = new Asset(null,0,0,0,null,null,null,0,null,null,null,0,null,0,null);

        system.setAssets(a);
        system.getAssets().select_asset(id_pro);
        
         Postal.setText(system.getAssets().getPostal_code());
 eval.setText(Float.toString(system.getAssets().getPrice_evaluation()));
Desc.setText(system.getAssets().getDescription());
 Local.setText(system.getAssets().getLocality());
 
 if(system.getAssets().getPurchase_state() == 0){
    State.setSelectedItem("Em processo de venda");
 }else if(system.getAssets().getPurchase_state() == 1){
     State.setSelectedItem("Vendido");
 }else if(system.getAssets().getPurchase_state() == 2){
     State.setSelectedItem("Desaparecido");
 }else if(system.getAssets().getPurchase_state() == 3){
     State.setSelectedItem("Em averiguação");
 }
 
 

                //image.setIcon(new ImageIcon(ImageIO.read(system.getAssets().getImage())));
        
          NameText.setText(system.getAssets().getName_pro());          
   IdText.setText(Integer.toString(system.getAssets().getId_pro()));     
 Price.setText(Float.toString(system.getAssets().getPrice_sale()));
Address.setText(system.getAssets().getAdress());
Category.setSelectedItem(system.getAssets().getCategory());
District.setText(system.getAssets().getDistrict());

       sub.setSelectedItem(system.getAssets().getSub_category());
       
  imagel.setIcon(null);
        

    }//GEN-LAST:event_tableMouseClicked

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JTextArea Desc;
    private javax.swing.JTextField District;
    private javax.swing.JTextField IdText;
    private javax.swing.JPanel JPanel;
    private javax.swing.JTextField Local;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField Postal;
    private javax.swing.JTextField Price;
    private javax.swing.JComboBox<String> State;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField eval;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel image;
    private javax.swing.JLabel imagel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton register;
    private javax.swing.JComboBox<String> sub;
    private javax.swing.JTable table;
    private javax.swing.JLabel type;
    private javax.swing.JLabel type1;
    private javax.swing.JLabel type11;
    private javax.swing.JLabel type12;
    private javax.swing.JLabel type2;
    private javax.swing.JLabel type3;
    private javax.swing.JLabel type4;
    private javax.swing.JLabel type5;
    private javax.swing.JLabel type6;
    private javax.swing.JLabel type7;
    private javax.swing.JLabel type8;
    private javax.swing.JLabel type9;
    // End of variables declaration//GEN-END:variables
}
