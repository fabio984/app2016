
package BackEnd;

import java.sql.Connection;

import java.util.Date;


public class System1 {

    private static void exit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   // private List_Assets list_asset;
    private Asset assets;
    private Lawsuit lawsuit;
    private Client client;
    private User user;
    private Employe emp;
    private Online online;
    private Intervenient_entitie inter;
     
    public System1() {

    }
    
    public Intervenient_entitie getIntervening(){
        return inter;
    }

    public Online getOnline() {
        return online;
    }
    
    public void setIntervening(Intervenient_entitie inter){
        this.inter = inter;
    }

    public void setOnline(Online online) {
        this.online = online;
    }

    public Employe getEmp() {
        return emp;
    }

    public void setEmp(Employe emp) {
        this.emp = emp;
        
    }
    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
    public void setLawsuit(Lawsuit lawsuit) {
        this.lawsuit = lawsuit;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    

    public void setAssets(Asset assets) {
        this.assets = assets;
    }

    public Asset getAssets() {
        return assets;
    }
    
  /*  public List_Assets getAsset(){
        return list_asset;
    }*/
    
    public Lawsuit getlawsuit(){
        return lawsuit;
    }
    
    public void end(){
        System1.exit(0);
    }
  
    
    public Client getClient() {
        return client;
    }

   
    
}