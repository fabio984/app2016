/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//OLA prinln
//mensagem teste bitbucket


package BackEnd;


import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author Jo„o Vilaverde
 */
public class Category_process {
   private String lawsuit_category;
    private Lawsuit lawsuit;
    PreparedStatement pst = null;

    public Category_process(/*Lawsuit lawsuit*/ String lawsuit_category) {
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
    
    
    public void add_category_process(){
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
