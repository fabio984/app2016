
package BackEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Online {
  // private String cv_edit;
   private String email_company;
   private int phone_company;
   private String address_company;
   private String description_comp;
   private String postal_code_company;
   private int fax_company;
   private int telephone_company;
   private String conditions;
   private String nameLink;
   private String linkDB;
   
   PreparedStatement pst = null;
   ResultSet rs=null;

    public Online(String email_company, int phone_company, String address_company, String description_comp, String postal_code_company, int fax_company, int telephone_company, String conditions, String nameLink, String linkDB) {
        this.email_company = email_company;
        this.phone_company = phone_company;
        this.address_company = address_company;
        this.description_comp = description_comp;
        this.postal_code_company = postal_code_company;
        this.fax_company = fax_company;
        this.telephone_company = telephone_company;
        this.conditions = conditions;
        this.nameLink= nameLink;
        this.linkDB= linkDB;
    }

    public String getNameLink() {
        return nameLink;
    }

    public void setNameLink(String nameLink) {
        this.nameLink = nameLink;
    }

    public String getLinkDB() {
        return linkDB;
    }

    public void setLinkDB(String linkDB) {
        this.linkDB = linkDB;
    }
    
    public String getEmail_company() {
        return email_company;
    }

    public void setEmail_company(String email_company) {
        this.email_company = email_company;
    }

    public int getPhone_company() {
        return phone_company;
    }

    public void setPhone_company(int phone_company) {
        this.phone_company = phone_company;
    }

    public String getAddress_company() {
        return address_company;
    }

    public void setAddress_company(String address_company) {
        this.address_company = address_company;
    }

    public String getDescription_comp() {
        return description_comp;
    }

    public void setDescription_comp(String description_comp) {
        this.description_comp = description_comp;
    }

    public String getPostal_code_company() {
        return postal_code_company;
    }

    public void setPostal_code_company(String postal_code_company) {
        this.postal_code_company = postal_code_company;
    }

    public int getFax_company() {
        return fax_company;
    }

    public void setFax_company(int fax_company) {
        this.fax_company = fax_company;
    }

    public int getTelephone_company() {
        return telephone_company;
    }

    public void setTelephone_company(int telephone_company) {
        this.telephone_company = telephone_company;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
   
       public void add_online_info(){
            
           
    
          String query = "INSERT INTO `online_information`(`email_company`, `phone_company`, `address_company`, `description_comp`, `postal_code_company`, `fax_company`, `telephone_company`, `conditions`, `name_link`, `link`)"
                  + " VALUES(?,?,?,?,?,?,?,?,?)";    
            // por numero processo
            try {            
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);  
           pst.setString(2, email_company);
           pst.setString(3, phone_company + "");
           pst.setString(4, address_company);
           pst.setString(5, description_comp);
           pst.setString(6, postal_code_company);
           pst.setString(7,fax_company + "");
           pst.setString(8, telephone_company + "");
           pst.setString(9, conditions);
           pst.setString(10, nameLink);
           pst.setString(11, linkDB);
                                
            pst.execute();
          
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} }

         public void edit_online_info(){
            
           
    
          String query = "UPDATE `online_information` SET `email_company`='"+email_company+"',`phone_company`='"+phone_company+"',`address_company`='"+address_company+"',`description_comp`='"+description_comp+"',`postal_code_company`='"+postal_code_company+"'"
                  + ",`fax_company`='"+fax_company+"',`telephone_company`='"+telephone_company+"',`conditions`='"+conditions+"', `name_link`='"+nameLink+"', `link`='"+linkDB+"'";    
            // por numero processo
            try {            
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);       
        
                                
            pst.execute();
          
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} }
}