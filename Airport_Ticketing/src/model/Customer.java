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
public class Customer {
    private String Nama;
    private String Alamat;
    private String NoHp;

    public Customer() {
    }

    public Customer(String Nama, String Alamat, String NoHp) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.NoHp = NoHp;
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

    public String getNoHp() {
        return NoHp;
    }

    public void setNoHp(String NoHp) {
        this.NoHp = NoHp;
    }
    
    public void BayarTiket(){
        
    }
    public void OrderTiket(){
        
    }
    public void MemberiFeedback(){
        
    }
}
