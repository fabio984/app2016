package BackEnd;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Asset {
    private String name_pro;
    private int id_pro;
private float price_sale;
    private int purchase_state;
    private String description;
    private String category;
    private String district;

    private int num_law;
    private String adress;
    private String postal_code;
    private FileInputStream image1;
    private int image2;
    private String locality;
    private float price_evaluation;
    private String sub_category;

    
      PreparedStatement pst = null;

    public Asset(String name_pro, int id_pro, float price_sale, int purchase_state, String description, String category, String district, int num_law, String adress, String postal_code, FileInputStream image1, int image2, String locality, float price_evaluation, String sub_category) {
        this.name_pro = name_pro;
        this.id_pro = id_pro;
        this.price_sale = price_sale;
        this.purchase_state = purchase_state;
        this.description = description;
        this.category = category;
        this.district = district;
        this.num_law = num_law;
        this.adress = adress;
        this.postal_code = postal_code;
        this.image1 = image1;
        this.image2 = image2;
        this.locality = locality;
        this.price_evaluation = price_evaluation;
        this.sub_category = sub_category;
    }

    public String getName_pro() {
        return name_pro;
    }

    public void setName_pro(String name_pro) {
        this.name_pro = name_pro;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public float getPrice_sale() {
        return price_sale;
    }

    public void setPrice_sale(float price_sale) {
        this.price_sale = price_sale;
    }

    public int getPurchase_state() {
        return purchase_state;
    }

    public void setPurchase_state(int purchase_state) {
        this.purchase_state = purchase_state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getNum_law() {
        return num_law;
    }

    public void setNum_law(int num_law) {
        this.num_law = num_law;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public FileInputStream getImage1() {
        return image1;
    }

    public void setImage1(FileInputStream image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public float getPrice_evaluation() {
        return price_evaluation;
    }

    public void setPrice_evaluation(float price_evaluation) {
        this.price_evaluation = price_evaluation;
    }

    public String getSub_category() {
        return sub_category;
    }

    public void setSub_category(String sub_category) {
        this.sub_category = sub_category;
    }

    public PreparedStatement getPst() {
        return pst;
    }

    public void setPst(PreparedStatement pst) {
        this.pst = pst;
    }

    
             
    public void add_asset(){
    //Assets a = new Assets(name_pro,  id_pro,  price_pro,  purchase_state,  description,  category,  district,  price_min,  price_max,  num_law,  adress,  postal_code){

            
           
    
          String query = "INSERT INTO `financial_asset`(`name_pro`, `id_pro`, `price_sale`, `purchase_state`, `description`, `category`, `district`, `num_law`, `address`,"
                  + " `postal_code`, `image`, `locality`, `price_evaluation`, `sub_category`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";    
            // por numero processo
            try {            
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);       
                   pst.setString(1, name_pro);
           pst.setString(2, id_pro + "");
           pst.setString(3, price_sale + "");
           pst.setString(4, purchase_state + "");
           pst.setString(5, description);
           pst.setString(6, category);
           pst.setString(7,district);
           pst.setString(8, num_law + "");
           pst.setString(9, adress);
           pst.setString(10, postal_code + "");
         pst.setBinaryStream(11, image1, image2);
          
           pst.setString(12, locality);
           pst.setString(13, price_evaluation + "");
               pst.setString(14, sub_category);
           
           
                                        
                pst.execute();
         /*  if(pst.next()){
           JOptionPane.showMessageDialog(null, "correct");}
           else{
           JOptionPane.showMessageDialog(null, "incorrect");
           
           }      
                */   
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} }
    
      public void update_asset(){
            
           
    
          String query = "UPDATE `financial_asset` SET `name_pro`='"+name_pro+"',`id_pro`='"+id_pro+"',`price_sale`='"+price_sale+"',`purchase_state`='"+purchase_state+"',`description`='"+description+"',`category`='"+category+"',`district`='"+district+"',`num_law`='"+num_law+"',`address`='"+adress+"',`postal_code`='"+postal_code+"',`image`='"+image+"',`locality`='"+locality+"',`price_evaluation`='"+price_evaluation+"',`sub_category`='"+sub_category+"' WHERE num_law='"+num_law+"'";    
            // por numero processo
            try {            
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);       
        
                                
            pst.execute();
          
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} }


       public void select_asset(int id_pro){
              String sql= "select * from financial_asset where id_pro = '"+id_pro+"'";
                try{
                    Connection c = DBClass.getConnection();
                    pst = c.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    while(rs.next()){
  
                        num_law = Integer.valueOf(rs.getString(8));
                        name_pro = rs.getString(1);
                        this.id_pro = Integer.valueOf(rs.getString(2));
                        price_sale = Float.parseFloat(rs.getString(3));
                        purchase_state = Integer.valueOf(rs.getString(4));
                        description = rs.getString(5); 
                       category = rs.getString(6);
                        district = rs.getString(7);
                        adress =  rs.getString(9);
                        postal_code = rs.getString(10);
                      //  image = Integer.valueOf(rs.getString(11));
                        locality = rs.getString(12);
                        price_evaluation = Float.parseFloat(rs.getString(13));
                        sub_category = rs.getString(14);
                    }
                }
                
        catch(Exception e){
         //JOptionPane.showMessageDialog(null, e);
        }
  
  }}
