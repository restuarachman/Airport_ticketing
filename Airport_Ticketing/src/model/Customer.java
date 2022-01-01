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
public class Customer extends User{
    private int id;
    private String Nama;
    private String Alamat;
    private String nomor_hp;

    public Customer() {
    }
    
    public Customer(User user) {
        super(user);
    }
    
    public Customer(User user, String Nama, String Alamat, String nomor_hp) {
        super(user);
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.nomor_hp = nomor_hp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNomor_hp() {
        return nomor_hp;
    }

    public void setNomor_hp(String nomor_hp) {
        this.nomor_hp = nomor_hp;
    }
    public int getUserId() {
        return super.getId();
    }
    public void BayarTiket(){
        
    }
    public void OrderTiket(){
        
    }
    public void MemberiFeedback(){
        
    }
    
    public void getInfo() {
        System.out.println(getId());
        System.out.println(getUserId());
        System.out.println(Nama);
        System.out.println(nomor_hp);
        System.out.println(Alamat);
    }
}
