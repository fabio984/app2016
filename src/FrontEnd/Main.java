
package FrontEnd;

import BackEnd.System1;


public class Main {

        private System1 system;
    
   
    public static void main(String[] args) {
       
       System1 system = new System1();
       
    //LawsuitMenu login = new LawsuitMenu(system);
    //login.setVisible(true);
    //AdminMenu login = new AdminMenu(system);
    //login.setVisible(true);
    //AddEntity login = new AddEntity(system);
    //login.setVisible(true);
    //AccessLawsuit login = new AccessLawsuit(system);
    //login.setVisible(true);
    Edit_Asset login = new Edit_Asset(system);
    login.setVisible(true);
    }
    
}

