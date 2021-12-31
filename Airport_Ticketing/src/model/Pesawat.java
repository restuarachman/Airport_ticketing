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
public class Pesawat extends Kursi{
    private int id;
    private String kodePesawat;
    private String namaPesawat;
    private Kursi[] kursi = new Kursi[40];

    public Pesawat() {
    }

    public Pesawat(int id, String kodePesawat, String namaPesawat) {
        this.id = id;
        this.kodePesawat = kodePesawat;
        this.namaPesawat = namaPesawat;
    }
    
    public Pesawat(String kodePesawat, String namaPesawat) {
        this.kodePesawat = kodePesawat;
        this.namaPesawat = namaPesawat;
    }

    public Pesawat(String kodePesawat, String namaPesawat, int nomorKursi) {
        super(nomorKursi);
        this.kodePesawat = kodePesawat;
        this.namaPesawat = namaPesawat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodePesawat() {
        return kodePesawat;
    }

    public void setKodePesawat(String kodePesawat) {
        this.kodePesawat = kodePesawat;
    }

    public String getNamaPesawat() {
        return namaPesawat;
    }

    public void setNamaPesawat(String namaPesawat) {
        this.namaPesawat = namaPesawat;
    }

    public Kursi[] getKursi() {
        return kursi;
    }

    public void setKursi(Kursi[] kursi) {
        this.kursi = kursi;
    }
    
    public void pergi(){
        
    }
}
