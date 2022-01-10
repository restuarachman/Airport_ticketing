/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Admin extends User implements Login{
    private String idAdmin;

    public Admin() {
    }

    public Admin(User user, String idAdmin) {
        super(user);
        this.idAdmin = idAdmin;
    }
    
    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    public void addBandara() {
        
    }
    public void addPesawat() {
        
    }
    public void addJadwalPenerbangan() {
        
    }
    public void removeBandara() {
        
    }
    public void removePesawat() {
        
    }
    public void removeJadwalPenerbangan() {
        
    }

    @Override
    public void login(User user, JFrame frame) {
        
    }
}
