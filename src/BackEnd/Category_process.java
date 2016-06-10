/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//OLA prinln kkkkl
//mensagem teste bitbucket


package BackEnd;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Jo„o Vilaverde
 */
public class Category_process {
   private String lawsuit_category;
    private Lawsuit lawsuit;
    PreparedStatement pst = null;
      ResultSet rs = null;

    public Category_process() {
       // this.lawsuit = lawsuit;
       this.lawsuit_category=lawsuit_category;
    }

    public Lawsuit getLawsuit() {
        return lawsuit;
    }

    public void setLawsuit(Lawsuit lawsuit) {
        this.lawsuit = lawsuit;
    }

    public String getLawsuit_category() {
        return lawsuit_category;
    }

    public void setLawsuit_category(String lawsuit_category) {
        this.lawsuit_category = lawsuit_category;
    }
    
    
    public void add_category_process(String lawsuit_category){
        String query = "INSERT INTO `category_process`(`lawsuit`, ) VALUES"
                + " ('"+lawsuit_category+"',)";    
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
    
      
              public void select_j(){
              String sql= "select * from category_process ";
                try{
                          Connection c = DBClass.getConnection();

           pst = c.prepareStatement(sql);
     
         ResultSet rs = pst.executeQuery();
         if(rs.next()){
             
       // DateFormat format = new SimpleDateFormat("YYYY-MM-dd", Locale.ENGLISH);

         
  
         lawsuit_category = rs.getString("lawsuit_category");
         
          
         }} catch(Exception e){
           //JOptionPane.showMessageDialog(null, e);
       } 
              }

}
