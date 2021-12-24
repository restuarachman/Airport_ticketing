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
public class Payment {
    private int id;
    private int harga;
    private String status;

    public Payment() {
    }

    public Payment(int id, int harga, String status) {
        this.id = id;
        this.harga = harga;
        this.status = status;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setPayment(){
        
    }
    public void getPayment(){
        
    }
    public void showPayment(){
        
    }
}
