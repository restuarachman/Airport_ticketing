/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOUser;
import view.View_Login;

/**
 *
 * @author restu
 */
public class Controller {
    DAOUser da = new DAOUser();

    View_Login frame_login;
    public Controller(View_Login v_login) {
        this.frame_login = v_login;
        this.frame_login.setVisible(true);
        v_login.setTitle("TUBES NIH BOUS");
        
    
       
    }

    
}
