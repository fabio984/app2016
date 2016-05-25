/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author Jo„o Vilaverde
 */
public class Category_process {
    private Lawsuit lawsuit;
    PreparedStatement pst = null;

    public Category_process(Lawsuit lawsuit) {
        this.lawsuit = lawsuit;
    }

    public Lawsuit getLawsuit() {
        return lawsuit;
    }

    public void setLawsuit(Lawsuit lawsuit) {
        this.lawsuit = lawsuit;
    }
    
    
    public void add_category_process(){
        String query = "INSERT INTO `category_process`(`lawsuit`, ) VALUES"
                + " ('"+lawsuit+"',)";    
                        try {           
                            Connection c = DBClass.getConnection();
                            pst = c.prepareStatement(query);    
               
                            pst.execute();
                            /*  if(pst.next()){
                            JOptionPane.showMessageDialog(null, "correct");}
                            else{
                            JOptionPane.showMessageDialog(null, "incorrect");
                            }*/
                        }
       catch(Exception e){
       }
    }
}