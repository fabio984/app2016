
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
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Add_Asset extends javax.swing.JFrame {
private System1 system;

PreparedStatement pst = null;
  ResultSet rs = null;
   FileInputStream fis = null;
  private File file;
  
    public Add_Asset(System1 system) {
        initComponents();
     this.system = system;
           /*  this.setResizable(false);
        this.setLocationRelativeTo(null);*/
           list_assets();


    }     
    //affafafaf
    //fasbr
    //klnpok
    
     public void add(){

   String name_pro = NameText.getText();          
   int id_pro =Integer.valueOf(IdText.getText());     
   int price_sale= Integer.valueOf(Price.getText());
   int purchase_state = 0;
   if("Em processo de venda".equals(State.getSelectedItem())){
        purchase_state = 0;

   } else  if("Vendido".equals(State.getSelectedItem())){
        purchase_state = 1;

   }else  if("Desaparecido".equals(State.getSelectedItem())){
        purchase_state = 2;

   }else  if("Em averiguação".equals(State.getSelectedItem())){
        purchase_state = 3;

   }
//int purchase_state = Integer.valueOf(jTextField2.getText());
String category = Category.getSelectedItem().toString();
String district = District.getText();

int num_law = system.getlawsuit().getNum_law();

String postal_code = Postal.getText();

String adress = Address.getText();
String description=Desc.getText();
String locality = Local.getText();
    FileInputStream image1= fis;
    int image2= (int) file.length();
float price_evaluation = Float.parseFloat(eval.getText());
String sub_category = sub.getSelectedItem().toString();
   Asset a= new Asset( name_pro,  id_pro, price_sale,  purchase_state,  description,  category,  district,  num_law,  adress,  postal_code,  image1,image2,  locality,  price_evaluation,  sub_category);
      system.setAssets(a);
      system.getAssets().add_asset();    }
      

    
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
       //JOptionPane.showMessageDialog(null,e);
            } 
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
        eval = new javax.swing.JTextField();
        type1 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        type3 = new javax.swing.JLabel();
        type4 = new javax.swing.JLabel();
        type6 = new javax.swing.JLabel();
        type12 = new javax.swing.JLabel();
        State = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        Desc = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        Category = new javax.swing.JComboBox<>();
        type5 = new javax.swing.JLabel();
        sub = new javax.swing.JComboBox<>();
        Address = new javax.swing.JTextField();
        type9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        jLabel2.setText("Utilizador:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        JPanel.setBackground(new java.awt.Color(0, 0, 0));
        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ativos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        JPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPanel.setOpaque(false);

        type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type.setText("Nome");

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

        IdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextActionPerformed(evt);
            }
        });

        type1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type1.setText("Tipo");

        type2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type2.setText("Id");

        type3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type3.setText("Preço");

        type4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type4.setText("Estado");

        type6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type6.setText("Descrição");

        type12.setBackground(new java.awt.Color(0, 0, 0));
        type12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type12.setText("Morada");

        State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em processo de venda", "Vendido", "Desaparecido(?)", "Em averiguação" }));
        State.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateActionPerformed(evt);
            }
        });

        Desc.setColumns(20);
        Desc.setRows(5);
        jScrollPane3.setViewportView(Desc);

        jButton1.setText("Inserir Imagem");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bem Imóvel", "Bem Móvel", "Outro" }));
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });

        type5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type5.setText("Subcategoria");

        sub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apartamentos", "veículos" }));

        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });

        type9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type9.setText("Avaliação(€)");

        jLabel1.setText("?este ID sai, será automatica/ gerado pelo codigo.. ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Outros");

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(JPanelLayout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(type1))
                                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(type5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(type))))
                            .addComponent(type2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameText, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdText))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(type3)
                        .addGap(18, 18, 18)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(type4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(type12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(type9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eval, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(JPanelLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(type6)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type1))
                .addGap(8, 8, 8)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(type)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type4))
                .addGap(10, 10, 10)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        getContentPane().add(JPanel);
        JPanel.setBounds(-1, 3, 620, 830);
        getContentPane().add(image);
        image.setBounds(0, 0, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == fileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
              
           
            try {
                // What to do with the file, e.g. display it in a TextArea
                     fis = new FileInputStream(file);
                BufferedImage img = ImageIO.read(file);
                ImageIcon icon=new ImageIcon(img);
                imagel.setIcon(icon);
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void StateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateActionPerformed

    private void IdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTextActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        add();
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

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JTextArea Desc;
    private javax.swing.JTextField IdText;
    private javax.swing.JPanel JPanel;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField Price;
    private javax.swing.JComboBox<String> State;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField eval;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton register;
    private javax.swing.JComboBox<String> sub;
    private javax.swing.JLabel type;
    private javax.swing.JLabel type1;
    private javax.swing.JLabel type12;
    private javax.swing.JLabel type2;
    private javax.swing.JLabel type3;
    private javax.swing.JLabel type4;
    private javax.swing.JLabel type5;
    private javax.swing.JLabel type6;
    private javax.swing.JLabel type9;
    // End of variables declaration//GEN-END:variables
}
