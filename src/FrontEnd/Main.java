
package FrontEnd;

import BackEnd.System;


public class Main {

        private System system;
    
   
    public static void main(String[] args) {
       
       System system = new System();
       
   
      AccessLawsuit login = new AccessLawsuit(system);
      login.setVisible(true);
    //   Login login = new Login(system);
    //   login.setVisible(true);
    }
    
}

