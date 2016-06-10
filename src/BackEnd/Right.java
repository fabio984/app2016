/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Right {
    private Date date;
    private float total_pay;
    private Lawsuit l;
    private Payment pay;
  PreparedStatement pst = null;
    ResultSet rs = null;
    private int id_right;
    
    private String description_right;
    public Right(Date date, float total_pay,String description_right,int id_right, Lawsuit l) {
        this.date = date;
        this.total_pay = total_pay;
        this.description_right=description_right;
        this.l=l;
        this.id_right=id_right;
    }

    public int getId_right() {
        return id_right;
    }

    public void setId_right(int id_right) {
        this.id_right = id_right;
    }

    public String getDescription_right() {
        return description_right;
    }

    public void setDescription_right(String description_right) {
        this.description_right = description_right;
    }
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotal_pay() {
        return total_pay;
    }

    public void setTotal_pay(float total_pay) {
        this.total_pay = total_pay;
    }
    
    
    
     public void add_right(){
            Random ran = new Random();
    int n = 999999999;
    id_right = ran.nextInt(n + 1);
    

            String query = "INSERT INTO `right`(`date`, `total_pay`, `num_law`, `pay_refer`, `description_right`, `nif_int`, `id_right`) VALUES"
                    + " ('"+date+"','"+total_pay+"','"+l.getNum_law()+"','0','"+description_right+"','0','"+id_right+"')";            
            try {           
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);    
               
                pst.execute();
      
                   
       }
       catch(Exception e){
   }}
     
      public void update_ref(){
         
          String query = "UPDATE `right` SET `pay_refer`='"+pay.getPay_refer()+"' WHERE `num_law`='"+l.getNum_law()+"' and `total_pay`='"+total_pay+"' and `date`='"+date+"' and description_right` = '"+description_right+"'";    
            // por numero processo
            try {            
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);       
        
                                
            pst.execute();
          
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} 
     }
        public void update_right(){
            
         
          String query = "UPDATE `right` SET `date`='"+date+"',`total_pay`='"+total_pay+"',`description_right`='"+description_right+"' WHERE `id_right`='"+id_right+"'";    
            // por numero processo
            try {            
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);       
        
                                
            pst.execute();
          
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} 
     }
}
