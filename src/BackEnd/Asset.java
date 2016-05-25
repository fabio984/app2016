package BackEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Asset {
    public String name_pro;
    public int id_pro;
    public float price_sale;
    public int purchase_state;
    public String description;
    public String category;
    public String district;

    public int num_law;
    public String adress;
    public int postal_code;
    public String image;
    public String locality;
    private float price_evaluation;
    private String sub_category;

    
      PreparedStatement pst = null;

    public Asset(String name_pro, int id_pro, float price_sale, int purchase_state, String description, String category, String district, int num_law, String adress, int postal_code, String image, String locality, float price_evaluation, String sub_category) {
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
        this.image = image;
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

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
          pst.setString(11, image);
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


  
    
}
