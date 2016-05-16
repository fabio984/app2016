/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.sql.PreparedStatement;
import FrontEnd.Entity;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardo
 */
public class Intervenients_entities {
    public String name_int;
    public String address_int;
    public int nif_int;
    public int nib_pay;
    public int contact_int;
    public String type;
    public String name_mand;
    public String address_mand;
    public Entity entity;
    PreparedStatement pst=null;
    

    public Intervenients_entities(String name_int, String address_int, int nif_int, int nib_pay, int contact_int, String type, String name_mand, String address_mand) {
        this.name_int = name_int;
        this.address_int = address_int;
        this.nif_int = nif_int;
        this.nib_pay = nib_pay;
        this.contact_int = contact_int;
        this.type = type;
        this.name_mand = name_mand;
        this.address_mand = address_mand;
    }

    public String getName_int() {
        return name_int;
    }

    public void setName_int(String name_int) {
        this.name_int = name_int;
    }

    public String getAddress_int() {
        return address_int;
    }

    public void setAddress_int(String address_int) {
        this.address_int = address_int;
    }

    public int getNif_int() {
        return nif_int;
    }

    public void setNif_int(int nif_int) {
        this.nif_int = nif_int;
    }

    public int getNib_pay() {
        return nib_pay;
    }

    public void setNib_pay(int nib_pay) {
        this.nib_pay = nib_pay;
    }

    public int getContact_int() {
        return contact_int;
    }

    public void setContact_int(int contact_int) {
        this.contact_int = contact_int;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName_mand() {
        return name_mand;
    }

    public void setName_mand(String name_mand) {
        this.name_mand = name_mand;
    }

    public String getAddress_mand() {
        return address_mand;
    }

    public void setAddress_mand(String address_mand) {
        this.address_mand = address_mand;
    }
    
    public void add_intervening(){
        
        String query="INSERT INTO `intervenients_entities`(`name_int`, `address_int`, `nif_int`, `nib_pay`, `contact_int`, `type`, `name_mand`, `address_mand`) "
                + "VALUES (?,?,?,?,?,?,?,?)";
    
                try{
                    Connection c= DBClass.getConnection();
                    pst = c.prepareStatement(query);
                        pst.setString(1, name_int);
                        pst.setString(2, address_int);
                        pst.setString(3, nif_int + "");
                        pst.setString(4, nib_pay + "");
                        pst.setString(5, contact_int + "");
                        pst.setString(6, type);
                        pst.setString(7,name_mand);
                        pst.setString(8, address_mand);
           
                                        
                pst.execute();
                    
                    
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Entidade Interveniente não guardada!");
            }
    
    
    
    }
    
}


