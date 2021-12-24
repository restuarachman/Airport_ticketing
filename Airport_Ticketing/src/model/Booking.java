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
    private Pesawat pesawat;

    public Booking() {
    }

    public Booking(int id, Pesawat pesawat) {
        this.id = id;
        this.pesawat = pesawat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pesawat getPesawat() {
        return pesawat;
    }

    public void setPesawat(Pesawat pesawat) {
        this.pesawat = pesawat;
    }
    
}
