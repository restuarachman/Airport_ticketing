/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author restu
 */
public class TabelPenerbangan {
    private int  id;
    private String kodePesawat;
    private String namaPesawat;
    private String kelas;
    private int harga;

    public TabelPenerbangan(int id, String kodePesawat, String namaPesawat, String kelas, int harga) {
        this.id = id;
        this.kodePesawat = kodePesawat;
        this.namaPesawat = namaPesawat;
        this.kelas = kelas;
        this.harga = harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public TabelPenerbangan() {
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
