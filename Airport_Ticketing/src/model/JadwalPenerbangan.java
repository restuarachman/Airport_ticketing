/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author restu
 */
public class JadwalPenerbangan {
    private int id;
    private Date date;
    private String bandaraAsal;
    private String bandaraTujuan;
    private String pesawat;
    private String kelas;
    private int harga;

    public JadwalPenerbangan(int id, Date date, String bandaraAsal, String bandaraTujuan, String pesawat, String kelas, int harga) {
        this.id = id;
        this.date = date;
        this.bandaraAsal = bandaraAsal;
        this.bandaraTujuan = bandaraTujuan;
        this.pesawat = pesawat;
        this.kelas = kelas;
        this.harga = harga;
    }

    public JadwalPenerbangan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPesawat() {
        return pesawat;
    }

    public void setPesawat(String pesawat) {
        this.pesawat = pesawat;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
}
