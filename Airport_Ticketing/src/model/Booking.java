/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class Booking {
    private int id;
    private JadwalPenerbangan jadwal;
    private User user;
    private int jumlahPenumpang;
    private String nama_penumpang;
    private String nomor_hp;
    private String alamat;
    private int harga;
    public Booking() {
      
    }

    public Booking(int id, JadwalPenerbangan jadwal, User user, int jumlahPenumpang, String nama_penumpang, String nomor_hp, String alamat, int harga) {
        this.id = id;
        this.jadwal = jadwal;
        this.user = user;
        this.jumlahPenumpang = jumlahPenumpang;
        this.nama_penumpang = nama_penumpang;
        this.nomor_hp = nomor_hp;
        this.alamat = alamat;
        this.harga = harga*jumlahPenumpang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama_penumpang() {
        return nama_penumpang;
    }

    public void setNama_penumpang(String nama_penumpang) {
        this.nama_penumpang = nama_penumpang;
    }

    public String getNomor_hp() {
        return nomor_hp;
    }

    public void setNomor_hp(String nomor_hp) {
        this.nomor_hp = nomor_hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JadwalPenerbangan getJadwal() {
        return jadwal;
    }

    public void setJadwal(JadwalPenerbangan jadwal) {
        this.jadwal = jadwal;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    
    
}
