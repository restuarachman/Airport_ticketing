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
public class Bandara {
    private String kodeBandara;
    private String namaBandara;

    public Bandara() {
    }

    public Bandara(String kodeBandara, String namaBandara) {
        this.kodeBandara = kodeBandara;
        this.namaBandara = namaBandara;
    }

    public String getKodeBandara() {
        return kodeBandara;
    }

    public void setKodeBandara(String kodeBandara) {
        this.kodeBandara = kodeBandara;
    }

    public String getNamaBandara() {
        return namaBandara;
    }

    public void setNamaBandara(String namaBandara) {
        this.namaBandara = namaBandara;
    }
    
    public void tambahPesawat(){
        
    }
    public void hapusPesawat(){
        
    }
    public int getFee(){
        return 0;
    }
}