/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author Asus
 */
public class Client {
    private String name_cli;
    private int nif_cli;
    private int contact_cli;
    private int nif_mand;
    private String name_mand;
    private String address_cli;
    private int contact_mand;
    private String email_cli;
    
    PreparedStatement pst = null;

    public Client(String name_cli, int nif_cli, int contact_cli, int nif_mand, String name_mand, String address_cli, int contact_mand, String email_cli) {
        this.name_cli = name_cli;
        this.nif_cli = nif_cli;
        this.contact_cli = contact_cli;
        this.nif_mand = nif_mand;
        this.name_mand = name_mand;
        this.address_cli = address_cli;
        this.contact_mand = contact_mand;
        this.email_cli = email_cli;
    }

    public String getAddress_cli() {
        return address_cli;
    }

    public void setAdress_cli(String address_cli) {
        this.address_cli = address_cli;
    }
    
    
    public String getName_cli() {
        return name_cli;
    }

    public void setName_cli(String name_cli) {
        this.name_cli = name_cli;
    }

    public int getNif_cli() {
        return nif_cli;
    }

    public void setNif_cli(int nif_cli) {
        this.nif_cli = nif_cli;
    }

    public int getContact_cli() {
        return contact_cli;
    }

    public void setContact_cli(int contact_cli) {
        this.contact_cli = contact_cli;
    }

    public int getNif_mand() {
        return nif_mand;
    }

    public void setNif_mand(int nif_mand) {
        this.nif_mand = nif_mand;
    }

    public String getName_mand() {
        return name_mand;
    }

    public void setName_mand(String name_mand) {
        this.name_mand = name_mand;
    }



    public int getContact_mand() {
        return contact_mand;
    }

    public void setContact_mand(int contact_mand) {
        this.contact_mand = contact_mand;
    }


    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }
    
             public void add_client(){

            String query = "INSERT INTO `client`(`nif_cli`, `name_cli`, `contact_cli`, `nif_mand`, `name_mand`, `address_cli`, `contact_mand`, `email_cli`) VALUES "
                    + " ('"+nif_cli+"','"+name_cli+"','"+contact_cli+"','"+nif_mand+"','"+name_mand+"','"+address_cli+"','"+contact_mand+"','"+email_cli+"')";            
            try {           
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);    
               
                pst.executeUpdate();
         /*  if(pst.next()){
           JOptionPane.showMessageDialog(null, "correct");}
           else{
           JOptionPane.showMessageDialog(null, "incorrect");
           
           }*/
                   
       }
       catch(Exception e){
   }}
              public void select_cli(){
              String sql= "select * from client where nif_cli = '"+nif_cli+"'";
                try{
                          Connection c = DBClass.getConnection();

           pst = c.prepareStatement(sql);
     
         ResultSet rs = pst.executeQuery();
         if(rs.next()){
             
       // DateFormat format = new SimpleDateFormat("YYYY-MM-dd", Locale.ENGLISH);

         
  
         contact_cli = Integer.valueOf(rs.getString("contact_cli"));
          name_cli = rs.getString("name_cli");
         
          nif_cli = Integer.valueOf(rs.getString("nif_cli"));
          name_mand = rs.getString("name_mand");
          contact_mand = Integer.valueOf(rs.getString("contact_mand"));
          email_cli = rs.getString("email_cli");
          address_cli = rs.getString("address_cli");
          
         }} catch(Exception e){
           //JOptionPane.showMessageDialog(null, e);
       }}

}

