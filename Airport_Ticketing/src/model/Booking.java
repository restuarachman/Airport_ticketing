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
    private Customer customer;
    private int jumlahPenumpang;
    private int harga;
    public Booking() {
      
    }

    public Booking(int id, JadwalPenerbangan jadwal, Customer customer, int jumlahPenumpang, int harga) {
        this.id = id;
        this.jadwal = jadwal;
        this.customer = customer;
        this.jumlahPenumpang = jumlahPenumpang;
        this.harga = harga;
    }
    
    public Booking(JadwalPenerbangan jadwal, Customer customer, int jumlahPenumpang, int harga) {
        this.jadwal = jadwal;
        this.customer = customer;
        this.jumlahPenumpang = jumlahPenumpang;
        this.harga = harga;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void getInfo() {
        System.out.println(id);
        System.out.println(jadwal.getId());
        System.out.println(customer.getId());
        System.out.println(jumlahPenumpang);
        System.out.println(harga);
    }
    
}
