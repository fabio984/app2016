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
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;


public class Payment {
    private double total_pay;
    private Date date;
    private int pay_refer;
PreparedStatement pst = null;
  ResultSet rs = null;
    public Payment(double total_pay, Date date, int pay_refer) {
        this.total_pay = total_pay;
        this.date = date;
        this.pay_refer = pay_refer;
    }

    public double getTotal_pay() {
        return total_pay;
    }

    public void setTotal_pay(double total_pay) {
        this.total_pay = total_pay;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPay_refer() {
        return pay_refer;
    }

    public void setPay_refer(int pay_refer) {
        this.pay_refer = pay_refer;
    }
    
    public void add_payment(){
        String query = "INSERT INTO `payment`(`total_pay`, `date`, `pay_refer`) VALUES"
                + " ('"+total_pay+"','"+date+"','"+pay_refer+"')";    
                        try {           
                            Connection c = DBClass.getConnection();
                            pst = c.prepareStatement(query);    
               
                            pst.execute();
                          
                        }
       catch(Exception e){
       }
    }
    
     public void select_payment(){
              String sql= "select * from payment'";
                try{
                    Connection c = DBClass.getConnection();
                    pst = c.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if(rs.next()){
                        DateFormat format = new SimpleDateFormat("YYYY-MM-dd", Locale.ENGLISH);
                        pay_refer = Integer.valueOf(rs.getString("pay_ref"));
          
                       date = format.parse(rs.getString("date"));
                       total_pay= Double.valueOf(rs.getString("total_pay"));
                    }
                }
                
        catch(Exception e){
         //JOptionPane.showMessageDialog(null, e);
        }
    }

           public void update_payment(){
            
           
    
          String query = "UPDATE `payment` SET `total_pay`='"+total_pay+"',`date`='"+date+"',`pay_refer`='"+pay_refer+"' WHERE 1";    
            // por numero processo
            try {            
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);       
        
                                
            pst.execute();
          
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(null,e);} }
    
}
