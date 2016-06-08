/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Debt {
    private float value_debts;
    private Lawsuit l;
   // private Intervenient_entitie entity;
  //  private int pay_ref;
    private int nif_int;
    private Payment pay;
    private String description_debt;
       PreparedStatement pst = null;

    public Debt(float value_debts, String description_debt,int nif_int, Lawsuit l) {
        this.value_debts = value_debts;
     //   this.pay_ref = pay_ref;
        this.description_debt = description_debt;
        this.nif_int=nif_int;
        this.l=l;
    }

    public float getValue_debts() {
        return value_debts;
    }

    public void setValue_debts(float value_debts) {
        this.value_debts = value_debts;
    }

 /*   public int getPay_ref() {
        return pay_ref;
    }

    public void setPay_ref(int pay_ref) {
        this.pay_ref = pay_ref;
    }*/

    public Payment getPay() {
        return pay;
    }

    public void setPay(Payment pay) {
        this.pay = pay;
    }
    

    public String getDescription_debt() {
        return description_debt;
    }

    public void setDescription_debt(String description_debt) {
        this.description_debt = description_debt;
    }

    public int getNif_int() {
        return nif_int;
    }

    public void setNif_int(int nif_int) {
        this.nif_int = nif_int;
    }
       
       

     public void add_debt(){

            String query = "INSERT INTO `debt`(`value_debts`, `num_law`, `nif_int`, `pay_refer`, `description_debt`) VALUES"
                    + " ('"+value_debts+"','"+l.getNum_law()+"','"+nif_int+"',,'"+description_debt+"')";            
            try {           
      
            Connection c = DBClass.getConnection();
        pst = c.prepareStatement(query);    
               
                pst.execute();
      
                   
       }
       catch(Exception e){
   }}
     
     
     public void update_ref(){
         
          String query = "UPDATE `debt` SET `pay_refer`='"+pay.getPay_refer()+"' WHERE num_law='"+l.getNum_law()+"' and value_debts='"+value_debts+"' and nif_int='"+nif_int+"' and description_debt = '"+description_debt+"'";    
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

