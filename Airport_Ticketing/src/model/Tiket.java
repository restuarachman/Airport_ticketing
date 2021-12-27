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
public class Tiket {
    private int id;
    private String kodeTiket;

    public Tiket() {
    }

    public Tiket(int id, User user, JadwalPenerbangan jadwal) {
        this.id = id;
        this.kodeTiket = Integer.toString(this.id)+Integer.toString(jadwal.getId())+Integer.toString(user.getId());
    }

    public int getId() {
        return id;
    }

    public void setId(int idTiket) {
        this.id = idTiket;
    }

    public String getKodeTiket() {
        return kodeTiket;
    }

    public void setKodeTiket(String namaTiket) {
        this.kodeTiket = namaTiket;
    }
    
    public void addTiket(){
        
    }
    public String getTiket(){
        return null;
    }
    public void removeTiket(){
        
    }
    public void showTiket(){
        
    }
}
