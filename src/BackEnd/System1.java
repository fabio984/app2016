
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
    private Payment payment;
    private Debt debt;
    private Right right;
    private Category_process category;
     
    public System1() {

    }

    public Category_process getCategory() {
        return category;
    }

    public void setCategory(Category_process category) {
        this.category = category;
    }
    

    public Right getRight() {
        return right;
    }

    public void setRight(Right right) {
        this.right = right;
    }
    

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Debt getDebt() {
        return debt;
    }

    public void setDebt(Debt debt) {
        this.debt = debt;
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