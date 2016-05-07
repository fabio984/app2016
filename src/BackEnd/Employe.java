
package BackEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Employe {
    private int num_emp;
    private String name_emp;
    private int contact_emp;
    private String address_emp;
    private String description_emp;
    private int nif_company;
      PreparedStatement pst = null;
  ResultSet rs = null;

    public Employe() {
    }

    public int getNum_emp() {
        return num_emp;
    }

    public void setNum_emp(int num_emp) {
        this.num_emp = num_emp;
    }

    public String getName_emp() {
        return name_emp;
    }

    public void setName_emp(String name_emp) {
        this.name_emp = name_emp;
    }

    public int getContact_emp() {
        return contact_emp;
    }

    public void setContact_emp(int contact_emp) {
        this.contact_emp = contact_emp;
    }

    public String getAddress_emp() {
        return address_emp;
    }

    public void setAddress_emp(String address_emp) {
        this.address_emp = address_emp;
    }

    public String getDescription_emp() {
        return description_emp;
    }

    public void setDescription_emp(String description_emp) {
        this.description_emp = description_emp;
    }

    public int getNif_company() {
        return nif_company;
    }

    public void setNif_company(int nif_company) {
        this.nif_company = nif_company;
    }
    
    public void add_emp(int num_emp){
             try{
        Connection c = DBClass.getConnection();
           String sql= "select * from employe where num_emp = '"+num_emp+"'";
           pst = c.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         if(rs.next()){
             this.num_emp = num_emp;
             nif_company = Integer.valueOf(rs.getString("nif_company"));
             description_emp = rs.getString("description_emp");
             name_emp = rs.getString("name_emp");
             contact_emp = Integer.valueOf(rs.getString("contact_emp"));
             address_emp = rs.getString("address_emp");
             }}
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    
    }
}
