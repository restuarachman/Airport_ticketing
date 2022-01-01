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
    private Booking booking;

    public Tiket() {
    }

    public Tiket(int id, Booking booking) {
        this.id = id;
        this.kodeTiket = Integer.toString(this.id)+Integer.toString(booking.getId())+Integer.toString(booking.getCustomer().getId());
        this.booking = booking;
    }
    
    public Tiket(Booking booking) {
        this.kodeTiket = Integer.toString(this.id)+Integer.toString(booking.getId())+Integer.toString(booking.getCustomer().getId());
        this.booking = booking;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
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
