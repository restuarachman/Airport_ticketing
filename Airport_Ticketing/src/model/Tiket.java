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
    private int idTiket;
    private String namaTiket;

    public Tiket() {
    }

    public Tiket(int idTiket, String namaTiket) {
        this.idTiket = idTiket;
        this.namaTiket = namaTiket;
    }

    public int getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(int idTiket) {
        this.idTiket = idTiket;
    }

    public String getNamaTiket() {
        return namaTiket;
    }

    public void setNamaTiket(String namaTiket) {
        this.namaTiket = namaTiket;
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
