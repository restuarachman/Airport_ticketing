/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAOUser;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.User;
import view.View_Login;
import view.View_Signup;
import view.user.View_Panel_User;

/**
 *
 * @author restu
 */
public class Controller {
    DAOUser da = new DAOUser();
    User user = new User();
    View_Login frame_login;
    View_Panel_User frame_pUser = new View_Panel_User();
    View_Signup frame_signup = new View_Signup();
    
    public Controller(View_Login v_login) {
        frame_signup.setVisible(false);
        frame_pUser.setVisible(false);
        
        this.frame_login = v_login;
        this.frame_login.setVisible(true);
        v_login.setTitle("TUBES NIH BOUS");
        
        listener Listener = new listener();
        frame_login.addListener(Listener); 
        frame_signup.addListener(Listener);
    }
    
    class listener implements MouseListener {
        
        @Override
        public void mouseClicked(MouseEvent e) {
           
        // FRAME LOGIN
            // BTN LOGIN
            if (e.getComponent() == frame_login.getBtnLogin()) {
                boolean valid = da.validate(frame_login.getTxtUsername().getText(), frame_login.getTxtPassword().getText());
                if (valid) {
                    user.setUsername(frame_login.getTxtUsername().getText());
                    user.setPassword(frame_login.getTxtPassword().getText());
                    
                    JOptionPane.showMessageDialog(frame_login, "Login sebagai "+user.getUsername());

                    frame_pUser.getUsername().setText(user.getUsername());
                    move(frame_login, frame_pUser);
                } else {
                    JOptionPane.showMessageDialog(frame_login, "Username atau Password salah");
                }
            } 
            // BTN SIGNUP
            if (e.getComponent() == frame_login.getForSignup()){
                move(frame_login, frame_signup);
            } 
           
        // FRAME SIGNUP
            // btn back
            if (e.getComponent() == frame_signup.getBtnBack()) {
                move(frame_signup, frame_login);
            }
            
            // btn signup
            if (e.getComponent() == frame_signup.getBtnSignup()) {
           
                if (!frame_signup.getTxtUsername().getText().equals("") && !frame_signup.getTxtPassword().getText().equals("") && !frame_signup.getTxtPassword1().getText().equals("")) {
                    if(frame_signup.getTxtPassword().getText().equals(frame_signup.getTxtPassword1().getText())) {
                        if (da.findUser(frame_signup.getTxtUsername().getText())) {
                            JOptionPane.showMessageDialog(frame_signup, "Username sudah digunakan");
                        } else {
                            da.insert(new User(frame_signup.getTxtUsername().getText(), frame_signup.getTxtPassword().getText()));
                            JOptionPane.showMessageDialog(frame_signup, "Berhasil daftar");
                            frame_signup.getTxtUsername().setText(null);

                            move(frame_signup, frame_login);
                        }
                        frame_signup.getTxtPassword().setText(null);
                        frame_signup.getTxtPassword1().setText(null);
                    } else {
                        JOptionPane.showMessageDialog(frame_signup, "Password tidak sama");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame_signup, "Field harus diisi semua");
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
           
        }
    }
    
    public void move(JFrame from, JFrame to) {
        to.setVisible(true);
        from.setVisible(false);
    }
 
}