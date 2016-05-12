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

public class Lawsuit {
    
    private int num_law;
    private Date date_beg;
    private Date date_end;
    private Date date_ass;
    private String name_judge;
    private int nif_cli;
    private String state_pro;
    private int num_emp;
    private Date date_bankruptcy;
    private String name_trib;
    private String category_law;
    PreparedStatement pst = null;

    public Lawsuit(int num_law, Date date_beg, Date date_end, Date date_ass, String name_judge, int nif_cli, String state_pro, int num_emp, Date date_bankruptcy, String name_trib, String category_law) {
        this.num_law = num_law;
        this.date_beg = date_beg;
        this.date_end = date_end;
        this.date_ass = date_ass;
        this.name_judge = name_judge;
        this.nif_cli = nif_cli;
        this.state_pro = state_pro;
        this.num_emp = num_emp;
        this.date_bankruptcy = date_bankruptcy;
        this.name_trib = name_trib;
        this.category_law = category_law;
    }

    public int getNum_law() {
        return num_law;
    }

    public void setNum_law(int num_law) {
        this.num_law = num_law;
    }

    public Date getDate_beg() {
        return date_beg;
    }

    public void setDate_beg(Date date_beg) {
        this.date_beg = date_beg;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public Date getDate_ass() {
        return date_ass;
    }

    public void setDate_ass(Date date_ass) {
        this.date_ass = date_ass;
    }

    public String getName_judge() {
        return name_judge;
    }

    public void setName_judge(String name_judge) {
        this.name_judge = name_judge;
    }

    public int getNif_cli() {
        return nif_cli;
    }

    public void setNif_cli(int nif_cli) {
        this.nif_cli = nif_cli;
    }

    public String getState_pro() {
        return state_pro;
    }

    public void setState_pro(String state_pro) {
        this.state_pro = state_pro;
    }

    public int getNum_emp() {
        return num_emp;
    }

    public void setNum_emp(int num_emp) {
        this.num_emp = num_emp;
    }

    public Date getDate_bankruptcy() {
        return date_bankruptcy;
    }

    public void setDate_bankruptcy(Date date_bankruptcy) {
        this.date_bankruptcy = date_bankruptcy;
    }

    public String getName_trib() {
        return name_trib;
    }

    public void setName_trib(String name_trib) {
        this.name_trib = name_trib;
    }

    public String getCategory_law() {
        return category_law;
    }

    public void setCategory_law(String category_law) {
        this.category_law = category_law;
    }




    public void add_lawsuit(){
        String query = "INSERT INTO `lawsuit`(`num_law`, `date_beg`, `date_end`, `date_ass`, `name_judge`, `nif_cli`, `state_pro`, `num_adm`, `date_bankruptcy`, `name_trib`, `category_law`) VALUES"
                + " ('"+num_law+"','"+date_beg+"','"+date_end+"','"+date_ass+"','"+name_judge+"','"+nif_cli+"','"+state_pro+"','"+num_emp+"','"+date_bankruptcy+"','"+name_trib+"','"+category_law+"',)";    
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

    public void select_law(){
              String sql= "select * from lawsuit where num_law = '"+num_law+"'";
                try{
                    Connection c = DBClass.getConnection();
                    pst = c.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    if(rs.next()){
                        DateFormat format = new SimpleDateFormat("YYYY-MM-dd", Locale.ENGLISH);
                        num_law = Integer.valueOf(rs.getString("num_law"));
                        name_judge = rs.getString("name_judge");
                        nif_cli = Integer.valueOf(rs.getString("nif_cli"));
                        state_pro = rs.getString("state_pro");
                        num_emp = Integer.valueOf(rs.getString("num_emp"));
                        category_law = rs.getString("category_law"); 
                       date_beg = format.parse(rs.getString("date_beg"));
                        date_end = format.parse(rs.getString("date_end"));
                        date_ass =  format.parse(rs.getString("date_ass"));
                        name_trib = rs.getString("name_trib");
                        date_bankruptcy = format.parse(rs.getString("date_bankruptcy"));
                    }
                }
                
        catch(Exception e){
         //JOptionPane.showMessageDialog(null, e);
        }
    }
}