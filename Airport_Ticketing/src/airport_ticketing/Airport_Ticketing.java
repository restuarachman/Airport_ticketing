
package airport_ticketing;

import controller.Controller;
import view.View_Login;


public class Airport_Ticketing {

    
    public static void main(String[] args) {
        
        System.out.println("helooa");
        
        View_Login frame = new View_Login();
        Controller controller = new Controller(frame);
       
    }
    
}
