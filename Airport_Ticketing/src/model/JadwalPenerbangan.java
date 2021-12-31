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
    private Bandara bandaraAsal;
    private Bandara bandaraTujuan;
    private Pesawat pesawat;
    private String kelas;
    private int harga;

    public JadwalPenerbangan(int id, Date date, Bandara bandaraAsal, Bandara bandaraTujuan, Pesawat pesawat, String kelas, int harga) {
        this.id = id;
        this.date = date;
        this.bandaraAsal = bandaraAsal;
        this.bandaraTujuan = bandaraTujuan;
        this.pesawat = pesawat;
        this.kelas = kelas;
        this.harga = harga;
    }
    
    public JadwalPenerbangan(Date date, Bandara bandaraAsal, Bandara bandaraTujuan, Pesawat pesawat, String kelas, int harga) {
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

    public Bandara getBandaraAsal() {
        return bandaraAsal;
    }

    public void setBandaraAsal(Bandara bandaraAsal) {
        this.bandaraAsal = bandaraAsal;
    }

    public Bandara getBandaraTujuan() {
        return bandaraTujuan;
    }

    public void setBandaraTujuan(Bandara bandaraTujuan) {
        this.bandaraTujuan = bandaraTujuan;
    }

    public Pesawat getPesawat() {
        return pesawat;
    }

    public void setPesawat(Pesawat pesawat) {
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
