
package FrontEnd;

import BackEnd.System;


public class Main {

        private System system;
    
   
    public static void main(String[] args) {
       
       System system = new System();
       
    //LawsuitMenu login = new LawsuitMenu(system);
    //login.setVisible(true);
    //AdminMenu login = new AdminMenu(system);
    //login.setVisible(true);
    //AddEntity login = new AddEntity(system);
    //login.setVisible(true);
    //AccessLawsuit login = new AccessLawsuit(system);
    //login.setVisible(true);
    Login login = new Login(system);
    login.setVisible(true);
    }
    
}

