/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author ASUS
 */
public class JadwalPenerbangan {
    private Date date;
    private String bandaraAsal;
    private String bandaraTujuan;

    public JadwalPenerbangan() {
    }

    public JadwalPenerbangan(Date date, String bandaraAsal, String bandaraTujuan) {
        this.date = date;
        this.bandaraAsal = bandaraAsal;
        this.bandaraTujuan = bandaraTujuan;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBandaraAsal() {
        return bandaraAsal;
    }

    public void setBandaraAsal(String bandaraAsal) {
        this.bandaraAsal = bandaraAsal;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public void setBandaraTujuan(String bandaraTujuan) {
        this.bandaraTujuan = bandaraTujuan;
    }
    
    public void tambahJadwal(){
        
    }
    public void editJadwal(){
        
    }
    public void hapusJadwal(){
        
    }
}
