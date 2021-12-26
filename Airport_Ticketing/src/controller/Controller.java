/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.toedter.calendar.JDateChooser;
import dao.DAOBuyTicket;
import dao.DAOUser;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.User;
import view.View_Login;
import view.View_Signup;
import view.user.View_Panel_User;
import view.user.View_Panel_User_ListPenerbangan;
import view.user.dialog.dialogFrame_Penerbangan_notFound;

/**
 *
 * @author restu
 */
public class Controller {
    DAOUser da = new DAOUser();
    DAOBuyTicket daoBuyTicket = new DAOBuyTicket();
    User user = new User();
    View_Login frame_login;
    View_Panel_User frame_pUser = new View_Panel_User();
    View_Signup frame_signup = new View_Signup();
    View_Panel_User_ListPenerbangan frame_listPenerbangan = new View_Panel_User_ListPenerbangan();
    dialogFrame_Penerbangan_notFound frame_notfound = new dialogFrame_Penerbangan_notFound();
    
    public Controller(View_Login v_login) {
        frame_listPenerbangan.setVisible(false);
        frame_notfound.setVisible(false);
        frame_signup.setVisible(false);
        frame_pUser.setVisible(false);
        
        this.frame_login = v_login;
        this.frame_login.setVisible(true);
        v_login.setTitle("TUBES NIH BOUS");
        
        listener Listener = new listener();
        frame_login.addListener(Listener); 
        frame_signup.addListener(Listener);
        frame_pUser.addListener(Listener);
        frame_notfound.addListener(Listener);
    }
    
    class listener implements MouseListener {
        
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("KONAKENKOK");
        // FRAME LOGIN
            // btn login
            if (e.getComponent() == frame_login.getBtnLogin()) {
                boolean valid = da.validate(frame_login.getTxtUsername().getText(), frame_login.getTxtPassword().getText());
                if (valid) {
                    user.setUsername(frame_login.getTxtUsername().getText());
                    user.setPassword(frame_login.getTxtPassword().getText());
                    
                    JOptionPane.showMessageDialog(frame_login, "Login sebagai "+user.getUsername());

                    frame_pUser.getUsername().setText(user.getUsername());
                    move(frame_login, frame_pUser);
                    daoBuyTicket.fillCombobox(frame_pUser.getTxt_ke());
                    daoBuyTicket.fillCombobox(frame_pUser.getTxt_dari());
                } else {
                    JOptionPane.showMessageDialog(frame_login, "Username atau Password salah");
                }
            } 
            // btn signup
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
            
        // FRAME PANEL USER
            // btn cari penerbangan
            if (e.getComponent() == frame_pUser.getBtnCariPenerbangan()) {
                Date utilDate = frame_pUser.getTxt_tanggal().getDate();
                System.out.println((String)frame_pUser.getTxt_dari().getSelectedItem()+(String)frame_pUser.getTxt_ke().getSelectedItem()+utilDate);
                
                List<String> list_pesawat = daoBuyTicket.cariPesawat((String)frame_pUser.getTxt_dari().getSelectedItem(), (String)frame_pUser.getTxt_ke().getSelectedItem(), utilDate);
                if (list_pesawat.isEmpty()) {
                    move(frame_pUser, frame_notfound);
                } else {
                    daoBuyTicket.fillJlistPesawat(frame_listPenerbangan.getList_pesawat(), list_pesawat);
                }
             
                
                move(frame_pUser, frame_listPenerbangan);
            }
            
        // DIALOG NOTFOUND
            // btn ganti pencarian
            if (e.getComponent() == frame_notfound.getBtnGantiPencarian()) {
                move(frame_notfound, frame_pUser);
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
 
    public void getDate(JDateChooser gdate) {
        gdate.getDate();
    }
}