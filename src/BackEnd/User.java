/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class User {
    private String username;
    private String password;
    private String type;
    private int num_emp;
    PreparedStatement pst = null;
    ResultSet rs = null;
     
    public User(String username, String password) {
        this.username = username;
        this.password = password;
       
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum_emp() {
        return num_emp;
    }

    public void setNum_emp(int num_emp) {
        this.num_emp = num_emp;
    }
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername(){
        return username;
    }

  public void add_user(String username, String password){
      String sql = "Select * from user where username='"+username+"' and password='"+password+"' ";
       try{
           
       Connection c = DBClass.getConnection();
      

           pst = c.prepareStatement(sql);
           

           ResultSet rs = pst.executeQuery();
           if(rs.next()){
           JOptionPane.showMessageDialog(null, "correct");
           
           this.username = rs.getString("username");
          this.password = rs.getString("password");
          type = rs.getString("type");
           num_emp = Integer.valueOf(rs.getString("num_emp"));
           
            }else{
           JOptionPane.showMessageDialog(null, "incorrect");
           
  
            }}
       catch(Exception e){
       JOptionPane.showMessageDialog(null,e);}}
   
}
